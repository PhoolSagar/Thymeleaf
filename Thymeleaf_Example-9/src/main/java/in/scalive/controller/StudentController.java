package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;




@Controller
public class StudentController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String home(Model m) {
		m.addAttribute("id", 101);
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/showStudent/{id}")
	public String showStudents(Model m, @PathVariable("id") int id) {
		System.out.println("id : "+id);
		Student s = new Student();
		s.setId(101);
		s.setName("Sagar");
		s.setCourse("SpringBoot");
		
		m.addAttribute("st", s);
		return "show-Students";
	}

}
