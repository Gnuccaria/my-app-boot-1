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
      ruolo.setLivello(ruoloDto.getLivello());
      ruolo.setContratto(ruoloDto.getContratto());
      ruolo.setDescrizione(ruoloDto.getDescrizione());
      ruolo.setInquadramento(ruoloDto.getInquadramento());
      ruolo.setId(ruoloDto.getId());
      ruolo.setDipendente(ruoloDto.getDipendente());
		return ruolo;
	}

	@Override
	public RuoloDipendenteDto modelToDto(RuoloDipendente ruolo) {
	      RuoloDipendenteDto ruoloDto=new RuoloDipendenteDto();
	      ruoloDto.setLivello(ruolo.getLivello());
	      ruoloDto.setContratto(ruolo.getContratto());
	      ruoloDto.setDescrizione(ruoloDto.getDescrizione());
	      ruoloDto.setInquadramento(ruoloDto.getInquadramento());
	      ruoloDto.setId(ruoloDto.getId());		
	      ruoloDto.setDipendente(ruolo.getDipendente());
	      return ruoloDto;
	}

}
