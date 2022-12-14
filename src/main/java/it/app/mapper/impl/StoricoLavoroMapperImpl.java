package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.StoricoLavoroDto;
import it.app.mapper.StoricoLavoroMapper;
import it.app.model.StoricoLavoro;
@Component
public class StoricoLavoroMapperImpl implements StoricoLavoroMapper {

	@Override
	public StoricoLavoroDto modelToDto(StoricoLavoro storico) {
      StoricoLavoroDto storicoDto=new StoricoLavoroDto();
      storicoDto.setDataTask(storico.getDataTask());
      storicoDto.setDescrizione(storico.getDescrizione());
      storicoDto.setLuogo(storico.getLuogo());
      storicoDto.setMansione(storico.getMansione());
      storicoDto.setId(storico.getId());
		return storicoDto;
	}

	@Override
	public StoricoLavoro dtoToModel(StoricoLavoroDto storicoDto) {
	      StoricoLavoro storico=new StoricoLavoro();
	      storico.setDataTask(storicoDto.getDataTask());
	      storico.setDescrizione(storicoDto.getDescrizione());
	      storico.setLuogo(storicoDto.getLuogo());
	      storico.setMansione(storicoDto.getMansione());
	      storico.setId(storicoDto.getId());
		return storico;
	}

}
