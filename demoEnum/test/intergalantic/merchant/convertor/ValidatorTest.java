package intergalantic.merchant.convertor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import intergalantic.merchant.Validator;

public class ValidatorTest {
	
	Validator validator=null;
	
	@Before
	public void init(){
		validator = new Validator();
	}
	  
	@Test
	public void isValidRoman_I() {
		assertEquals(true, validator.isValidRoman("I"));
	}
  
	@Test
	public void isValidRoman_II(){ 
		assertEquals(true, validator.isValidRoman("II"));
	}
	
	@Test
	public void isValidRoman_VI(){ 
		assertEquals(true, validator.isValidRoman("VI"));
	}
	

	@Test
	public void isValidRoman_VIII(){ 
		assertEquals(true, validator.isValidRoman("VIII"));
	}
	
	@Test
	public void isValidRoman_IV(){ 
		assertEquals(true, validator.isValidRoman("IV"));
	}
	
	@Test
	public void isValidRoman_XI(){ 
		assertEquals(true, validator.isValidRoman("X"));
	}
	
	@Test
	public void isValidRoman_M(){ 
		assertEquals(false, validator.isValidRoman("DD"));
	}
	
	@Test
	public void isValidRoman_MD(){ 
		assertEquals(false, validator.isValidRoman("XXXX"));
	}
	
	@Test
	public void isValidRoman_MCMXCIX(){ 
		assertEquals(true, validator.isValidRoman("MCMXCIX"));
	}
	
	@Test
	public void isValidRoman_Invalid_Input(){  
		assertEquals(false, validator.isValidRoman("INVALID_INPUT"));
	}
	
}
