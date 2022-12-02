package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.StoricoLavoro;

@Repository
public interface StoricoLavoroRepository extends CrudRepository<StoricoLavoro, Integer>{

}
