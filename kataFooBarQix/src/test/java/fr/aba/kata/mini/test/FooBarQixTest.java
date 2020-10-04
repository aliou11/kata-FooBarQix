package fr.aba.kata.mini.test;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.aba.kata.mini.FooBarQix;



public class FooBarQixTest {
	
	private FooBarQix fooBarQix;
	
	private static Logger logger = LoggerFactory.getLogger(FooBarQixTest.class);
	
	@Before
	public void setUp() {
		
		 fooBarQix = FooBarQix.getInstance();
		
	
	}
	
	
	@Test
	public void testFindAll() {

		for(int i = 1; i<=100;i++) {
			logger.info(i+" - "+fooBarQix.traiterFooBarQiX(i));
		}
		
		
	}
	
	
	@Test
	
	public void testdivisibleBy3AndContains3() {
		
		assertEquals("FOOFOO",fooBarQix.traiterFooBarQiX(3));
		
	}
	
	@Test
	
	public void testdivisibleBy5AndContains5() {
		
		assertEquals("BARBAR",fooBarQix.traiterFooBarQiX(5));
		
		
	}
	@Test

	public void testContains7() {
	
		assertEquals("QIX",fooBarQix.traiterFooBarQiX(7));
	
	
}


	@After
	public void tearDown() {
		
		
	}

}
