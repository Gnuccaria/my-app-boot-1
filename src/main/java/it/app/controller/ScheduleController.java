package it.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.app.dto.ScheduleLavoroDto;
import it.app.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    @Qualifier("Schedule")
	ScheduleService service;
	
    @PostMapping("aggiungi")
    public ScheduleLavoroDto aggiungi(@RequestBody ScheduleLavoroDto scheduleLavoroDto) {
		ScheduleLavoroDto dto=new ScheduleLavoroDto();
    	try {
		dto=service.aggiungi(scheduleLavoroDto);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	return dto;
    	
    }
    @PostMapping("/elimina")
    public ResponseEntity<Object> elimina(@RequestParam("id")Integer id){
    	try {
			service.eliminaDaId(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(HttpStatus.OK);
    	
    }
    
	
}
