package fr.univtours.projet;

import fr.univtours.projet.dao.IArtiste;
import fr.univtours.projet.dao.IEvenement;
import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class ProjetApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProjetApplication.class, args);

        IEvenement evenementDAO = ctx.getBean(IEvenement.class);
        IArtiste artisteDAO = ctx.getBean(IArtiste.class);

        Artiste jul = new Artiste("Jul");
        Artiste mj = new Artiste("Michael Jordan");
        artisteDAO.save(jul);
        artisteDAO.save(mj);

		/*
		Affichage des artistes
		 */

        System.out.println("**** Find all ****");
        List<Artiste> LA = artisteDAO.findAll();
        for (Artiste a : LA
        ) {
            System.out.println("Artiste : " + a.getNom());
        }

        Evenement event0 = new Evenement(500, "Bercy", "Concert", "12/12/12", 75);
        Evenement event1 = new Evenement(650, "Hotel Accord Arena", "Concert", "24/12/1994", 20);
        Evenement event2 = new Evenement(2000, "Stade de France", "Match", "30/03/1999", 500);
        evenementDAO.save(event0);
        evenementDAO.save(event1);
        evenementDAO.save(event2);


        jul.getEvenements().add(event0);
        jul.getEvenements().add(event1);

        mj.getEvenements().add(event2);

        System.out.println("Jul participe à " + jul.getEvenements().size() + " evenement(s).");
        System.out.println("Mj participe à " + mj.getEvenements().size() + " evenement(s).");

        event0.getArtistes().add(jul);

        Artiste queen = new Artiste("Queen");
        event0.getArtistes().add(queen);


        for (Artiste a: event0.getArtistes()) {
            System.out.println(a.toString());
        }



    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
