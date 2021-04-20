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
public class ConnectionController {

    @Autowired
    UtilisateurJpaRepository utilisateurRep;

    // C'est la page a laquelle on accede par l'url /login ou /admin
    @RequestMapping(value={ "/login","/admin" }, method= RequestMethod.GET)
    public String getLoginForm() {
        return "connection";
    }

    @RequestMapping(value="/admin/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginForm")LoginForm loginForm, Model model) {
        List<Utilisateur> listUtilisateur = utilisateurRep.findAll();

    String pseudo = loginForm.getPseudo();
    String motDePasse = loginForm.getMotDePasse();

        for (Utilisateur user : listUtilisateur) {
            if (user.getPseudo().equals(pseudo) && user.getMotDePasse().equals(motDePasse)) {

            }
        }

    model.addAttribute("invalidCredentials", true);
    return "connection";

    }



}


