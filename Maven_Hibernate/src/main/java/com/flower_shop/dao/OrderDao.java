package com.flower_shop.dao;

import java.time.LocalDate;
import java.util.List;

import com.flover_shop.entity.Flower;
import com.flover_shop.entity.Orders;
import com.flover_shop.entity.User;

public interface OrderDao {
	void save(Orders orders, User user, Flower flower);
	List<Orders> findAll();
	Orders findOne(LocalDate date);
	void remove(LocalDate date);
	void update(Orders orders);
	void addUserToOrders(User user, Orders orders);
	void addFloderToOrders(Flower flower, Orders orders);

}
