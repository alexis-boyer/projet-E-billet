package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Ticket;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TicketImpl implements ITicket{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Ticket save(Ticket t) {
        em.persist(t);
        return t;
    }

    @Override
    public List<Ticket> findAll() {
        Query q = em.createQuery("SELECT t FROM Ticket t");
        return q.getResultList();
    }

    @Override
    public Ticket update(Ticket t) {
        em.merge(t);
        return t;
    }

    @Override
    public void delete(int id) {
        Ticket toDelete = em.find(Ticket.class, id);
        em.remove(toDelete);
    }
}
