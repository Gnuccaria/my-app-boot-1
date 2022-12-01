package it.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.DipendenteDto;
import it.app.service.DipendenteService;

@RestController
public class DipendenteController {

	@Autowired
	DipendenteService dipendenteService;

	@PostMapping("/nuovo")
	public ResponseEntity<Object> nuovo(@RequestBody DipendenteDto dipendenteDto) {
		try {
			dipendenteService.aggiungi(dipendenteDto);
		} catch (Exception e) {
			e.getMessage();
		}

		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@PostMapping("/seleziona/codicefiscale")
	public DipendenteDto selezionaCodiceFiscale(@RequestParam("fiscal_code") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);
			System.out.println(dipendenteDto.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dipendenteDto;

	}

	@PostMapping("/elimina")
	public DipendenteDto eliminaCodiceFiscale(@RequestParam("fiscal") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);

			dipendenteService.eliminaDaId(dipendenteDto.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dipendenteDto;

	}

	@PostMapping("/veditutti")
	public List<DipendenteDto> veditutti() {
		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();
		try {
			dipendenteDtoList = dipendenteService.vediTutti();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dipendenteDtoList;

	}

}
