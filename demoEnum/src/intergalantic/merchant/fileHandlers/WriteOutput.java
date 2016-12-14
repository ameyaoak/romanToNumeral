package intergalantic.merchant.fileHandlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteOutput {

	public void writeOutput(StringBuilder sb){ 
		PrintWriter writer = null;
		try{ 
		String path = "/Users/oaka/git/romanToNumbers/demoEnum/resource/output.txt";  
		writer = new PrintWriter(new File(path)); 
		writer.println(sb);
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
}
