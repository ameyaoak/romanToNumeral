package intergalantic.merchant.fileHandlers;

import intergalantic.merchant.Constants;

public class ResultPrinter {
	
	private StringBuilder sb = new StringBuilder();
	private WriteOutput out = new WriteOutput();

	public void printAnswer(String line, double answer) {
		line = line.replace(Constants.QUESTION, "is " + answer);
		if (line.contains(Constants.HOW_MANY_CREDITS)) {
			printAnswerForHowManyCredits(line, answer);
		} else if (line.contains(Constants.HOW_MUCH_IS)) {
			printAnswerForHowMuchIs(line, answer);
		}
		out.writeOutput(sb);
	}

	private void printAnswerForHowManyCredits(String line, double answer) {
		line = line.replace(Constants.HOW_MANY_CREDITS, ""); 
		sb.append(line + " Credits\n") ;

	}

	private void printAnswerForHowMuchIs(String line, double answer) { 
		line = line.replace(Constants.HOW_MUCH_IS,"");
		sb.append(line+"\n");
	}

	public void printError(String string) {
		sb.append(string+"\n");
		
	}
}
