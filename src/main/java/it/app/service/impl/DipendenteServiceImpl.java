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

	@Override
	public DipendenteDto aggiungi(DipendenteDto dipendenteDto) {
		Dipendente dipendente = new Dipendente();// nuovo dipendente
		dipendente = dipendenteMapper.dtoToModel(dipendenteDto); // trasformo dto in modello
		dipendenteRepository.save(dipendente); // salvo il modello nel database
		return dipendenteMapper.modelToDto(dipendente); // ritorno dipendenteDto
	}

	@Override
	public DipendenteDto selezionaDaCodiceFiscale(String codiceFiscale) {
		Dipendente dipendente = new Dipendente();
		dipendente = dipendenteRepository.findByCodiceFiscale(codiceFiscale);
		return dipendenteMapper.modelToDto(dipendente);
	}

	@Override
	public DipendenteDto eliminaDaId(int id) {
		Dipendente dipendente = new Dipendente();
		dipendente = dipendenteRepository.findById(id); // prendo il modello
		dipendenteRepository.deleteById(id); // elimino l'entità per id
		return dipendenteMapper.modelToDto(dipendente); // converto il modello in dto
	}

	@Override
	public List<DipendenteDto> vediTutti() {
		List<Dipendente> dipendenteList = dipendenteRepository.findAll(); //inserisco tutti i dipendenti in una lista
		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();//creo una lista dto
		for (Dipendente dipendente : dipendenteList) {
			dipendenteDtoList.add(dipendenteMapper.modelToDto(dipendente));//ogni dipendente lo inserisco in lista dto
		}
		return dipendenteDtoList;//ritorno la lista dto popolata
	}

	@Override
	public DipendenteDto vediPerId(int id) {
		Dipendente dipendente = new Dipendente();
		dipendente = dipendenteRepository.findById(id);
		return dipendenteMapper.modelToDto(dipendente); 
	}

	@Override
	public List<DipendenteDto> vediDaNomeCognome(String nome, String cognome) {
		//potrebbero esistere omonimi per questo ho messo la lista
		List<Dipendente> dipendenteList= dipendenteRepository.findByNomeAndCognome(nome,cognome);
		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();//creo una lista dto
		for (Dipendente dipendente : dipendenteList) {
			dipendenteDtoList.add(dipendenteMapper.modelToDto(dipendente));//ogni dipendente lo inserisco in lista dto
		}
		return dipendenteDtoList;//ritorno la lista dto popolata
	}

}
