package it.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.app.dto.DipendenteProfiloDto;
import it.app.mapper.DipendenteProfiloMapper;
import it.app.model.DipendenteProfilo;
import it.app.repository.DipendenteProfiloRepository;
import it.app.service.DipendenteProfiloService;
@Service//n'artro litro
public class DipendenteProfiloServiceImpl implements DipendenteProfiloService{
  
	@Autowired
	DipendenteProfiloMapper mapper;
	@Autowired
	DipendenteProfiloRepository repository;
	@Override
	public DipendenteProfiloDto aggiungi(DipendenteProfiloDto dto) {
		
		DipendenteProfilo modello=new DipendenteProfilo();
		modello=repository.findByUsername(dto.getCodiceFiscale());
	
		if(modello==null) {
           modello=mapper.dtoToModel(dto);
		   modello=repository.save(modello);//ritorna l'entità salvata
		   return mapper.modelToDto(modello);//ritorno dto
		}
		return new DipendenteProfiloDto();//ritorno dto
	}

	@Override
	public Integer elimina(String CodiceFiscale) {
		
		DipendenteProfilo modello=repository.findByUsername(CodiceFiscale);//vedo se esiste
		
		if(modello!=null) {//se esiste lo elimino
			repository.deleteByUsername(CodiceFiscale);
			modello=repository.findByUsername(CodiceFiscale);//controllo nuovamente se esiste
			return 1;//ritorno 1 se l'ho eliminato;
		}
		
			return 2;//se non esiste ritorno 2
	
	}

	@Override
	public DipendenteProfiloDto vedi(String codiceFiscale) {//penso sia meglio vedere da username se esiste... 
		DipendenteProfilo modello=repository.findByUsername(codiceFiscale);//ottengo l'entità dal codice fiscale
		return mapper.modelToDto(modello);//ottengo il dto dal modello e lo ritorno
	}

	@Override
	public DipendenteProfiloDto modifica(String codiceFiscale) {
		// TODO Auto-generated method stub
		return null;
	}

}
