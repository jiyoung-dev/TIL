package exam.springMVCExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	// get 방식으로 들어왔을때 
	@GetMapping("/test") 
	public String test() { 
		 return "test"; 
	}
}
