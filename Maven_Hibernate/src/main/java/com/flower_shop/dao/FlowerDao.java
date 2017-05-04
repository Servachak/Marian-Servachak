package com.flower_shop.dao;

import java.util.List;

import com.flover_shop.entity.Flower;
import com.flover_shop.entity.Orders;

public interface FlowerDao {
	
	void save(Flower flower);
	List<Flower> fineAll();
	Flower findOne(String name);
	void remove(String name);
	void update(Flower flower);
	void addFloverToOrders(Flower flower, Orders orders );

}
