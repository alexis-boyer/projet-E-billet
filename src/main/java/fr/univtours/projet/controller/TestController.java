package fr.univtours.projet.controller;

import fr.univtours.projet.dao.ArtisteJpaRepository;
import fr.univtours.projet.entities.Artiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    ArtisteJpaRepository artisteRep;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testAfficherArtiste(Model model) {

        List<Artiste> list = artisteRep.findAll();

        model.addAttribute("ArtisteList",list);

        return "test";


    }
}
