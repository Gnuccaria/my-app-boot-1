package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.Rapportino;

@Repository
public interface RapportinoRepository extends CrudRepository<Rapportino, Integer> {

}
