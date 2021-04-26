package fr.univtours.projet.controller;

import fr.univtours.projet.dao.EvenementJpaRepository;
import fr.univtours.projet.entities.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AcceuilController {

    @Autowired
    EvenementJpaRepository evenementRepo;

    // C'est la page de base, l'index de l'application
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String getHomePage(Model model) {

        List<Evenement> list = evenementRepo.findAll();

        model.addAttribute("EventList", list);

        return "acceuil.html";
    }

}
