package fr.univtours.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUtilisateur;
    private String prenom;
    private String nom;
    private String pseudo;
    private String motDePasse;
    private String role;

    @OneToMany(mappedBy = "utilisateur")
    private Collection<Tiquet> tiquets;

    public Utilisateur() {

    }

    public Utilisateur(int idUtilisateur, String prenom, String nom, String pseudo, String motDePasse, String role) {
        this.idUtilisateur = idUtilisateur;
        this.prenom = prenom;
        this.nom = nom;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
