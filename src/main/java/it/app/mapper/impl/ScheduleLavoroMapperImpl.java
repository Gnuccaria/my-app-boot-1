package it.app.mapper.impl;



import org.springframework.stereotype.Component;

import it.app.dto.ScheduleLavoroDto;
import it.app.mapper.ScheduleLavoroMapper;
import it.app.model.ScheduleLavoro;

@Component
public class ScheduleLavoroMapperImpl implements ScheduleLavoroMapper {

	@Override
	public ScheduleLavoro dtoToModel(ScheduleLavoroDto dto) {
		ScheduleLavoro modello = new ScheduleLavoro();
		modello.setId(dto.getId());
		modello.setTask(dto.getTask());
		modello.setDataTask(dto.getDataTask());
		return modello;
	}

	@Override
	public ScheduleLavoroDto modelToDto(ScheduleLavoro modello) {
		ScheduleLavoroDto dto = new ScheduleLavoroDto();
		dto.setId(modello.getId());
		dto.setTask(modello.getTask());
		dto.setDataTask(modello.getDataTask());
		return dto;
	}

}
