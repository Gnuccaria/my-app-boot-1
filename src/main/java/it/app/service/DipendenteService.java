package it.app.service;



import java.util.List;

import it.app.dto.DipendenteDto;


public interface DipendenteService {
    DipendenteDto aggiungi(DipendenteDto dipendenteDto);
	DipendenteDto eliminaDaId(int id);
	DipendenteDto selezionaDaCodiceFiscale(String codiceFiscale);
	List<DipendenteDto> vediTutti();
	
}
