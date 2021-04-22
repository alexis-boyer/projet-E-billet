package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ArtisteImpl implements IArtiste{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Artiste save(Artiste a) {
        em.persist(a);
        return a;
    }

    @Override
    public List<Artiste> findAll() {
        Query q = em.createQuery("SELECT a from Artiste a");
        return q.getResultList();
    }

    @Override
    public Artiste update(Artiste a) {
        em.merge(a);
        return a;
    }

    @Override
    public void delete(int id) {
        Artiste toDelete = em.find(Artiste.class, id);
        em.remove(toDelete);
    }
}
