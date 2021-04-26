package fr.univtours.projet.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Evenement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvenement;


    private int places;
    private String emplacement;
    private String type;
    private String date;
    private double prix;

    @OneToMany(mappedBy = "evenement",fetch=FetchType.LAZY)
    private Set<Ticket> tickets = new HashSet<>();

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable( name = "Participe",
            joinColumns = @JoinColumn( name = "idEvenement" ),
            inverseJoinColumns = @JoinColumn( name = "idArtiste" ) )
    private Set<Artiste> artistes = new HashSet<>();

    public Evenement() {
    }

    public Evenement(int places, String emplacement, String type, String date, double prix) {
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Set<Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(Set<Artiste> artistes) {
        this.artistes = artistes;
    }

    public void addArtiste(Artiste a) {
        artistes.add(a);
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "idEvenement=" + idEvenement +
                ", places=" + places +
                ", emplacement='" + emplacement + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", prix=" + prix + "€" +
                '}';
    }
}
