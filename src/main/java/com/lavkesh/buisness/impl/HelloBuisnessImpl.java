package com.lavkesh.buisness.impl;

import org.springframework.stereotype.Service;

import com.lavkesh.buisness.HelloBuisness;

@Service("helloBuisness")
public class HelloBuisnessImpl implements HelloBuisness {

	@Override
	public String getHelloMessage(String username) {
		return "Hello "+username+"!";
	}

}
