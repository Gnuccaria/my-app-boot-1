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
		modello.setTipo(contDipDto.getTipo());
		modello.setRuoloDipendente(contDipDto.getRuoloDipendente());
		modello.setOreContratto(contDipDto.getOreContratto());
		modello.setDataAssunzione(contDipDto.getDataAssunzione());
		modello.setDataScadenzaContratto(contDipDto.getDataScadenzaContratto());
		return modello;
	}

	@Override
	public ContrattoDipendenteDto modelToDto(ContrattoDipendente contDip) {
		ContrattoDipendenteDto modelloDto = new ContrattoDipendenteDto();
		modelloDto.setTipo(contDip.getTipo());
		modelloDto.setRuoloDipendente(contDip.getRuoloDipendente());
		modelloDto.setOreContratto(contDip.getOreContratto());
		modelloDto.setDataAssunzione(contDip.getDataAssunzione());
		modelloDto.setDataScadenzaContratto(contDip.getDataScadenzaContratto());
		return modelloDto;
	}

}
