package fr.univtours.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artiste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArtiste;

    private String nom;

    @ManyToMany
    @JoinTable( name = "Participe",
            joinColumns = @JoinColumn( name = "idArtiste" ),
            inverseJoinColumns = @JoinColumn( name = "idEvenement" ) )
    private Set<Evenement> evenements = new HashSet<>();

    public Artiste() {
    }

    public Artiste(String nom) {
        this.nom = nom;
    }

    public int getIdArtiste() {
        return idArtiste;
    }

    public void setIdArtiste(int id) {
        this.idArtiste = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(Set<Evenement> evenements) {
        this.evenements = evenements;
    }

    public void addToEvent(Evenement e) {
        evenements.add(e);
    }

    @Override
    public String toString() {
        return "Artiste{" +
                "idArtiste=" + idArtiste +
                ", nom='" + nom + '\'' +
                '}';
    }
}
