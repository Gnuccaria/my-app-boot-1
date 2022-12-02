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
		modello.setId(oreDto.getId());
		modello.setIdDipendente(oreDto.getIdDipendente());
		modello.setOreLavorate(oreDto.getOreLavorate());
		modello.setOrePermessoUsufruite(oreDto.getOrePermessoUsufruite());
		modello.setOrePermessoMaturate(oreDto.getOrePermessoMaturate());
		modello.setOreFerie(oreDto.getOreFerie());
		modello.setOreMalattia(oreDto.getOreMalattia());
		return modello;
	}

	@Override
	public OrarioDipendenteDto modelToDto(OrarioDipendente ore) {
		OrarioDipendenteDto modelloDto = new OrarioDipendenteDto();
		modelloDto.setId(ore.getId());
		modelloDto.setIdDipendente(ore.getIdDipendente());
		modelloDto.setOreLavorate(ore.getOreLavorate());
		modelloDto.setOrePermessoUsufruite(ore.getOrePermessoUsufruite());
		modelloDto.setOrePermessoMaturate(ore.getOrePermessoMaturate());
		modelloDto.setOreFerie(ore.getOreFerie());
		modelloDto.setOreMalattia(ore.getOreMalattia());
		return modelloDto;
	}

}
