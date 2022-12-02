package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.Imprevisti;
@Repository
public interface ImprevistiRepository extends CrudRepository<Imprevisti, Integer> {

}
