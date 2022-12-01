package it.app.mapper;

import it.app.dto.LuogoDiLavoroDto;
import it.app.model.LuogoDiLavoro;

public interface LuogoDiLavoroMapper {

	LuogoDiLavoro dtoToModel(LuogoDiLavoroDto luogoDto);
	LuogoDiLavoroDto modelToDto(LuogoDiLavoro luogo);
	
}
