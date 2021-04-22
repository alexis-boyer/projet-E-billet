package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Evenement;

import java.util.List;

public interface IEvenement {

    public Evenement save (Evenement e);
    public List<Evenement> findAll();
    public Evenement find(int id);
    public Evenement update(Evenement e);
    public List<Evenement> findByArtiste(String s);
    public List<Evenement> findByDate(String s);
    public List<Evenement> findByLocation(String s);
    public void delete(int id);

}
