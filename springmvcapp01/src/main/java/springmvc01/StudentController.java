package springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	  @RequestMapping("/") 
	  public String hello() {
		  return "index";
		  }
	 
	
	@ModelAttribute("course")
	public String Course() {
		return "Java";
	}
	
	@RequestMapping("addStudent")
	public String addStudent(@ModelAttribute("std") Student std) {
		return "Success";
	}
}
