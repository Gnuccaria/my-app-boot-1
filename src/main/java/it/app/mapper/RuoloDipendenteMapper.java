package it.app.mapper;

import it.app.dto.RuoloDipendenteDto;
import it.app.model.RuoloDipendente;

public interface RuoloDipendenteMapper {
	
	RuoloDipendente dtoToModel(RuoloDipendenteDto ruoloDto);
	RuoloDipendenteDto modelToDto(RuoloDipendente ruolo);
	
}
