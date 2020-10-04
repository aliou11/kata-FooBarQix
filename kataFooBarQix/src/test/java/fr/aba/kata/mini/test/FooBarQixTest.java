package fr.aba.kata.mini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.aba.kata.mini.FooBarQix;



public class FooBarQixTest {
	
	private FooBarQix fooBarQix;
	
	@Before
	public void setUp() {
		
		 fooBarQix = FooBarQix.getInstance();
		
	
	}
	
	
	@Test
	public void testFindAll() {

		List<Integer> tab= new ArrayList<Integer>();
		for(int i = 1; i<=100;i++) {
			System.out.println(i+" - "+fooBarQix.traiterFooBarQiX(i));
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
