package demoEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CalculateRoman {

	public int calculate(String input) {
		int number = 0;
		List<String> chars = Arrays.asList(input.split(""));
		List<Integer> charsInt = new ArrayList<Integer>();
		List<Roman> romans = Arrays.asList(Roman.values());
		
		for (int i = 0; i < chars.size(); i++) {
			 String charOne = chars.get(i);
			 String charTwo = chars.get(i+1);
			 String charThree = chars.get(i+2);
			 String charFour = chars.get(i+3);
			   
			 if(Arrays.asList("I","X","C","M").contains(charOne) &&
					 charOne.equals(charTwo) && charOne.equals(charTwo) && 
					 charOne.equals(charThree) && charOne.equals(charFour)){
				 System.out.println("Invalid Roman");
			 }
			 
			 if(Arrays.asList("D","L","V").contains(charOne) && 
					 charOne.equals(charTwo)){
				 System.out.println("Invalid Roman");
			 }
			 
			 if(charOne.equals("I") && Arrays.asList("X","V").contains(charTwo)){
				 System.out.println("Good");
			 }
			 
			 if(charOne.equals("X") && Arrays.asList("L","C").contains(charTwo)){
				 System.out.println("Good");
			 }

			 if(charOne.equals("C") && Arrays.asList("D","M").contains(charTwo)){
				 System.out.println("Good");
			 }
			 
			 
		}
		
		for (String charecter : chars) {
			 
			if (!(romans).contains(charecter))
				charsInt.add(Roman.valueOf(charecter).getValue());
			else
				throw new RuntimeException("Invalid Roman");

		}

		// List<Integer> charsInt =
		// chars.stream().map(a->(Roman.valueOf(a).getValue())).collect(Collectors.toList());

		Iterator<Integer> iterator = charsInt.iterator();
		while (iterator.hasNext()) {
			int left = 0, right = 0;
			if (iterator.hasNext())
				left = iterator.next();
			if (iterator.hasNext())
				right = iterator.next();

			if (left < right)
				number += right - left;
			else
				number += right + left;
		}
		return number;
	}

	public static void main(String[] args) {

		Roman glob = Roman.I;
		Roman prok = Roman.V;
		Roman pish = Roman.X;
		Roman tegj = Roman.L; 

		System.out.println(new CalculateRoman().calculate("VX"));
		// List<Integer> charsIn = Arrays.asList(1,2,3,1);
		// charsIn.forEach(a -> System.out.println(a));
	}
}
