package com.flower_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flower_shop.dao.CountryDao;
import com.flower_shop.dao.FlowerDao;
import com.flower_shop.entity.Country;
import com.flower_shop.entity.Flower;
import com.flower_shop.service.FlowerService;

@Service
public class FlowerServiceImpl implements FlowerService{

	@Autowired
	private FlowerDao flowerDao;
	@Autowired CountryDao countryDao;
	
	
	public void save(Flower flower, int coun) {
				
		Country country = countryDao.findOne(coun);
		
		flowerDao.saveAndFlush(flower);
		
		flower.getCountrys().add(country);
		
		flowerDao.save(flower);
		
	}

	public List<Flower> findAll() {
		return flowerDao.findAll();
	}

	public Flower findOne(int id) {
		return flowerDao.findOne(id);
	}

	public void delete(int id) {
		flowerDao.delete(id);
		
	}

	public void update(Flower flower) {
		flowerDao.save(flower);
		
	}
	public List<Flower> flowerWithCountry(){
		return  flowerDao.flowerWithCountry();
	}

	

}
