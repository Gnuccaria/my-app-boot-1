package it.app.mapper.impl;

import org.springframework.stereotype.Component;

import it.app.dto.DipendenteDto;
import it.app.mapper.DipendenteMapper;
import it.app.model.Dipendente;

@Component
public class DipendenteMapperImpl implements DipendenteMapper {

	@Override
	public Dipendente dtoToModel(DipendenteDto dipendenteDto) {
		Dipendente modello = new Dipendente();
		modello.setId(dipendenteDto.getId());
		modello.setCodiceFiscale(dipendenteDto.getCodiceFiscale());
		modello.setDataNascita(dipendenteDto.getDataNascita());
		modello.setCognome(dipendenteDto.getCognome());
		modello.setEmail(dipendenteDto.getEmail());
		modello.setIndirizzo(dipendenteDto.getIndirizzo());
		modello.setLuogoNascita(dipendenteDto.getLuogoNascita());
		modello.setTelefonoCellulare(dipendenteDto.getTelefonoCellulare());
		modello.setSesso(dipendenteDto.getSesso());
		modello.setResidenza(dipendenteDto.getResidenza());
		modello.setTelefonoCasa(dipendenteDto.getTelefonoCasa());
		modello.setNome(dipendenteDto.getNome());
		modello.setStato(dipendenteDto.getStato());
		modello.setContratto(dipendenteDto.getContratto()); 
		modello.setProfilo(dipendenteDto.getProfilo());
		return modello;
	}

	@Override
	public DipendenteDto modelToDto(Dipendente dipendente) {
		DipendenteDto modelloDto = new DipendenteDto();
		modelloDto.setId(dipendente.getId());
		modelloDto.setCodiceFiscale(dipendente.getCodiceFiscale());
		modelloDto.setDataNascita(dipendente.getDataNascita());
		modelloDto.setCognome(dipendente.getCognome());
		modelloDto.setEmail(dipendente.getEmail());
		modelloDto.setIndirizzo(dipendente.getIndirizzo());
		modelloDto.setLuogoNascita(dipendente.getLuogoNascita());
		modelloDto.setTelefonoCellulare(dipendente.getTelefonoCellulare());
		modelloDto.setSesso(dipendente.getSesso());
		modelloDto.setResidenza(dipendente.getResidenza());
		modelloDto.setTelefonoCasa(dipendente.getTelefonoCasa());
		modelloDto.setNome(dipendente.getNome());
		modelloDto.setStato(dipendente.getStato());
		modelloDto.setContratto(dipendente.getContratto()); 
		modelloDto.setProfilo(dipendente.getProfilo());
		return modelloDto;
	}

}
