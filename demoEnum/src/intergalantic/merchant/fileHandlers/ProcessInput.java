package intergalantic.merchant.fileHandlers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import intergalantic.merchant.Constants;
import intergalantic.merchant.Validator;
import intergalantic.merchant.convertor.ConvertRomanToNumber;

public class ProcessInput {

	private Validator validator = new Validator();
	private ConvertRomanToNumber conversionService = new ConvertRomanToNumber();
	private ResultPrinter printer = new ResultPrinter();
	private Map<String, String> keyValueMap = new HashMap<>();

	public void process(String line) {
		if (line.matches(Constants.REGEX_SINGLE_INIT)) {
			processInitStatement(line);
		} else if (line.matches(Constants.REGEX_MULTI_INIT)) {
			processMultiInitStatement(line);
		} else if (line.startsWith(Constants.HOW_MANY_CREDITS) || line.startsWith(Constants.HOW_MUCH_IS)) {
			printer.printAnswer(line, processQuestions(line));
		} else {
			printer.printError("I have no idea what you are talking about");
		}
	}

	private void processMultiInitStatement(String line) {
		List<String> words = Arrays.asList(line.split(Constants.SPACE));
		StringBuilder br = new StringBuilder();

		Iterator<String> iterator = words.iterator();
		String value = "";
		String metal = "";
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (word.equals("is")) {
				keyValueMap.put(metal, String.valueOf(
						Double.parseDouble(iterator.next()) / new ConvertRomanToNumber().calculate(br.toString())));
				break;
			}
			if ((value = keyValueMap.get(word)) != null) {
				br.append(value);
			} else {
				metal = word;
				keyValueMap.put(metal, null);
			}
		}
	}

	private void processInitStatement(String line) {
		List<String> words = Arrays.asList(line.split(Constants.SPACE));
		keyValueMap.put(words.get(0), words.get(2));
	}

	private double processQuestions(String line) {
		List<String> words = Arrays.asList(line.split(Constants.SPACE));
		Iterator<String> iterator = words.iterator();
		StringBuilder br = new StringBuilder();
		String metalValue = null;
		String value = null;
		double answer = 0d;
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (keyValueMap.containsKey(word)) {
				value = keyValueMap.get(word);
				if (validator.isValidRoman(value)) {
					br.append(value);
				} else {
					metalValue = value;
				} 
			}
		}

		if (value != null) {
			answer = conversionService.calculate(br.toString());
			if (metalValue != null) {
				answer *= Double.parseDouble(metalValue);
			}
		} 
		return answer;

	}

}
