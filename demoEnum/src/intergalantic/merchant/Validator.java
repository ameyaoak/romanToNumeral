package intergalantic.merchant;

public class Validator {

	public boolean isValidRoman(String roman){
		if(roman.matches(Constants.REGEX_VALID_ROMAN)){
			return true;
		}
		return false;
	} 
	 
}