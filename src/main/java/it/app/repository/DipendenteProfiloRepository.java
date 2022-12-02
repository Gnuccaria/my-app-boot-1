package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.DipendenteProfilo;
@Repository
public interface DipendenteProfiloRepository extends CrudRepository<DipendenteProfilo, Integer>{

}
