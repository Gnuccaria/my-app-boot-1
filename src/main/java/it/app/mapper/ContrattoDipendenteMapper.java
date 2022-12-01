package it.app.mapper;

import it.app.dto.ContrattoDipendenteDto;
import it.app.model.ContrattoDipendente;

public interface ContrattoDipendenteMapper {
	ContrattoDipendente dtoToModel(ContrattoDipendenteDto contDipDto);
	ContrattoDipendenteDto modelToDto(ContrattoDipendente contDip);
}
