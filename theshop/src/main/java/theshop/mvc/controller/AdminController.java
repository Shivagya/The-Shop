package theshop.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping(value="/adminHome")
	public String adminHome()
	{
		
		return "admin/adminHome";
	}
	
	
}
