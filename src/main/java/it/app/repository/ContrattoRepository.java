package it.app.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.ContrattoDipendente;
@Repository
public interface ContrattoRepository extends CrudRepository<ContrattoDipendente,Integer> {
    
	ContrattoDipendente findById (int id);
	@Query(value = "SELECT * FROM contratto  WHERE nome=?1 and cognome=?2")
	List<ContrattoDipendente> findByNomeAndCognome (String nome, String cognome);
	
	@Query(value = "SELECT c FROM contratto c  WHERE c.codiceFiscale = :codiceFiscale")
	ContrattoDipendente findByCodiceFiscale(String codiceFiscale);

	@Query(value = "DELETE c FROM contratto c  WHERE c.codiceFiscale = :codiceFiscale")
	void deleteByCodiceFiscale(String codiceFiscale);
   



}

