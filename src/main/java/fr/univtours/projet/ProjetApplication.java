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

        /*ApplicationContext ctx = SpringApplication.run(ProjetApplication.class, args);

        IEvenement evenementDAO = ctx.getBean(IEvenement.class);
        IArtiste artisteDAO = ctx.getBean(IArtiste.class);

        Artiste jul = new Artiste("Jul");
        Artiste mj = new Artiste("Michael Jordan");
        artisteDAO.save(jul);
        artisteDAO.save(mj);

		*//*
		Affichage des artistes
		 *//*

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
*/



    }


    @Override
    public void run(String... args) throws Exception {
        initEbillet.initArtistes();
        initEbillet.initEvenements();
        initEbillet.initTickets();
        initEbillet.initUtilisateurs();
    }
}
