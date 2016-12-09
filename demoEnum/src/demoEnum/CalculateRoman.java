package demoEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CalculateRoman {

	public int calculate(String input) {
		
		if(input.matches("(^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$)")){
			System.out.println("Valid number");
		}
		int number = 0;
		List<String> chars = Arrays.asList(input.split(""));
		List<Integer> charsInt = new ArrayList<Integer>();
		List<Roman> romans = Arrays.asList(Roman.values());
		
//		for (int i = 0; i < chars.size(); i++) {
//			 String charOne = chars.get(i);
//			 String charTwo = chars.get(i+1);
//			 String charThree = chars.get(i+2);
//			 String charFour = chars.get(i+3);
//			   
//			 if(Arrays.asList("I","X","C","M").contains(charOne) &&
//					 charOne.equals(charTwo) && charOne.equals(charTwo) && 
//					 charOne.equals(charThree) && charOne.equals(charFour)){
//				 System.out.println("Invalid Roman");
//			 }
//			 
//			 if(Arrays.asList("D","L","V").contains(charOne) && 
//					 charOne.equals(charTwo)){
//				 System.out.println("Invalid Roman");
//			 }
//			 
//			 if(charOne.equals("I") && Arrays.asList("X","V").contains(charTwo)){
//				 System.out.println("Good");
//			 }
//			 
//			 if(charOne.equals("X") && Arrays.asList("L","C").contains(charTwo)){
//				 System.out.println("Good");
//			 }
//
//			 if(charOne.equals("C") && Arrays.asList("D","M").contains(charTwo)){
//				 System.out.println("Good");
//			 }
//			 
//			 
//		}
		
		for (String charecter : chars) {
			 
			if (!(romans).contains(charecter))
				charsInt.add(Roman.valueOf(charecter).getValue());
			else
				throw new RuntimeException("Invalid Roman");

		}
 
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
	
	

//	 The symbols "I", "X", "C", and "M" can be repeated three times in succession, but no more. (They may appear four times if the third and fourth are separated by a smaller value, such as XXXIX.) "D", "L", and "V" can never be repeated.
//	 
//
//	"I" can be subtracted from "V" and "X" only. "X" can be subtracted from "L" and "C" only. "C" can be subtracted from "D" and "M" only. "V", "L", and "D" can never be subtracted.
//
//	Only one small-value symbol may be subtracted from any large-value symbol.
//	A number written in [16]Arabic numerals can be broken into digits. For example, 1903 is composed of 1, 9, 0, and 3. To write the Roman numeral, each of the non-zero digits should be treated separately. Inthe above example, 1,000 = M, 900 = CM, and 3 = III. Therefore, 1903 = MCMIII.
//
//
//	Test input:
//	glob is I
//	prok is V
//	pish is X
//	tegj is L
//	glob glob Silver is 34 Credits
//	glob prok Gold is 57800 Credits
//	pish pish Iron is 3910 Credits
//	how much is pish tegj glob glob ?
//	how many Credits is glob prok Silver ?
//	how many Credits is glob prok Gold ?
//	how many Credits is glob prok Iron ?
//	how much wood could a woodchuck chuck if a woodchuck could chuck wood ?
//	 
//	Test Output:
//	pish tegj glob glob is 42
//	glob prok Silver is 68 Credits
//	glob prok Gold is 57800 Credits
//	glob prok Iron is 782 Credits
//	I have no idea what you are talking about
}
