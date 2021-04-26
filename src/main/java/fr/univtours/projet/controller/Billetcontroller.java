package fr.univtours.projet.controller;

import fr.univtours.projet.dao.EvenementJpaRepository;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.form.EvenementForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Billetcontroller {

    @Autowired
    EvenementJpaRepository evenementRep;

    @RequestMapping(value = "/admin/billet")
    public String index(Model model) {
        model.addAttribute("eventList", evenementRep.findAll());
        return "AjoutBillet";
    }

    @RequestMapping(value = "/admin/addEvent", method = RequestMethod.POST)
    public String ajouterEvenement(@ModelAttribute(name = "evenementForm") EvenementForm evenementForm, Model model) {

        String emplacement = evenementForm.getEmplacement();
        String date = evenementForm.getDate();
        String type = evenementForm.getType();

        Evenement evenement = new Evenement(111, emplacement, type, date, 111);
        evenementRep.save(evenement);

        model.addAttribute("EventList", evenementRep.findAll());

        return "AjoutBillet";
    }

    @RequestMapping("/admin/modifyEventForm")
    public String afficherModifierEvenement( @RequestParam int ref, Model model) {

        model.addAttribute("eventToModify", evenementRep.findById(ref).get());
        model.addAttribute("eventList", evenementRep.findAll());

        return "ModifierBillet";

    }

    @RequestMapping(value = {"/admin/modifyEvent"})
    public String modifierEvenement(@ModelAttribute(name="evenementForm") EvenementForm evenementForm, Model model) {

        Evenement evenement = evenementRep.findById(evenementForm.getIdEvenement()).get();

        evenement.setEmplacement(evenementForm.getEmplacement());
        evenement.setDate(evenementForm.getDate());
        evenement.setType(evenementForm.getType());

        evenementRep.save(evenement);

        model.addAttribute("EventList", evenementRep.findAll());
        return "AjoutBillet";

    }

    @RequestMapping(value = {"/admin/deleteEvent"})
    public String supprEvenement(@RequestParam int ref, Model model) {
        // todo : verifier pourquoi supprimer un element en supprime deux ?
        System.out.println(evenementRep.findById(ref));
        evenementRep.deleteById(ref);
        model.addAttribute("EventList", evenementRep.findAll());
        return "AjoutBillet";


    }

}


