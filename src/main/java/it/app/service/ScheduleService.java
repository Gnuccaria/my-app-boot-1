package it.app.service;


import java.util.Date;
import java.util.List;

import it.app.dto.ScheduleLavoroDto;

public interface ScheduleService {

	List<ScheduleLavoroDto>vediSchedulePerData(Integer idLavoro,Date data); //se passi data.now vedrai tutto quello che è almeno iniziato
	                                                               //ma puoi fare una ricerca per data di inizio
	
	ScheduleLavoroDto aggiungi(ScheduleLavoroDto scheduleDto);
	
	void eliminaDaId(Integer id);
}
