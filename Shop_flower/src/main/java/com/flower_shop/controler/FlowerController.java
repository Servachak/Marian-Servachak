package com.flower_shop.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flower_shop.entity.Flower;
import com.flower_shop.service.FlowerService;

@Controller
public class FlowerController {

	@Autowired
	private FlowerService flowerService;
	
	@GetMapping("/flower")
	public String flower(Model model){
		model.addAttribute("flowers", flowerService.findAll());
		return "/flower";
	}
	
	@PostMapping("/flower")
	public String flower(@RequestParam String flowerName,
			             @RequestParam String flowerColor,
			             @RequestParam String flowerPrice){
		
		Flower flower = new Flower();
		flower.setName(flowerName);
		flower.setColor(flowerColor);
		flower.setPrice(Integer.parseInt(flowerPrice));
		
		flowerService.save(flower);
		
		return "redirect:/flower";
	}
	@GetMapping("/deleteFlower/{id}")
	public String deleteFlower(@PathVariable int id){
		
		flowerService.delete(id);
		return "flower";
	}
}
