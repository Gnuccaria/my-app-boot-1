package it.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.ScheduleLavoro;

@Repository
public interface ScheduleRepository extends CrudRepository<ScheduleLavoro, Integer>{

}
