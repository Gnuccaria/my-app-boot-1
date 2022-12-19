 package it.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.DipendenteDto;
import it.app.service.DipendenteService;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {

	@Autowired
	@Qualifier("dipendente")
	DipendenteService dipendenteService;

	@PostMapping("/nuovo")
	public ResponseEntity<DipendenteDto> nuovo(@RequestBody DipendenteDto dipendenteDto) {
		DipendenteDto dto = new DipendenteDto();
		try {
			dto = dipendenteService.aggiungi(dipendenteDto);// questo metodo ritorna un dto... a che serve se non si
															// usa???
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<DipendenteDto>(dto, HttpStatus.OK);
	}

	// meglio? selezionare tutta la tabella e poi utilizzare il
	// "lista.stream().filter(e->e.getCodiceFiscale().equals(code)).collect(Collectors.toList());"
	// per fare una ricerca specifica
	@PostMapping(path = "/vedi", produces = "application/json")
	public DipendenteDto selezionaCodiceFiscale(@RequestParam("codice") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

		return dipendenteDto;
	}

	@PutMapping("/modifica")
	public ResponseEntity<DipendenteDto> modifica(@RequestBody DipendenteDto dto) {
		// inserire il dto modificato

		try {
			dipendenteService.modifica(dto);
		} catch (Exception e) {
			e.getMessage();
		}

		return new ResponseEntity<DipendenteDto>(dto, HttpStatus.CREATED);

	}

	@DeleteMapping("/elimina")
	public ResponseEntity<DipendenteDto> eliminaCodiceFiscale(@RequestParam("codice") String code) {
		DipendenteDto dipendenteDto = new DipendenteDto();
		try {
			dipendenteDto = dipendenteService.selezionaDaCodiceFiscale(code);
			dipendenteService.eliminaDaId(dipendenteDto.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return new ResponseEntity<DipendenteDto>(dipendenteDto, HttpStatus.OK);
	}

	@GetMapping("/vedi/tutti")
	public ResponseEntity<List<DipendenteDto>> veditutti() {
		List<DipendenteDto> dipendenteDtoList = new ArrayList<>();
		try {
			dipendenteDtoList = dipendenteService.selezionaTutti();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<List<DipendenteDto>>(dipendenteDtoList, HttpStatus.OK);
	}

	@PostMapping("/vedi/{id}")
	public ResponseEntity<DipendenteDto> vediDipendenteId(@PathVariable final int id) {
		DipendenteDto dto = new DipendenteDto();
		try {
			dto = dipendenteService.vediPerId(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return new ResponseEntity<DipendenteDto>(dto, HttpStatus.OK);
	}

	@PostMapping("/vedi/nominativi")
	public ResponseEntity<List<DipendenteDto>> vediDipendente(@RequestParam("nome") String nome,
			@RequestParam("cognome") String Cognome) {
		List<DipendenteDto> dto = new ArrayList<>();
		try {
			dto = dipendenteService.selezionaDaNomeCognome(nome, Cognome);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return new ResponseEntity<List<DipendenteDto>>(dto, HttpStatus.OK);
	}

}
