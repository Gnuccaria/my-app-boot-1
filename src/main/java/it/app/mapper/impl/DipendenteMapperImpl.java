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
		modello.setNumeroCellulare(dipendenteDto.getNumeroCellulare());
		modello.setSesso(dipendenteDto.getSesso());
		modello.setAziendaDipendente(dipendenteDto.getAzienda());
		modello.setContrattoDipendente(dipendenteDto.getContratto());
		modello.setOrarioDipendente(dipendenteDto.getOrario());
		modello.setResidenza(dipendenteDto.getResidenza());
		modello.setStatusGenerale(dipendenteDto.getStatus());
		modello.setTelefonoCasa(dipendenteDto.getTelefonoCasa());
		modello.setNome(dipendenteDto.getNome());
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
		modelloDto.setNumeroCellulare(dipendente.getNumeroCellulare());
		modelloDto.setSesso(dipendente.getSesso());
		modelloDto.setAzienda(dipendente.getAziendaDipendente());
		modelloDto.setContratto(dipendente.getContrattoDipendente());
		modelloDto.setOrario(dipendente.getOrarioDipendente());
		modelloDto.setResidenza(dipendente.getResidenza());
		modelloDto.setStatus(dipendente.getStatusGenerale());
		modelloDto.setTelefonoCasa(dipendente.getTelefonoCasa());
		modelloDto.setNome(dipendente.getNome());
		return modelloDto;
	}

}
