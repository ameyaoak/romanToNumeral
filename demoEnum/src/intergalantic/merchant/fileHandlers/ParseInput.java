package intergalantic.merchant.fileHandlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ParseInput {
	
	private ProcessInput processInput = new ProcessInput();
	
	public void readFile(String fileName) throws IOException {
		InputStream is = ParseInput.class.getResourceAsStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		if (br != null) {
			String line;
			while ((line = br.readLine()) != null) {
				processInput.process(line);
			}
		}
		br.close();
	}
  
	 
}
