package fr.univtours.projet.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ticket implements Serializable {

    @Id
    @GeneratedValue
    private int idTiquet;

    @ManyToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idEvenement")
    private Evenement evenement;
    @ManyToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    public Ticket() {
    }

    public Ticket(Evenement idEvenement, Utilisateur utilisateur) {
        this.evenement = idEvenement;
        this.utilisateur = utilisateur;
    }

    public int getIdTiquet() {
        return idTiquet;
    }

    public void setIdTiquet(int id) {
        this.idTiquet = id;
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
