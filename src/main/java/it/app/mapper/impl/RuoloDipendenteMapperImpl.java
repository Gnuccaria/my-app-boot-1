package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.RuoloDipendenteDto;
import it.app.mapper.RuoloDipendenteMapper;
import it.app.model.RuoloDipendente;
@Component
public class RuoloDipendenteMapperImpl implements RuoloDipendenteMapper {

	@Override
	public RuoloDipendente dtoToModel(RuoloDipendenteDto ruoloDto) {
      RuoloDipendente ruolo=new RuoloDipendente();
      ruolo.setContratto(ruoloDto.getContratto());
      ruolo.setDescrizione(ruoloDto.getDescrizione());
      ruolo.setRuolo(ruoloDto.getRuolo());
      ruolo.setId(ruoloDto.getId());
		return ruolo;
	}

	@Override
	public RuoloDipendenteDto modelToDto(RuoloDipendente ruolo) {
	      RuoloDipendenteDto ruoloDto=new RuoloDipendenteDto();
	      ruoloDto.setContratto(ruolo.getContratto());
	      ruoloDto.setDescrizione(ruoloDto.getDescrizione());
	      ruoloDto.setRuolo(ruoloDto.getRuolo());
	      ruoloDto.setId(ruoloDto.getId());		
	      return ruoloDto;
	}

}
