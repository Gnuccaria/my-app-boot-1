package it.app.mapper;


import it.app.dto.DipendenteDto;
import it.app.model.Dipendente;


public interface DipendenteMapper {

	Dipendente dtoToModel(DipendenteDto dipDto);
	DipendenteDto modelToDto(Dipendente dip);
	
}
