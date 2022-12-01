package it.app.mapper;

import it.app.dto.StoricoLavoroDto;
import it.app.model.StoricoLavoro;

public interface StoricoLavoroMapper {

	StoricoLavoroDto modelToDto (StoricoLavoro storico);
	StoricoLavoro dtoToModel(StoricoLavoroDto StoricoDto);
	
}
