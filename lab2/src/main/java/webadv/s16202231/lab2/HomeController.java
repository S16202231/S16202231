package webadv.s16202231.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {  	
	
	@GetMapping("/")
	public String welcome(Model model) {   
	    return "ajax";		
	}
}
