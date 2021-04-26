package fr.univtours.projet.service;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Ticket;
import fr.univtours.projet.entities.Utilisateur;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InitEbilletDatas {

    ArrayList<Artiste> artistes = new ArrayList<Artiste>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    ArrayList<Evenement> evenements = new ArrayList<Evenement>();

    // Artiste
    Artiste a1;
    Artiste a2;
    Artiste adama = new Artiste("Adama AKA Yoba");
    Artiste alexis = new Artiste("Alexis AKA KillerDu79");

    // Ticket

    // Utilisateur
    Utilisateur u1;
    Utilisateur u2;
    Utilisateur u3;


    // Evenement
    Evenement e1;
    Evenement e2;



    protected ArrayList<Artiste> getArtistesList() {

        a1 = new Artiste("Jul");
        a2 = new Artiste("Michael Jordan");

        artistes.add(a1);
        artistes.add(a2);

        return artistes;

    }

    protected ArrayList<Ticket> getTicketsList(){

        return tickets;

    }
    protected ArrayList<Utilisateur> getUtilisateursList(){

        u1 = new Utilisateur("Alexis", "Boyer", "killerDu79", "pasouflemec","Client");
        u2 = new Utilisateur("Zinedine", "Zidane", "Meilleur", "Joueur", "Admin");
        u3 = new Utilisateur("admin", "admin", "admin", "admin", "Admin");

        utilisateurs.add(u1);
        utilisateurs.add(u2);
        utilisateurs.add(u3);

        return utilisateurs;
    }
    protected ArrayList<Evenement> getEvenementsList(){
        e1 = new Evenement(1000, "Paris", "Showcase", "30/07/2021", 125);
        e2 = new Evenement(6, "Guingamp", "One Man Show", "01/04/2022", 0.50);

        HashSet<Artiste> hs1 = new HashSet<Artiste>();
        hs1.add(adama);
        e1.setArtistes(hs1);

        HashSet<Artiste> hs2 = new HashSet<>();
        hs2.add(alexis);
        hs2.add(adama);
        e2.setArtistes(hs2);

        evenements.add(e1);
        evenements.add(e2);
        return evenements;
    }


}
