package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Ticket;

import java.util.List;

public interface ITicket {

    public Ticket save(Ticket t);
    public List<Ticket> findAll();
    public Ticket update(Ticket t);
    public void delete(int id);
}
