package it.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import it.app.dto.DipendenteDto;
import it.app.mapper.DipendenteMapper;
import it.app.model.Dipendente;
import it.app.repository.DipendenteRepository;
import it.app.service.DipendenteService;

@Service
@Primary
public class DipendenteServiceImpl implements DipendenteService {
	@Autowired
	private DipendenteRepository dipendenteRepository;
	@Autowired
	private DipendenteMapper dipendenteMapper;

//	@Override
//	public DipendenteDto aggiungi(DipendenteDto dipendenteDto) {
//		Dipendente dipendente = dm.dtoToModel(dipendenteDto);
//		return dm.modelToDto(dr.save(dipendente));
//	}

	@Override
	public DipendenteDto selezionaDaCodiceFiscale(String codiceFiscale) {
		DipendenteDto dipendenteDto = dipendenteMapper.modelToDto(dipendenteRepository.findByCodiceFiscale(codiceFiscale));
		System.out.println(dipendenteRepository.findByCodiceFiscale(codiceFiscale).getId());
		return dipendenteDto;
	}

//	@Override
//	public DipendenteDto eliminaDaId(int id) {
//		dr.deleteById(id);
//		return dm.modelToDto(dr.findById(id));
//	}

//	@Override
//	public List<DipendenteDto> vediTutti() {
//		List<Dipendente> dipendenteList = dr.findAll();
//		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();
//
//		for (Dipendente dipendente : dipendenteList) {
//			dipendenteDtoList.add(dm.modelToDto(dipendente));
//		}
//		return dipendenteDtoList;
//	}

}
