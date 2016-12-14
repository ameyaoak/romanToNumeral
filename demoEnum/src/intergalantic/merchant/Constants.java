package intergalantic.merchant;

public interface Constants {

	String REGEX_VALID_ROMAN = "(^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$)";
	String REGEX_SINGLE_INIT = "(^([a-zA-Z]+ is [MDCLXVI])$)";
	String REGEX_MULTI_INIT = "(^([a-zA-Z\\s])+ is [0-9]+ Credits$)";
	String INPUT_FILE_NAME = "/input.txt";
	String OUTPUT_FILE_NAME = "/output.txt";
	String HOW_MANY_CREDITS = "how many Credits is ";
	String HOW_MUCH_IS = "how much is ";
	String SPACE = " ";
	String QUESTION = "?";

} 
