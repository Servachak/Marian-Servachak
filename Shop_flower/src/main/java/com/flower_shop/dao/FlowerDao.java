package com.flower_shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flower_shop.entity.Flower;
import com.flower_shop.entity.Orders;

public interface FlowerDao extends JpaRepository<Flower, Integer> {
	
	

}
