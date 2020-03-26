package de.wwweasel.SpringGettingStarted;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
	
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String helloWorld(Model model) {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/greet")
	@ResponseBody
	public Transport greet(@RequestBody Transport transport) {
		return transport;
	}
	
}
