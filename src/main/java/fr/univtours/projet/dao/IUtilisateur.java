package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Utilisateur;

import java.util.List;

public interface IUtilisateur {

    public Utilisateur save(Utilisateur u);
    public List<Utilisateur> findAll();
    public Utilisateur update(Utilisateur u);
    public void delete(int id);
}
