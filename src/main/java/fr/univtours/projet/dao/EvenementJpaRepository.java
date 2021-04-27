package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EvenementJpaRepository extends JpaRepository<Evenement, Integer> {


}
