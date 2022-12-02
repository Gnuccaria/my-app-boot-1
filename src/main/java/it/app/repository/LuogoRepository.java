package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.LuogoDiLavoro;
@Repository
public interface LuogoRepository extends CrudRepository<LuogoDiLavoro, Integer>{

}
