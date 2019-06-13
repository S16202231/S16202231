package webadv.s16202231.p3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private List<String> tasks = Arrays.asList("Jakarta EE", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");    
	@GetMapping("/")
	public String welcome(Model model) {    	
		model.addAttribute("tasks", tasks);  
	    return "welcome";		
	}
}
