package fr.univtours.projet.service;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Ticket;
import fr.univtours.projet.entities.Utilisateur;

import java.util.ArrayList;
import java.util.HashSet;

public class InitEbilletDatas {

    ArrayList<Artiste> artistes = new ArrayList<Artiste>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    ArrayList<Evenement> evenements = new ArrayList<Evenement>();

    Artiste a1 = new Artiste("Jul");
    Artiste a2 = new Artiste("Michael Jordan");
    Artiste a3 = new Artiste("Elvis Presley");
    Artiste a4 = new Artiste("Michael Jackson");
    Artiste a5 = new Artiste("Céline Dion");
    Artiste a6 = new Artiste("Bob Marley");
    Artiste a7 = new Artiste("Stevie Wonder");
    Artiste a8 = new Artiste("James Brown");
    Artiste a9 = new Artiste("Aretha Franklin");
    Artiste a10 = new Artiste("Ray Charles");
    Artiste a11 = new Artiste("Sam Cooke");
    Artiste a12 = new Artiste("John Lennon");
    Artiste a13 = new Artiste("Marvin Gaye");
    Artiste a14 = new Artiste("Bob Dylan");
    Artiste a15 = new Artiste("Otis Redding");
    Artiste a16 = new Artiste("Stevie Wonder");
    Artiste a17 = new Artiste("Chris Brown");
    Artiste a18 = new Artiste("Soprano");
    Artiste a19 = new Artiste("Abou Tall");
    Artiste a20 = new Artiste("Gim's");
    Artiste a21 = new Artiste("Tayc");
    Artiste a22 = new Artiste("Dadju");
    Artiste a23 = new Artiste("Slimane");
    Artiste a24 = new Artiste("Youssoupha");
    Artiste a25 = new Artiste("Kery James");
    Artiste a26 = new Artiste("Amel Bent");
    Artiste a27 = new Artiste("Black M");
    Artiste a28 = new Artiste("Imen");
    Artiste a29 = new Artiste("Vita");
    Artiste a30 = new Artiste("Franck");
    Artiste adama = new Artiste("Adama AKA Yoba");
    Artiste alexis = new Artiste("Alexis AKA KillerDu79");
    Artiste hakim = new Artiste("Hakim AKA Zurkon Sama");


    // Ticket

    // Utilisateur
    Utilisateur u1;
    Utilisateur u2;
    Utilisateur u3;


    // Evenement
    Evenement e1;
    Evenement e2;
    Evenement e3;
    Evenement e4;
    Evenement e5;
    Evenement e6;
    Evenement e7;
    Evenement e8;
    Evenement e9;
    Evenement e10;
    Evenement e11;
    Evenement e12;
    Evenement e13;
    Evenement e14;
    Evenement e15;
    Evenement e16;
    Evenement e17;
    Evenement e18;
    Evenement e19;
    Evenement e20;


    protected ArrayList<Artiste> getArtistesList() {

        return artistes;

    }

    protected ArrayList<Ticket> getTicketsList() {

        return tickets;

    }

    protected ArrayList<Utilisateur> getUtilisateursList() {

        u1 = new Utilisateur("Zinedine", "Zidane", "Meilleur", "Joueur", "Admin");
        u2 = new Utilisateur("client", "client", "client", "client", "Client");
        u3 = new Utilisateur("admin", "admin", "admin", "admin", "Admin");

        utilisateurs.add(u1);
        utilisateurs.add(u2);
        utilisateurs.add(u3);

        return utilisateurs;
    }

