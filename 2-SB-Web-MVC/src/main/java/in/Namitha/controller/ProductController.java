package in.Namitha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.Namitha.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("product",productService.getAllProducts());
		mv.setViewName("product");
		return mv;
	}
	
	

}
