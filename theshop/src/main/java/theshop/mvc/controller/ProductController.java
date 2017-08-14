package theshop.mvc.controller;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import theshop.mvc.Service.CategoryService;
import theshop.mvc.Service.ProductService;
import theshop.mvc.model.Product;


@Controller
public class ProductController {
	
//	@RequestMapping(value="/product_details", method=RequestMethod.GET)
//	public ModelAndView getproduct_details(Model m){
//	
//		m.addAttribute("product",new Product());
//		ModelAndView m1 = new ModelAndView("product_details");
//		return m1;
//	}
	
	ProductService productService;
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	
	CategoryService categoryService;
	@Autowired(required=true)
	@Qualifier(value="categoryService")
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	

	@RequestMapping(value="/adminproductdetails", method=RequestMethod.GET)
	public String getproduct_details(Model m){
		
		m.addAttribute("product",new Product());
		m.addAttribute("listproducts",productService.getAllProduct());
		m.addAttribute("listcategory",categoryService.getAllCategory());
	
		return "adminproductdetails";
	}
	
//	@ModelAttribute
//	public void commonobjects(Model m1){
//		m1.addAttribute("msg","Detalis Submitted Successfully...");
//	}
	
	
	@RequestMapping(value="/adminsubmitproductdetails", method=RequestMethod.POST)
	public ModelAndView submitDetails(@Valid @ModelAttribute("product") Product product1, BindingResult result,HttpServletRequest request){
		
		if(result.hasErrors()){
			//System.out.println(result);
			
			ModelAndView m1= new ModelAndView("adminproductdetails");			
			m1.addObject("listproducts",productService.getAllProduct());
			return m1;
		}
		
		else{
					if(product1.getPid()==0){
							productService.addProduct(product1);
							MultipartFile file = product1.getImage();
							String location = request.getSession().getServletContext().getRealPath("/resources/images/");
							System.out.println(location);
					
							String filename = location+"\\"+product1.getPid()+".jpg";
							System.out.println(filename);
					
							try {
								byte b[]=file.getBytes();
								FileOutputStream fos = new FileOutputStream(filename);
								fos.write(b);
								fos.close();
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
					
							}
				
				
							else{
								System.out.println("product is updating");
								this.productService.updateProduct(product1);
							}
			}
		ModelAndView m1= new ModelAndView("redirect:/adminproductdetails");			
		
		return m1;
		
		
	}
	
	
	@RequestMapping("/delete/{id}")
	String deleteProduct(@PathVariable("id") int id)
	{
		this.productService.deleteProduct(id);
	    return "redirect:/adminproductdetails";
	}
	    		
	@RequestMapping("/edit/{id}")
    public String updateProduct(@PathVariable("id") int id, Model model){
		System.out.println("update in controller and id is = "+id);
        model.addAttribute("product", this.productService.getProductById(id));//blank object created in upper req. mapping method for command name
        model.addAttribute("listproducts",this.productService.getAllProduct());//all objects of model stored in object of list in upper request mapping
        return "adminproductdetails";
    }
	
	

	
	}

