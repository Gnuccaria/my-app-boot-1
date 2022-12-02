package it.app.service;



import java.util.List;

import it.app.dto.DipendenteDto;


public interface DipendenteService {
    DipendenteDto aggiungi(DipendenteDto dipendenteDto);
	DipendenteDto eliminaDaId(int id);
	DipendenteDto vediPerId(int id);
	DipendenteDto selezionaDaCodiceFiscale(String codiceFiscale);
	List<DipendenteDto> vediTutti();
	List<DipendenteDto> vediDaNomeCognome(String nome, String cognome); //ci possono essere omonimi
	
}
