package intergalantic.merchant.convertor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConvertRomanToNumberTest {
	ConvertRomanToNumber cr = null;

	@Before
	public void init() {
		cr = new ConvertRomanToNumber();
	}

	@Test
	public void calculateIntegerFromRoman_I() {
		assertEquals(1, cr.calculate("I"));
	}

	@Test
	public void calculateIntegerFromRoman_II() {
		assertEquals(2, cr.calculate("II"));
	}

	@Test
	public void calculateIntegerFromRoman_VI() {
		assertEquals(6, cr.calculate("VI"));
	}

	@Test
	public void calculateIntegerFromRoman_VIII() {
		assertEquals(8, cr.calculate("VIII"));
	}

	@Test
	public void calculateIntegerFromRoman_IV() {
		assertEquals(4, cr.calculate("IV"));
	}

	@Test
	public void calculateIntegerFromRoman_XI() {
		assertEquals(10, cr.calculate("X"));
	}

	@Test
	public void calculateIntegerFromRoman_M() {
		assertEquals(1000, cr.calculate("M"));
	}

	@Test
	public void calculateIntegerFromRoman_MD() {
		assertEquals(1500, cr.calculate("MD"));
	}

	@Test
	public void calculateIntegerFromRoman_MCMXCIX() {
		assertEquals(1999, cr.calculate("MCMXCIX"));
	}

	@Test
	public void calculateIntegerFromRoman_Invalid_Input() {
		assertEquals(0, cr.calculate("INVALID_INPUT"));
	}
}
