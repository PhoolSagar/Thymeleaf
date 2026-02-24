package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class MessageController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String showStudents() {
		return "message";
	}

}
