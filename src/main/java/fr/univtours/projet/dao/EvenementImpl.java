package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Evenement;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EvenementImpl implements IEvenement {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Evenement save(Evenement e) {
        em.persist(e);
        return e;
    }

    @Override
    public List<Evenement> findAll() {
        Query q = em.createQuery("Select e from Evenement e");
        return q.getResultList();
    }

    @Override
    public Evenement find(int id) {
        Evenement e = em.find(Evenement.class, id);
        return e;
    }

    @Override
    public Evenement update(Evenement e) {
        em.merge(e);
        return e;
    }

    @Override
    public List<Evenement> findByArtiste(String s) {
        return null;
    }

    @Override
    public List<Evenement> findByDate(String s) {
        return null;
    }

    @Override
    public List<Evenement> findByLocation(String s) {
        Query q = em.createQuery("SELECT e FROM Evenement e WHERE e.emplacement like :x");
        q.setParameter("x", "s");
        return q.getResultList();
    }

    @Override
    public void delete(int id) {
        Evenement e = em.find(Evenement.class, id);
        em.remove(e);
    }
}
