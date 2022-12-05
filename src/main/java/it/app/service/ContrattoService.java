package it.app.service;

import java.util.List;


import it.app.dto.ContrattoDipendenteDto;

public interface ContrattoService {

	ContrattoDipendenteDto aggiungiContratto (ContrattoDipendenteDto dto);
	ContrattoDipendenteDto vediContrattoDaId(int id);
	List <ContrattoDipendenteDto> vediContrattoDaNome(String nome,String cognome);
	ContrattoDipendenteDto eliminaContrattoId(int id);
	ContrattoDipendenteDto eliminaContrattoCodice(String codiceFiscale);
	List<ContrattoDipendenteDto>vediTutti();
	ContrattoDipendenteDto vediDaCodice (String codiceFiscale);
	//modifica
	
}
