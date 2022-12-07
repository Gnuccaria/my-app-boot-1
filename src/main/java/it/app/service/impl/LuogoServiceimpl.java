package it.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.app.dto.LuogoDiLavoroDto;
import it.app.mapper.LuogoDiLavoroMapper;
import it.app.repository.LuogoRepository;
import it.app.service.LuogoService;

@Service//un po' de vino
public class LuogoServiceimpl implements LuogoService{
    @Autowired
	LuogoRepository repository;
    @Autowired
    LuogoDiLavoroMapper mapper;
	
	
	@Override
	public LuogoDiLavoroDto aggiungi(LuogoDiLavoroDto luogo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer elimina(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LuogoDiLavoroDto> vedi() {
		// TODO Auto-generated method stub
		return null;
	}



}
