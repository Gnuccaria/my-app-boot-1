package it.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.DipendenteDto;
import it.app.repository.DipendenteRepository;
import it.app.service.DipendenteService;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {

	@Autowired
	@Qualifier("dipendente")
	DipendenteService dipendenteService;

	@PostMapping("/nuovo")
	public DipendenteDto nuovo(@RequestBody DipendenteDto dipendenteDto) {
		DipendenteDto dto = new DipendenteDto();
		try {
			dto = dipendenteService.aggiungi(dipendenteDto);// questo metodo ritorna un dto... a che serve se non si
															// usa???
		} catch (Exception e) {
			e.getMessage();
		}
		return dto;
	}

	@PostMapping("/vedi")
	public DipendenteDto selezionaCodiceFiscale(@RequestParam("fiscal_code") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return dipendenteDto;
	}

	@PostMapping("/modifica")
	public DipendenteDto modifica(@RequestBody DipendenteDto dto) {
		// inserire il dto modificato

		try {
			dipendenteService.aggiungi(dto);
		} catch (Exception e) {
			e.getMessage();
		}

		return dto;

	}

	@PostMapping("/elimina")
	public DipendenteDto eliminaCodiceFiscale(@RequestParam("fiscal") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);
			dipendenteService.eliminaDaId(dipendenteDto.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return dipendenteDto;
	}

	@PostMapping("/vedi/tutti")
	public List<DipendenteDto> veditutti() {
		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();
		try {
			dipendenteDtoList = dipendenteService.vediTutti();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dipendenteDtoList;
	}

	@PostMapping("/vedi/{id}")
	public DipendenteDto vediDipendenteId(@PathVariable final int id) {
		DipendenteDto dto = new DipendenteDto();
		try {
			dto = dipendenteService.vediPerId(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return dto;
	}

	@PostMapping("/vedi/nominativi")
	public List<DipendenteDto> vediDipendente(@RequestParam("nome") String nome,
			@RequestParam("cognome") String Cognome) {
		List<DipendenteDto> dto = new ArrayList<>();
		try {
			dto = dipendenteService.vediDaNomeCognome(nome, Cognome);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return dto;
	}

}
