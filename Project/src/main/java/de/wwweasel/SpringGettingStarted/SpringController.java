package de.wwweasel.SpringGettingStarted;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String helloWorld(@RequestParam(defaultValue="World") String name) {
		String greeting = "Hello ";
		return greeting + name;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{name}")
	public String helloWorldPathVariable(@PathVariable("name") String name) {
		String greeting = "Hello ";
		return greeting + name;
	}
}
