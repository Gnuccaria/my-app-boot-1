package it.app.mapper;

import it.app.dto.ScheduleLavoroDto;
import it.app.model.ScheduleLavoro;

public interface ScheduleLavoroMapper {

	ScheduleLavoro dtoToModel(ScheduleLavoroDto dipDto);
	ScheduleLavoroDto modelToDto(ScheduleLavoro dip);
	
}
