package com.flower_shop.dao;

import java.util.List;

import com.flover_shop.entity.Country;
import com.flover_shop.entity.Flower;

public interface CountryDao {

	void save(Country country);
	List<Country> findAll();
	Country fineOne(String name);
	void remove(String name);
	void update(Country country);
	void addFlowerToCountry(Flower flower, Country country);
}
