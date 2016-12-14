package intergalantic.merchant;

import java.io.IOException;

import intergalantic.merchant.fileHandlers.ParseInput;

public class IntergalanticApp {

	public static void main(String[] args) throws IOException { 
		new ParseInput().readFile(Constants.INPUT_FILE_NAME);
	}  
	
}
