package it.app.service;



import java.util.List;

import it.app.dto.DipendenteDto;


public interface DipendenteService {
    DipendenteDto aggiungi(DipendenteDto dipendenteDto);
    DipendenteDto modifica(DipendenteDto dipendenteDto);
	DipendenteDto eliminaDaId(int id);
	DipendenteDto vediPerId(int id);
	DipendenteDto selezionaDaCodiceFiscale(String codiceFiscale);
	List<DipendenteDto> selezionaTutti();
	List<DipendenteDto> selezionaDaNomeCognome(String nome, String cognome); //ci possono essere omonimi
	
}
