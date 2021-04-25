package fr.univtours.projet.controller;

import fr.univtours.projet.dao.UtilisateurJpaRepository;
import fr.univtours.projet.entities.Utilisateur;
import fr.univtours.projet.form.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ConnexionController {

    @Autowired
    UtilisateurJpaRepository utilisateurRep;

    @RequestMapping(value = {"/login", "/admin"}, method = RequestMethod.GET)
    public String afficherPageDeConnexion() {
        return "connexion";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {

        List<Utilisateur> list = utilisateurRep.findAll();

        String login = loginForm.getLogin();
        String motDePasse = loginForm.getPassword();

        for (Utilisateur u : list) {
            if(u.getPseudo().equals(login) && u.getMotDePasse().equals(motDePasse)) {

                return "AjoutBillet";

            }
        }

        model.addAttribute("invalidCredentials",true);
        return "connexion";

    }
}

