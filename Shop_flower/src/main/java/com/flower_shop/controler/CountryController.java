package com.flower_shop.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flower_shop.entity.Country;
import com.flower_shop.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/country")
	public String country(Model model){
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}
	
	@PostMapping("/country")
	public String county(@RequestParam String countryName){
		countryService.save(new Country(countryName));
					
		return "redirect:/country";
	} 
	@GetMapping("deleteCountry/{id}")
	public String deleteCountry(@PathVariable int id){
		countryService.delete(id);
		return "country";
	}
}
