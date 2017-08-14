package theshop.mvc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import theshop.mvc.Service.CategoryService;
import theshop.mvc.Service.UserService;
import theshop.mvc.model.User;

@Controller
public class HomeController {

	private UserService userService;
	@Autowired
	HttpSession httpSession;
	@Autowired(required=true)	
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	CategoryService categoryService;
	@Autowired(required=true)
	@Qualifier(value="categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	
	
	@RequestMapping(value = {"/","/welcome","index"})
	public String welcome(){	
		httpSession.setAttribute("listcategory",categoryService.getAllCategory());
		return "index";
	}
	
	@RequestMapping(value={"/aboutus"})
	public String aboutus( Model m){
		m.addAttribute("aboutus", "Welcome to About Us Page.");
		return "aboutus";
	}
	
	@RequestMapping(value = {"/signup"})
	public String signup(Model m){
		m.addAttribute("signupuser", new User());	
		return "signup";
	}
	
	@RequestMapping(value = {"/contactus"})
	public String contactus(){		
		return "contactus";
	}

	@RequestMapping(value={"/submituserdetails"}, method=RequestMethod.POST)
	public String signupSuccess(@Valid @ModelAttribute("signupuser")User signupuser, BindingResult result){
		
		if(result.hasErrors()){
			System.out.println("Home controller error");
			return "signup";
		}
		else{
			userService.addUser(signupuser);
			System.out.println("Home controller success");
			return "signup";
		}
				
	}
	
	@RequestMapping(value = {"/login"})
	public String login(){		
		return "login";
	}
	
}
	

