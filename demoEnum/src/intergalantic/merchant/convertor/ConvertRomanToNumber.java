package intergalantic.merchant.convertor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import intergalantic.merchant.Validator;

public class ConvertRomanToNumber {

	private boolean isValidRomanString(String input){
		return new Validator().isValidRoman(input); 
	}
	
	private List<Integer> getNumberForRoman(String input) { 
		List<Integer> charsInt = new ArrayList<Integer>();
		for (String romanChar : Arrays.asList(input.split(""))) {
			charsInt.add(Roman.valueOf(romanChar).getValue());
		}
		return charsInt;
	}
	
	private int convertRomanToNumber(String input){ 
		 
		int number = 0;  
		Iterator<Integer> iterator = getNumberForRoman(new StringBuilder(input).reverse().toString()).iterator();
		while (iterator.hasNext()) {
			int left = 0, right = 0;
			
			if (iterator.hasNext())
				left = iterator.next();
			
			if (iterator.hasNext())
				right = iterator.next();

			if (left > right)
				number += left - right;
			else
				number += left + right;
		}
		return number;
	}

	public int calculate(String string) {
		if(isValidRomanString(string)){
			return convertRomanToNumber(string);
		}
		return 0; 
	}
}
