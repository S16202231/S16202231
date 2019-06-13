package webadv.s16202231.p1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// inject via application.properties
    @Value("${welcome.message}")
    private String message;
	
    private List<String> tasks = Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");
    
    @GetMapping("/")
	public String index(Model model) {
    	model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
		return "welcome";		
	}
    @PostMapping("add")
    public String Add(String a,String b, Model model) {
    	//System.out.println(a+b);
    	int m,n;
//    	try {
//    		m = Integer.parseInt(a);
//    		n = Integer.parseInt(b); 
//    	}catch(NumberFormatException) {
//    		
//    	}
    	model.addAttribute("a",a);
    	model.addAttribute("b",b);
    	model.addAttribute("result",a+b);   	
    	return index(model);
    }
}
