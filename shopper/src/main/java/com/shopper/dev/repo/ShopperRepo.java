package com.shopper.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopper.dev.dao.UserDAO;
import com.shopper.dev.model.User;

public interface ShopperRepo extends JpaRepository<Integer, Integer>{

	public UserDAO getUser(User user);
}
