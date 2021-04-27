package fr.univtours.projet.controller;

import fr.univtours.projet.dao.ArtisteJpaRepository;
import fr.univtours.projet.dao.EvenementJpaRepository;
import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.form.EvenementForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashSet;

@Controller
public class Billetcontroller {

    @Autowired
    EvenementJpaRepository evenementRep;

    @Autowired
    ArtisteJpaRepository artisteRep;

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
        String artiste = evenementForm.getArtiste();

        HashSet<Artiste> artisteList = new HashSet<Artiste>();
        artisteList.add(new Artiste(artiste));

        Evenement evenement = new Evenement(111, emplacement, type, date, 111);
        evenement.setArtistes(artisteList);
        System.out.println(artisteList);
        System.out.println(evenement.toString());
        evenementRep.save(evenement);

        model.addAttribute("EventList", evenementRep.findAll());
        model.addAttribute("ArtisteList", artisteRep.findAll());

        return "AjoutBillet";
    }

    @RequestMapping("/admin/modifyEventForm")
    public String afficherModifierEvenement(@RequestParam int ref, Model model) {

        model.addAttribute("eventToModify", evenementRep.findById(ref).get());
        model.addAttribute("eventList", evenementRep.findAll());

        return "ModifierBillet";

    }

    @RequestMapping(value = {"/admin/modifyEvent"})
    public String modifierEvenement(@ModelAttribute(name = "evenementForm") EvenementForm evenementForm, Model model) {

        Evenement evenement = evenementRep.findById(evenementForm.getIdEvenement()).get();

        evenement.setEmplacement(evenementForm.getEmplacement());
        evenement.setDate(evenementForm.getDate());
        evenement.setType(evenementForm.getType());

        HashSet<Artiste> hs = new HashSet<Artiste>();
        hs.add(new Artiste(evenementForm.getArtiste()));
        evenement.setArtistes(hs);

        evenementRep.save(evenement);

        model.addAttribute("EventList", evenementRep.findAll());
        model.addAttribute("ArtisteList", artisteRep.findAll());
        return "AjoutBillet";

    }

    @RequestMapping("/admin/deleteEvent")
    public String supprEvenement(@RequestParam int ref, Model model) {
        // todo : verifier pourquoi supprimer un element en supprime deux ?
//        System.out.println(evenementRep.findById(ref) + "    " + ref);
        evenementRep.deleteById(ref);
        model.addAttribute("EventList", evenementRep.findAll());
        return "AjoutBillet";

    }

    @RequestMapping("/research")
    public String rechercheEvenement(@ModelAttribute(name = "evenementForm") EvenementForm evenementForm, Model model) {

        String type = evenementForm.getType();
        String emplacement = evenementForm.getEmplacement();
        String date = evenementForm.getDate();

        if (emplacement != null) {
// TODO: 27/04/2021 rechercher dans la liste d'event ceux avec le parametre emplacement
        } else if (date != null) {
// TODO: 27/04/2021 rechercher dans la liste d'event ceux avec le parametre date
        } else if (type != null) {
// TODO: 27/04/2021 rechercher dans la liste d'event ceux avec le parametre type
        }

        return "rechercheBillet";
    }

}


