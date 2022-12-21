package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.RapportinoDto;
import it.app.mapper.RapportinoMapper;
import it.app.model.Rapportino;

@Component
public class RapportinoMapperImpl implements RapportinoMapper {

	@Override
	public Rapportino dtoToModel(RapportinoDto oreDto) {
		Rapportino modello = new Rapportino();
		modello.setId(oreDto.getId());
		modello.setCodiceDipendente(oreDto.getCodiceDipendente());
		modello.setOreLavorate(oreDto.getOreLavorate());
		modello.setOrePermessoUsufruite(oreDto.getOrePermessoUsufruite());
		modello.setOrePermessoMaturate(oreDto.getOrePermessoMaturate());
		modello.setOreFerie(oreDto.getOreFerie());
		modello.setOreMalattia(oreDto.getOreMalattia());
		modello.setMeseRiferimento(oreDto.getMeseRiferimento());
		return modello;
	}

	@Override
	public RapportinoDto modelToDto(Rapportino ore) {
		RapportinoDto oreDto = new RapportinoDto();
		oreDto.setId(ore.getId());
		oreDto.setCodiceDipendente(ore.getCodiceDipendente());
		oreDto.setOreLavorate(ore.getOreLavorate());
		oreDto.setOrePermessoUsufruite(ore.getOrePermessoUsufruite());
		oreDto.setOrePermessoMaturate(ore.getOrePermessoMaturate());
		oreDto.setOreFerie(ore.getOreFerie());
		oreDto.setOreMalattia(ore.getOreMalattia());
		oreDto.setMeseRiferimento(ore.getMeseRiferimento());
		return oreDto;
	}

}
