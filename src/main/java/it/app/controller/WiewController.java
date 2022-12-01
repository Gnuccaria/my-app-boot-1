package it.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WiewController {

	
	@RequestMapping("/view")
	public String view() {

		return "index";

	}

}
