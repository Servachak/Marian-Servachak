package com.flower_shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flower_shop.entity.Orders;
import com.flower_shop.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

	
	
}
