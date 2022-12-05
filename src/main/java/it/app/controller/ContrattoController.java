package it.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.ContrattoDipendenteDto;
import it.app.dto.DipendenteDto;
import it.app.service.ContrattoService;
import it.app.service.DipendenteService;

@RestController
@RequestMapping("/contratto")
public class ContrattoController {
	@Autowired
	ContrattoService contrattoService;
	@Autowired
	DipendenteService dipendenteService;

	@PostMapping("/nuovo")
	public ResponseEntity<Object> nuovoContratto(@RequestBody ContrattoDipendenteDto dto) {// il dto arriva dal front
																							// end già con il codice
		try {
			contrattoService.aggiungiContratto(dto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/vedi")
	public ContrattoDipendenteDto vediContratto(@RequestParam("codice") String codiceFiscale) {
		ContrattoDipendenteDto dto = new ContrattoDipendenteDto();
		try {
			dto = contrattoService.vediDaCodice(codiceFiscale);
		} catch (Exception e) {

		}
		return dto;

	}
	@PostMapping("/elimina")
	public ResponseEntity<Object> elimina(@RequestParam("codice") String codiceFiscale){
		try {
			contrattoService.eliminaContrattoCodice(codiceFiscale);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
