package com.flower_shop.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flower_shop.entity.User;
import com.flower_shop.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/registration")
	public String registration(Model model){
		model.addAttribute("users", userService.findAll());
		return "registration";
	}
	
	@PostMapping("/registration")
	public String registration(@RequestParam String userName
			,@RequestParam String userEmail
			,@RequestParam String userPassword
			,@RequestParam String userSex){
		
		User user = new User(userName, userPassword, userSex, userEmail);
		
		userService.save(user);
		return "redirect:/registration";
	}
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id){
		userService.delete(id);
		return "registration";
	}
}
