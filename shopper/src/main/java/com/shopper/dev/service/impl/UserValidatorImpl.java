package com.shopper.dev.service.impl;

import com.shopper.dev.dao.UserDAO;
import com.shopper.dev.model.User;
import com.shopper.dev.repo.ShopperRepo;
import com.shopper.dev.service.UserValidator;

public class UserValidatorImpl implements UserValidator {

UserDAO userDao ;
ShopperRepo repo ;


	
	@Override
	public User validateCred(User user) {
		if (user != null ) {
			repo.getUser();
		}
		return null;
	}

}
