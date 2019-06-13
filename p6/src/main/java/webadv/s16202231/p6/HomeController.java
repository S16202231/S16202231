package webadv.s16202231.p6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.s16202231.p6.repository.TeacherRepository;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String welcome(Model model) {   
	    return "login";		
	}
	/*
	@GetMapping("/login")
	public String login(Model model,String account, String password) {
		if ("abc".equals(account) && "123".equals(password))
			return "home";
		else
			return "login";
	}
	*/
	@Autowired
	private TeacherRepository repository;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("teacher_list",repository.findAll());
		return "home";
	}
}
