package fr.univtours.projet.entities;

import javax.persistence.*;

@Entity
public class Tiquet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idEvenement")
    private Evenement evenement;
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    public Tiquet() {
    }

    public Tiquet(int id, Evenement idEvenement, Utilisateur utilisateur) {
        this.id = id;
        this.evenement = idEvenement;
        this.utilisateur = utilisateur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement idEvenement) {
        this.evenement = idEvenement;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
