package com.lavkesh.buisness;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml"})
public class HelloBuisnessTest {
	
	@Autowired
	private HelloBuisness helloBuisness;
	
	@Test
	public void testHelloUser(){
		String helloMessage = helloBuisness.getHelloMessage("Lavkesh");
	 	Assert.assertEquals("Hello Lavkesh!", helloMessage);
	}

}
