package it.app.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.app.dto.ScheduleLavoroDto;
import it.app.mapper.ScheduleLavoroMapper;
import it.app.model.ScheduleLavoro;
import it.app.repository.ScheduleRepository;
import it.app.service.ScheduleService;
@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
	ScheduleRepository repository;
    @Autowired
    ScheduleLavoroMapper mapper;
	
	
	@Override
	public List<ScheduleLavoroDto> vediSchedulePerData(Integer idLavoro, Date data) {//data di inizio
		List<ScheduleLavoro> listaModello=repository.findByLuogoIdAndDataInizioTask(idLavoro, data);
		List<ScheduleLavoroDto>listaDto=new ArrayList<>();
		
		for (ScheduleLavoro scheduleLavoro : listaModello) {
			listaDto.add(mapper.modelToDto(scheduleLavoro));
		}
		
		return listaDto;
	}

	@Override
	public ScheduleLavoroDto aggiungi(ScheduleLavoroDto scheduleDto) {//to do: verifica se task luogo e data di inizio già esistono 
		ScheduleLavoro modello=mapper.dtoToModel(scheduleDto);
		modello=repository.save(modello);
		return mapper.modelToDto(modello);
	}

	@Override
	public void eliminaDaId(Integer id) {
		repository.deleteById(id);
	}


	
}
