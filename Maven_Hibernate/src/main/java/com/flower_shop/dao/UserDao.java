package com.flower_shop.dao;

import java.util.List;

import com.flover_shop.entity.Orders;
import com.flover_shop.entity.User;

public interface UserDao {

	void save(User user);
	List<User> findAll();
	User findOne(String name);
	void removeUser(String name, String password);
	void update(User user);
	void addOrderToUser(User user, Orders orders);
}
