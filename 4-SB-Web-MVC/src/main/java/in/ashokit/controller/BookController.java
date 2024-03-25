package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.Book;

@Controller
public class BookController {
	// method to load form
	@GetMapping("/book")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookobj", new Book());
		mav.setViewName("bookView");
		return mav;
	}
	@PostMapping("/book")
	public ModelAndView handleBookSubmit(Book book) {
		System.out.println(book);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Book Saved sucessfully...");
		mav.setViewName("success");
		return mav;
	}

}
