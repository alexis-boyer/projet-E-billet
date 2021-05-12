package fr.univtours.projet;

import fr.univtours.projet.service.InitEbillet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetApplication implements CommandLineRunner {


    @Autowired
    InitEbillet initEbillet;

    @Autowired
    public static void main(String[] args) {

        SpringApplication.run(ProjetApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        initEbillet.initArtistes();
        initEbillet.initEvenements();
        initEbillet.initTickets();
        initEbillet.initUtilisateurs();
    }
}
