package fr.univtours.projet.form;

public class LoginForm {

    private String pseudo;
    private String motDePasse;

    public LoginForm() {super();}

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
}
