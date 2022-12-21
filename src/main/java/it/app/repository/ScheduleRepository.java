package it.app.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.app.model.ScheduleLavoro;

@Repository
public interface ScheduleRepository extends CrudRepository<ScheduleLavoro, Integer>{
@Query(value="SELECT s FROM schedule s WHERE s.luogoId=?1 AND s.dataInizioTask >= :data " )
	List <ScheduleLavoro> findByLuogoIdAndDataInizioTask(Integer luogoId, Date data);//lista dello storico di quel luogo dove la data di inizio è almeno uguale a oggi
	

@Query(value="SELECT s FROM schedule s WHERE s.luogo_id=luogoId" )
List <ScheduleLavoro> findByLuogoId(Integer luogoId);
}
