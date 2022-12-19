package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.DipendenteProfiloDto;
import it.app.mapper.DipendenteProfiloMapper;
import it.app.model.DipendenteProfilo;
@Component
public class DipendenteProfiloMapperImpl implements DipendenteProfiloMapper{

	@Override
	public DipendenteProfilo dtoToModel(DipendenteProfiloDto profiloDto) {
		DipendenteProfilo dipProfilo=new DipendenteProfilo();
		dipProfilo.setId(profiloDto.getId());
		dipProfilo.setUserName(profiloDto.getUserName());
		dipProfilo.setPassword(profiloDto.getPassword());
		//dipProfilo.setCodiceFiscale(profiloDto.getCodiceFiscale());
		return dipProfilo;
	}

	@Override
	public DipendenteProfiloDto modelToDto(DipendenteProfilo dipProfilo) {
		DipendenteProfiloDto profiloDto=new DipendenteProfiloDto();
		profiloDto.setId(dipProfilo.getId());
		profiloDto.setUserName(dipProfilo.getUserName());
		profiloDto.setPassword(dipProfilo.getPassword());
		//profiloDto.setCodiceFiscale(dipProfilo.getCodiceFiscale());
		return profiloDto;
	}

}
