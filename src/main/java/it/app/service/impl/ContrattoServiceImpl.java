package it.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.app.dto.ContrattoDipendenteDto;
import it.app.mapper.ContrattoDipendenteMapper;
import it.app.model.ContrattoDipendente;
import it.app.repository.ContrattoRepository;
import it.app.service.ContrattoService;

public class ContrattoServiceImpl implements ContrattoService {
    @Autowired
	ContrattoDipendenteMapper mapper;
	@Autowired 
	ContrattoRepository repository;
    
    
	@Override
	public ContrattoDipendenteDto aggiungiContratto(ContrattoDipendenteDto dto) {
		ContrattoDipendente modello=mapper.dtoToModel(dto);//da dto a model e lo salva in modello
		
		modello=repository.save(modello);//il metodo ritorna l'entità salvata(secondo me è più corretto risalvarla nella variabile, poi vedi tu)
		return mapper.modelToDto(modello);//ritorna il modello convertito in dto
	}

	@Override
	public ContrattoDipendenteDto vediContrattoDaId(int idDipendente) {//se metto Integer mi obbliga a wrapparlo in Optional
		ContrattoDipendente modello=repository.findById(idDipendente);
		ContrattoDipendenteDto dto=mapper.modelToDto(modello);
		return dto;
	}

	@Override
	public List<ContrattoDipendenteDto> vediContrattoDaNome(String nome, String cognome) {//é una lista perché possono esserci omonimi
		List<ContrattoDipendente> modelloList=repository.findByNomeAndCognome(nome, cognome);
		List<ContrattoDipendenteDto> dtoList=new ArrayList<>();
		for (ContrattoDipendente contrattoDipendente : modelloList) {//ogni modello si trasforma in dto e si aggiunge uno ad uno nella listaDto
			dtoList.add(mapper.modelToDto(contrattoDipendente));
		}
		return dtoList;
	}


	@Override
	public List<ContrattoDipendenteDto> vediTutti() {
		List<ContrattoDipendente> modelloList=(List<ContrattoDipendente>) repository.findAll();
		List<ContrattoDipendenteDto> dtoList=new ArrayList<>();
		for (ContrattoDipendente contrattoDipendente : modelloList) {//ogni modello si trasforma in dto e si aggiunge uno ad uno nella listaDto
			dtoList.add(mapper.modelToDto(contrattoDipendente));
		}
		return dtoList;
	}

	@Override
	public ContrattoDipendenteDto vediDaCodice(String codiceFiscale) {
		ContrattoDipendente modello=repository.findByCodiceFiscale(codiceFiscale);
		ContrattoDipendenteDto dto=mapper.modelToDto(modello);
		return dto;
	}

	@Override
	public ContrattoDipendenteDto eliminaContrattoId(int id) {
        ContrattoDipendente modello=repository.findById(id);
		repository.delete(modello);
		return mapper.modelToDto(modello);
	}

	@Override
	public ContrattoDipendenteDto eliminaContrattoCodice(String codiceFiscale) {
		 ContrattoDipendente modello=repository.findByCodiceFiscale(codiceFiscale);
		repository.delete(modello);
		return mapper.modelToDto(modello);
	}

}