    protected ArrayList<Evenement> getEvenementsList() {
        e1 = new Evenement(1, "Paris", "Showcase", "20/05/2021", 125);
        e2 = new Evenement(2, "Guingamp", "One Man Show", "28/05/2022", 0.50);
        e3 = new Evenement(60, "Tours", "Street Art Cinema", "01/06/2021", 1.30);
        e4 = new Evenement(90, "Angers", "City of Gold Art Festival", "20/06/2021", 5.50);
        e5 = new Evenement(200, "Bordeaux", "The big Picture Festival", "05/07/2021", 4.90);
        e6 = new Evenement(140, "Paris", "Graffiti fest", "15/07/2021", 6);
        e7 = new Evenement(65, "Orleans", "The Game Day", "23/07/2021", 3);
        e8 = new Evenement(120, "Limoge", "Big show", "29/07/2021", 13);
        e9 = new Evenement(99, "Rennes", "Graffiti Night", "03/08/2021", 1.80);
        e10 = new Evenement(260, "Reims", "Skatt Day", "06/08/2021", 2.30);
        e11 = new Evenement(30, "Caen", "La Street française", "10/08/2021", 1.30);
        e12 = new Evenement(80, "Blois", "Meeting of Styles", "18/08/2021", 130);
        e13 = new Evenement(40, "Marseille", "Karaoké", "25/08/2021", 10);
        e14 = new Evenement(174, "Lyon", "Brazile show", "29/08/2021", 30);
        e15 = new Evenement(210, "Lille", "China Town", "05/09/2021", 230);
        e16 = new Evenement(68, "Brest", "Tour de Wall", "09/09/2021", 20);
        e17 = new Evenement(98, "Toulouse", "Digital Graffiti", "12/09/2021", 70);
        e18 = new Evenement(70, "Evry", "Feu d'artifice", "17/09/2021", 0.10);
        e19 = new Evenement(48, "Poitiers", "Street Dance", "27/09/2021", 2);
        e20 = new Evenement(700, "Havre", "Big Diner", "01/11/2021", 100);

        HashSet<Artiste> hs1 = new HashSet<Artiste>();
        hs1.add(adama);
        hs1.add(hakim);
        e1.setArtistes(hs1);

        HashSet<Artiste> hs2 = new HashSet<>();
        hs2.add(alexis);
        hs2.add(adama);
        e2.setArtistes(hs2);

        HashSet<Artiste> hs3 = new HashSet<>();
        hs3.add(a1);
        hs3.add(a2);
        hs3.add(a3);
        hs3.add(a4);
        e3.setArtistes(hs3);



        HashSet<Artiste> hs4 = new HashSet<>();
        hs4.add(a5);
        hs4.add(a6);
        hs4.add(a7);
        hs4.add(a8);
        hs4.add(a9);
        hs4.add(a10);
        e4.setArtistes(hs4);



        HashSet<Artiste> hs5 = new HashSet<>();
        hs5.add(a11);
        hs5.add(a12);
        hs5.add(a13);
        hs5.add(a14);
        hs5.add(a15);
        e5.setArtistes(hs5);


        HashSet<Artiste> hs6 = new HashSet<>();
        hs6.add(a16);
        hs6.add(a17);
        hs6.add(a18);
        hs6.add(a19);
        hs6.add(a20);
        e6.setArtistes(hs6);

        HashSet<Artiste> hs7 = new HashSet<>();
        hs7.add(a21);
        hs7.add(a22);
        hs7.add(a23);
        hs7.add(a24);
        hs7.add(a25);
        e7.setArtistes(hs7);


        HashSet<Artiste> hs8 = new HashSet<>();
        hs8.add(a26);
        hs8.add(a27);
        hs8.add(a28);
        hs8.add(a29);
        hs8.add(a30);
        e8.setArtistes(hs8);


        HashSet<Artiste> hs9 = new HashSet<>();
        hs9.add(a16);
        hs9.add(a20);
        hs9.add(a11);
        hs9.add(a7);
        hs9.add(a30);
        e9.setArtistes(hs9);

        HashSet<Artiste> hs10 = new HashSet<>();
        hs10.add(a16);
        hs10.add(a20);
        hs10.add(a11);
        hs10.add(a7);
        hs10.add(a30);
        e10.setArtistes(hs10);


        evenements.add(e1);
        evenements.add(e2);
        evenements.add(e3);
        evenements.add(e4);
        evenements.add(e5);
        evenements.add(e6);
        evenements.add(e7);
        evenements.add(e8);
        evenements.add(e9);
        evenements.add(e10);
        return evenements;
    }


}
