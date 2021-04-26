package fr.univtours.projet.form;

import java.util.ArrayList;

public class EvenementForm {

    public Integer idEvenement;
    public String emplacement;
    public String type;
    public String date;
    public ArrayList<String> artistes;

    public EvenementForm(String emplacement, String type, String date, ArrayList<String> artistes) {
        this.emplacement = emplacement;
        this.type = type;
        this.date = date;
        this.artistes = artistes;
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

    public ArrayList<String> getArtistes() {
        return artistes;
    }

    public void setArtistes(ArrayList<String> artistes) {
        this.artistes = artistes;
    }
}
