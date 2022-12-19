package it.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.ContrattoDipendente;
import it.app.model.DipendenteProfilo;
@Repository
public interface DipendenteProfiloRepository extends CrudRepository<DipendenteProfilo, Integer>{


	@Query(value = "SELECT c FROM profilo c  WHERE c.username = :codiceFiscale")
    DipendenteProfilo findByUsername(String codiceFiscale);
	List<DipendenteProfilo>findAll();
	@Transactional
	@Query(value = "DELETE c FROM profilo c  WHERE c.username = :codiceFiscale")
	void deleteByUsername(String codiceFiscale);
}
