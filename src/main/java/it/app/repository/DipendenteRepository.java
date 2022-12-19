package it.app.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.app.model.Dipendente;

@Repository
public interface DipendenteRepository extends CrudRepository<Dipendente, Integer> {
	@Query(value = "SELECT c FROM dipendente c  WHERE c.codiceFiscale = :codice")
	Dipendente findByCodiceFiscale(@Param ("codice")String codiceFiscale);
    
	void deleteById(Integer id);

	Dipendente findById(int id);

	List<Dipendente> findAll();

	@Query(value = "SELECT * FROM dipendente  WHERE nome=?1 and cognome=?2")
	List<Dipendente> findByNomeAndCognome(String nome, String cognome);
	
	//List<Dipendente> findByRuolo()

}
