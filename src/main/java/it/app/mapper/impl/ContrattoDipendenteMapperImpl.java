package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.ContrattoDipendenteDto;
import it.app.mapper.ContrattoDipendenteMapper;
import it.app.model.ContrattoDipendente;

@Component
public class ContrattoDipendenteMapperImpl implements ContrattoDipendenteMapper {

	@Override
	public ContrattoDipendente dtoToModel(ContrattoDipendenteDto contDipDto) {
		ContrattoDipendente modello = new ContrattoDipendente();
		modello.setId(contDipDto.getId());
		modello.setCodiceDipendente(contDipDto.getCodiceFiscale());
		modello.setTipo(contDipDto.getTipo());
		modello.setRuoloDipendente(contDipDto.getRuoloDipendente());
		modello.setOreContratto(contDipDto.getOreContratto());
		modello.setDataAssunzione(contDipDto.getDataAssunzione());
		modello.setDataScadenzaContratto(contDipDto.getDataScadenzaContratto());
		modello.setRetribuzione(contDipDto.getRetribuzione());
		modello.setIdDipendente(contDipDto.getIdDipendente());
		return modello;
	}

	@Override
	public ContrattoDipendenteDto modelToDto(ContrattoDipendente contDip) {
		ContrattoDipendenteDto dto = new ContrattoDipendenteDto();
		dto.setId(contDip.getId());
		dto.setCodiceFiscale(contDip.getCodiceDipendente());
		dto.setTipo(contDip.getTipo());
		dto.setRuoloDipendente(contDip.getRuoloDipendente());
		dto.setOreContratto(contDip.getOreContratto());
		dto.setDataAssunzione(contDip.getDataAssunzione());
		dto.setDataScadenzaContratto(contDip.getDataScadenzaContratto());
		dto.setRetribuzione(contDip.getRetribuzione());
		dto.setIdDipendente(contDip.getIdDipendente());
		return dto;
	}

}
