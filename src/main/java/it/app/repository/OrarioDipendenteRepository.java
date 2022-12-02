package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.OrarioDipendente;

@Repository
public interface OrarioDipendenteRepository extends CrudRepository<OrarioDipendente, Integer> {

}
