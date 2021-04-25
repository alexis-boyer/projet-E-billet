package fr.univtours.projet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnexionController {

    @RequestMapping(value = {"/", "/login", "/admin"}, method = RequestMethod.GET)
    public String afficherPageDeConnexion() {
        return "connexion";
    }

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String testAfficherArtiste(Model model) {


        return "test";


    }

}

