package it.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	@ResponseBody
	@GetMapping("/saluto")
	public String s(@RequestHeader ("User-agent")String userAgent) {
		return userAgent;
		
	}
	
	@RequestMapping(
			path={"/view","/v"},
			method=RequestMethod.GET)
	public String view() {

		return "index";

	}

}
