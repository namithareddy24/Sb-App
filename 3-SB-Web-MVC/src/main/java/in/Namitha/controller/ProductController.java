package in.Namitha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.Namitha.bindings.Product;
import in.Namitha.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ModelAndView loadForm() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("product", new Product());
		mv.setViewName("index");
		return mv;
	}
	@PostMapping("/product")
	public ModelAndView saveProduct(Product product) {
		ModelAndView mv=new ModelAndView();
		boolean status = productService.saveProduct(product);
		if(status) {
			mv.addObject("smsg", "Product saved");
		}else {
			mv.addObject("emsg", "Failed to save");
		}
		mv.addObject("product", new Product());
		mv.setViewName("index");
		return mv;
		
	}
	@GetMapping("/products")
	public ModelAndView viewProducts() {
		ModelAndView mv = new ModelAndView();
		List<Product> products =productService.getAllProducts();
		mv.addObject("plist", products);
		mv.setViewName("data");
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteProduct(Integer id) {
		ModelAndView mv=new ModelAndView("redirect:/product/products");
		productService.deleteProduct(id);
		List<Product> products =productService.getAllProducts();
		mv.addObject("plist", products);
		mv.setViewName("data");
		return mv;
	}
	
	@GetMapping("/update")
	public ModelAndView updateProduct(Integer id) {
		ModelAndView mv = new ModelAndView("update");
		if(id!=null) {
		Product product = productService.getProductById(id);
		if(product!=null) {
		mv.addObject("product", product);
		}else {
			mv.addObject("emsg", "Product not found");
		}
		}else {
			mv.addObject("emsg", "Product Id is missing");
		}
		return mv;
		}
	

}