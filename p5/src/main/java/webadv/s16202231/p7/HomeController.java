package webadv.s16202231.p7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	/*
	@GetMapping("/")
	public String welcome(Model model) {   
	    return "login";		
	}
	*/
	@GetMapping("/login")
	public String login(Model model,String account, String password) {
		
		if ("abc".equals(account) && "123".equals(password))
			return "plain_page";
		else
			return "login";
	}
	/*
	 * 
	@GetMapping("/login")
	public String login(Model model) {
		return "plain_page";
	}
	@PostMapping("/login")
	public String login(Model model,String account, String password) {
		if ("abc".equals(account) && "123".equals(password))
			return "home";
		else
			return "plain_page";
	}
	*/
}
