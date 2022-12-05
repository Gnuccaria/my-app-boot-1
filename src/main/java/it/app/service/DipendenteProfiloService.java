package it.app.service;

import it.app.dto.DipendenteProfiloDto;
import it.app.model.DipendenteProfilo;

public interface DipendenteProfiloService {

	DipendenteProfilo aggiungi(DipendenteProfiloDto dto);
	void elimina(String CodiceFiscale);
	
}
