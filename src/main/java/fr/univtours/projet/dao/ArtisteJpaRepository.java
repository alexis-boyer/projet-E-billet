package fr.univtours.projet.dao;

import fr.univtours.projet.entities.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArtisteJpaRepository extends JpaRepository<Artiste, Integer> {
}
