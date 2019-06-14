package webadv.s16202231.lab3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import webadv.s16202231.lab3.entity.User;

@Controller
public class HelloController{
	@GetMapping("/")
	public String welcome(@ModelAttribute("user")User user,Model model) {   
	    return "login";		
	}

}
