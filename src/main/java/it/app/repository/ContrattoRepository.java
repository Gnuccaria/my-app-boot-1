package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.ContrattoDipendente;
@Repository
public interface ContrattoRepository extends CrudRepository<ContrattoDipendente,Integer> {

}
