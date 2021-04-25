package fr.univtours.projet.service;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Ticket;
import fr.univtours.projet.entities.Utilisateur;

import java.util.ArrayList;

public class InitEbilletDatas {

    ArrayList<Artiste> artistes = new ArrayList<Artiste>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    ArrayList<Evenement> evenements = new ArrayList<Evenement>();

    // Artiste
    Artiste a1;
    Artiste a2;

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
        return utilisateurs;
    }
    protected ArrayList<Evenement> getEvenementsList(){
        return evenements;
    }


}
