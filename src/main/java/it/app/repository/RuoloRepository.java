package it.app.repository;

import org.springframework.data.repository.CrudRepository;

import it.app.model.RuoloDipendente;

public interface RuoloRepository extends CrudRepository<RuoloDipendente, Integer> {

}
