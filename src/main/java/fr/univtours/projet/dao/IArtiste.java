package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;

import java.util.List;

public interface IArtiste {

    public Artiste save(Artiste a);
    public List<Artiste> findAll();
    public Artiste update(Artiste a);
    public void delete(int id);
}
