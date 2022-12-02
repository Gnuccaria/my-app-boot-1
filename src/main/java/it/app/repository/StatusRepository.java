package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.StatusGenerale;
@Repository
public interface StatusRepository extends CrudRepository<StatusGenerale, Integer>{

}
