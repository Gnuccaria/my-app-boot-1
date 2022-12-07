package it.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.DipendenteDto;
import it.app.dto.DipendenteProfiloDto;
import it.app.service.DipendenteProfiloService;

@RestController
@RequestMapping("/profilo")
public class ProfiloController {
    @Autowired
    @Qualifier("profilo")
	DipendenteProfiloService service;
	
	@PostMapping("/nuovo")
	public DipendenteProfiloDto nuovo(@RequestBody DipendenteProfiloDto profiloDto) {
		DipendenteProfiloDto dto=new DipendenteProfiloDto();
		
		try {
			dto=service.aggiungi(profiloDto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dto;
	}
	@PostMapping("/elimina")
	public Integer elimina(@RequestParam ("codice")String codice) {
		
		Integer eliminato=null;
		try {
		 eliminato=service.elimina(codice);
			System.out.println(eliminato);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 3;     //torna 3 se c'è un errore
		}
		return eliminato;//torna 1 se è stato eliminato correttamente, 2 se non esiste e quindi non può essere eliminato
	}
	
	
}
