package it.app.service;

import it.app.dto.DipendenteProfiloDto;
import it.app.model.DipendenteProfilo;

public interface DipendenteProfiloService {

	DipendenteProfiloDto aggiungi(DipendenteProfiloDto dto);
	Integer elimina(String CodiceFiscale);
	DipendenteProfiloDto vedi(String codiceFiscale);
	DipendenteProfiloDto modifica(String codiceFiscale); //legge da codiceFiscale e reinserisce nel database il modello
	
}
