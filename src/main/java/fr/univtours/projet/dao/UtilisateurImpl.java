package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Utilisateur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UtilisateurImpl implements IUtilisateur{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Utilisateur save(Utilisateur u) {
        em.persist(u);
        return u;
    }

    @Override
    public List<Utilisateur> findAll() {
        Query q = em.createQuery("SELECT u FROM Utilisateur u");
        return q.getResultList();
    }

    @Override
    public Utilisateur update(Utilisateur u) {
        em.merge(u);
        return u;
    }

    @Override
    public void delete(int id) {
        Utilisateur toDelete = em.find(Utilisateur.class, id);
        em.remove(toDelete);
    }
}
