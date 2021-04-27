package fr.univtours.projet.form;

import java.util.ArrayList;

public class EvenementForm {

    public Integer idEvenement;
    public String emplacement;
    public String type;
    public String date;
    public String artiste;

    public EvenementForm(String emplacement, String type, String date, String artiste) {
        this.emplacement = emplacement;
        this.type = type;
        this.date = date;
        this.artiste = artiste;
    }

    public EvenementForm() {
    }

    public Integer getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(Integer idEvenement) {
        this.idEvenement = idEvenement;
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

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }
}
