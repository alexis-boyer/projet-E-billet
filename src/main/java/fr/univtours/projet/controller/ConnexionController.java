package fr.univtours.projet.controller;

import fr.univtours.projet.dao.ArtisteJpaRepository;
import fr.univtours.projet.dao.EvenementJpaRepository;
import fr.univtours.projet.dao.UtilisateurJpaRepository;
import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Utilisateur;
import fr.univtours.projet.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ConnexionController {

    @Autowired
    UtilisateurJpaRepository utilisateurRep;

    @Autowired
    EvenementJpaRepository evenementRep;

    @Autowired
    ArtisteJpaRepository artisteRep;

    @RequestMapping(value = {"/login", "/admin"}, method = RequestMethod.GET)
    public String afficherPageDeConnexion() {
        return "connexion";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model, HttpServletRequest request) {

        List<Utilisateur> UtilisateurList = utilisateurRep.findAll();

        String login = loginForm.getLogin();
        String motDePasse = loginForm.getPassword();

        for (Utilisateur u : UtilisateurList) {
            if(u.getPseudo().equals(login) && u.getMotDePasse().equals(motDePasse)) {

                List<Artiste> artisteList = artisteRep.findAll();
                model.addAttribute("ArtisteList", artisteList);

                List<Evenement> evenementList = evenementRep.findAll();
                model.addAttribute("EventList", evenementList);

                request.getSession().setAttribute("Utilisateur", u);

                System.out.println(u.toString());

                if(u.getRole().equals("Admin")) {

                    return "AjoutBillet";
                }
                else return "rechercheBillet";
            }
        }

        model.addAttribute("invalidCredentials",true);
        return "connexion";

    }
}

