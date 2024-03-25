package in.Namitha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class MsgController {
	
	@GetMapping("/greet")
	public  ModelAndView getMsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome to Mysite");
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("/welcome")
	public ModelAndView getMsg1() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg1", "Welcome to Dashboard");
		mav.setViewName("index");
		return mav;
		
	}
	

}
