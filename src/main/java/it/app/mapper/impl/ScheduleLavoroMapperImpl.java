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
		modello.setDataInizioTask(dto.getDataInizioTask());
		modello.setDataFineTask(dto.getDataFineTask());
		modello.setDescrizione(dto.getDescrizione());
		//modello.setIdDipendente(dto.getIdDipendente());
		modello.setLuogo(dto.getLuogo());
		modello.setMansione(dto.getMansione());//materia lavoro svolto (task)
		return modello;
	}

	@Override
	public ScheduleLavoroDto modelToDto(ScheduleLavoro modello) {
		ScheduleLavoroDto dto=new ScheduleLavoroDto();
		dto.setId(modello.getId());
		dto.setDataInizioTask(modello.getDataInizioTask());
		dto.setDataFineTask(modello.getDataFineTask());
		dto.setDescrizione(modello.getDescrizione());
		//.setIdDipendente(modello.getIdDipendente());
		dto.setLuogo(modello.getLuogo());
		dto.setMansione(modello.getMansione());
		return dto;
	}

}
