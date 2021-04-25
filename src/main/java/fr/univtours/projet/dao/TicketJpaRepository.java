package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import fr.univtours.projet.entities.Evenement;
import fr.univtours.projet.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketJpaRepository extends JpaRepository<Ticket, Integer> {
}
