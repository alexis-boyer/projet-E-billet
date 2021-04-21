package fr.univtours.projet.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Artiste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nom;

    @ManyToMany(mappedBy = "Artistes")
    private Collection<Evenement> evenements;

    public Artiste() {
    }

    public Artiste(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
