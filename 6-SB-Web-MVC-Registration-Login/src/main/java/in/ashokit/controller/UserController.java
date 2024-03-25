package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String Login(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/login")
	public String handleLogin(User user, Model model) {
		User userObj = userService.getUser(user.getEmail(), user.getPwd());
		
		if(userObj==null) {
			model.addAttribute("emsg", "Invalid Credentials");
			return "index";
		}else {
			model.addAttribute("msg", userObj.getName()+",Welcome to Namitha ...");
			return "dashboard";
		}
	}
	
	@GetMapping("/register")
	public String Register(Model model) {
		model.addAttribute("user", new User());
		return "registerView";
		
	}
	
	@PostMapping("/register")
	public String handleRegister(User user, Model model) {
		boolean status=userService.saveUser(user);
		if(status) {
			model.addAttribute("smsg", "user registered");
			
		}else {
			model.addAttribute("emsg","registration failed");
		}
		return "registerView";
	}
	
	@GetMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
}
