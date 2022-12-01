package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.OrarioDipendenteDto;
import it.app.mapper.OrarioMapper;
import it.app.model.OrarioDipendente;

@Component
public class OrarioMapperImpl implements OrarioMapper {

	@Override
	public OrarioDipendente dtoToModel(OrarioDipendenteDto oreDto) {
		OrarioDipendente modello = new OrarioDipendente();

		return modello;
	}

	@Override
	public OrarioDipendenteDto modelToDto(OrarioDipendente ore) {
		OrarioDipendenteDto modelloDto = new OrarioDipendenteDto();
		modelloDto.setId(ore.getId());

		return modelloDto;
	}

}
