package it.app.mapper.impl;

import it.app.dto.LuogoDiLavoroDto;
import it.app.mapper.LuogoDiLavoroMapper;
import it.app.model.LuogoDiLavoro;

public class LuogoDiLavoroMapperImpl implements LuogoDiLavoroMapper{

	@Override
	public LuogoDiLavoro dtoToModel(LuogoDiLavoroDto luogoDto) {
	    LuogoDiLavoro luogo=new LuogoDiLavoro();
	    luogo.setCitta(luogoDto.getCitta());
	    luogo.setIndirizzo(luogoDto.getIndirizzo());
	    luogo.setCivico(luogoDto.getCivico());
	    luogo.setId(luogoDto.getCivico());
		return luogo;
	}

	@Override
	public LuogoDiLavoroDto modelToDto(LuogoDiLavoro luogo) {
		  LuogoDiLavoroDto luogoDto=new LuogoDiLavoroDto();
		    luogoDto.setCitta(luogo.getCitta());
		    luogoDto.setIndirizzo(luogo.getIndirizzo());
		    luogoDto.setCivico(luogo.getCivico());
		    luogoDto.setId(luogo.getCivico());
			return luogoDto;
	}

}
