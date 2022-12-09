package com.demo.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class j_unit_evenodd {
	
	public static String checkevenodd(int x) {
		int count=0;
			if(x%2==0) {
				count++;
			
			}
			if(count==0) {
				return "odd";
			}else {
				return "even";
			}
	}
	

	public  class evebOdd{
		@Test
		public void checkEvenOdd() {
			assertEquals("even", jUnit_example.checkevenodd(8));
		//	assertEquals("odd", jUnit_example.checkevenodd(7));
			
			
		
}


}}
