package fr.univtours.projet.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEvenement;


    private int places;
    private String emplacement;
    private String type;
    private String date;
    private String prix;

    @OneToMany(mappedBy = "evenement")
    private Collection<Tiquet> tiquets;

    @ManyToMany(mappedBy = "evenements")
    private Collection<Artiste> artistes;

    public Evenement() {
    }

    public Evenement(int id, int places, String emplacement, String type, String date, String prix) {
        this.idEvenement = id;
        this.places = places;
        this.emplacement = emplacement;
        this.type = type;
        this.date = date;
        this.prix = prix;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int id) {
        this.idEvenement = id;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
