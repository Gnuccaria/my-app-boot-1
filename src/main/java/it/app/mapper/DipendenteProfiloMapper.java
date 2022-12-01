package it.app.mapper;

import it.app.dto.DipendenteProfiloDto;
import it.app.model.DipendenteProfilo;

public interface DipendenteProfiloMapper {

	DipendenteProfilo dtoToModel(DipendenteProfiloDto dipDto);
	DipendenteProfiloDto modelToDto(DipendenteProfilo  dip);
	
}
