package demoEnum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class romanTest {
	
	public final String input = "IV";

	@Test
	public void testRomanIis1() {
		assertEquals(1, Roman.I.getValue());
	}
  
	@Test
	public void calculateIntegerFromRoman_I(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(1, cr.calculate("I"));
	}
	
	@Test
	public void calculateIntegerFromRoman_VI(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(6, cr.calculate("VI"));
	}
	

	@Test
	public void calculateIntegerFromRoman_VIII(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(8, cr.calculate("VIII"));
	}
	
	@Test
	public void calculateIntegerFromRoman_IV(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(4, cr.calculate("IV"));
	}
	
	@Test
	public void calculateIntegerFromRoman_XI(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(10, cr.calculate("X"));
	}
	
	@Test
	public void calculateIntegerFromRoman_DMD(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(1000, cr.calculate("DMD"));
	}
	
	@Test
	public void calculateIntegerFromRoman_MDD(){
		CalculateRoman cr = new CalculateRoman();
		assertEquals(2000, cr.calculate("MDD"));
	}
	
	@Test(expected=RuntimeException.class)
	public void calculateIntegerFromRoman_Invalid_Input(){
		CalculateRoman cr = new CalculateRoman(); 
		cr.calculate("INVALID_INPUT"); 
	}
	
}
