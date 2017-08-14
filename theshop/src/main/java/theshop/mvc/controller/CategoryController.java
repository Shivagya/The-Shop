package theshop.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import theshop.mvc.Service.CategoryService;
import theshop.mvc.model.Category;



@Controller
public class CategoryController {
	
	CategoryService categoryService;
	@Autowired(required=true)
	@Qualifier(value="categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	

	@RequestMapping(value="/admincategorydetails", method=RequestMethod.GET)
	public String getcategory_details(Model m){
		
		m.addAttribute("category",new Category());
		m.addAttribute("listCategory",categoryService.getAllCategory());
	
		return "admincategorydetails";
	}
	


	@RequestMapping(value={"/adminsubmitcategorydetails"}, method=RequestMethod.POST)
	public ModelAndView submitDetails(@Valid @ModelAttribute("category") Category category1, BindingResult result,HttpServletRequest request){
		
		ModelAndView m1= new ModelAndView("redirect:/admincategorydetails");		
		if(result.hasErrors())
		{
			//System.out.println(result);
			m1.addObject("listCategory",categoryService.getAllCategory());
			return m1;
		}
		else{
			if(category1.getCategory_id()==null)
			{
				categoryService.addCategory(category1);		
		      }
		    else{
			System.out.println("Category is updating");
			this.categoryService.updateCategory(category1);
			}
			return m1;
		}
	}
	
	
	@RequestMapping("/deletec/{id}")
	String removeCategory(@PathVariable("id") String id)
	{
		this.categoryService.removeCategory(id);
	    return "redirect:/admincategorydetails";
	}
	    		
	@RequestMapping("/editc/{id}")
    public String updateCategory(@PathVariable("id") String id, Model model){
		System.out.println("update in Category controller and id is = "+id);
        model.addAttribute("category", this.categoryService.getCategoryById(id));//blank object created in upper request mapping method for command name
        model.addAttribute("listCategory",this.categoryService.getAllCategory());//all objects of model stored in object of list in upper request mapping
        return "admincategorydetails";
    }
	
	

	
	}

