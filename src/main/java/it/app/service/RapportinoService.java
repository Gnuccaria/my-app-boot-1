package it.app.service;

import it.app.dto.RapportinoDto;

public interface RapportinoService {

	public RapportinoDto aggiungi(RapportinoDto dto);
	public RapportinoDto vediPerCodice(String codice);
	
}
