package fr.univtours.projet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcceuilController {

    // C'est la page de base, l'index de l'application
    @GetMapping("/")
    public String getHomePage() {
        return "acceuil.html";
    }

}
