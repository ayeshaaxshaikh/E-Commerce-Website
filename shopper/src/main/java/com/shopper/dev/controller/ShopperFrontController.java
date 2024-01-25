package com.shopper.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopper.dev.model.User;
import com.shopper.dev.service.UserValidator;



@RestController
@RequestMapping("/api/shopper")
public class ShopperFrontController {

@Autowired
UserValidator validator ;	
	
	@PostMapping("/user")
	public ResponseBody userCredential(@RequestBody User user ) {
		validator.validateCred(user);
		return null;
	}
	
	

}
