package com.prasad;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testGetSum() {
		System.out.println("Testing getsum");
		int a = 10;
		int b = 10;
		
		assertEquals(20, a+b);
	}

}
