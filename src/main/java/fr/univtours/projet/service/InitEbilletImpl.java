package fr.univtours.projet.service;

import fr.univtours.projet.dao.ArtisteJpaRepository;
import fr.univtours.projet.dao.EvenementJpaRepository;
import fr.univtours.projet.dao.TicketJpaRepository;
import fr.univtours.projet.dao.UtilisateurJpaRepository;
import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Ticket;
import fr.univtours.projet.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class InitEbilletImpl implements InitEbillet {

    @Autowired
    ArtisteJpaRepository artisteRep;
    @Autowired
    TicketJpaRepository ticketRep;
    @Autowired
    UtilisateurJpaRepository utilisateurRep;
    @Autowired
    EvenementJpaRepository evenementRep;



    InitEbilletDatas datas = new InitEbilletDatas();

    @Override
    public void initArtistes() {
        ArrayList<Artiste> aList = datas.getArtistesList();
        for (Artiste a : aList) {
            artisteRep.save(a);
        }
    }

    @Override
    public void initEvenements() {
        ArrayList<Evenement> eList = datas.getEvenementsList();
        for (Evenement e : eList) {
            evenementRep.save(e);
        }
    }

    @Override
    public void initTickets() {
        ArrayList<Ticket> tList = datas.getTicketsList();
        for (Ticket t : tList) {
            ticketRep.save(t);
        }
    }

    @Override
    public void initUtilisateurs() {
        ArrayList<Utilisateur> uList = datas.getUtilisateursList();
        for (Utilisateur u : uList) {
            utilisateurRep.save(u);
        }
    }
}
