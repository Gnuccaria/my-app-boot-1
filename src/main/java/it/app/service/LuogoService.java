package it.app.service;

import java.util.List;

import it.app.dto.LuogoDiLavoroDto;

public interface LuogoService {

	
	//crud
	
	LuogoDiLavoroDto aggiungi(LuogoDiLavoroDto luogo);
	List<LuogoDiLavoroDto>vedi();
	Integer elimina(Integer Id);
	
}
