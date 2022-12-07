package it.app.service;

import java.util.List;

import it.app.dto.StoricoLavoroDto;

public interface StoricoService {
    //nello storico non è in scrittura... per quello c'è lo ScheduleService che quando si inizia una task,
	// si inserisce nello storico
	List<StoricoLavoroDto>vedi(String idLuogo);//inserendo l'id del luogo vede tutti i lavori fatti o iniziati in quel luogo
	
}
