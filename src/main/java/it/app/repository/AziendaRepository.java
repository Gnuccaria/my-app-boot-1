package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.AziendaDipendente;
@Repository
public interface AziendaRepository extends CrudRepository<AziendaDipendente, Integer> {

}
