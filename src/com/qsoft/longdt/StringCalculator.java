package com.qsoft.longdt;

import java.util.ArrayList;

public class StringCalculator {

	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else if (input.length() == 1) {
			return toInt(input);
		} else if (input.contains(",")) {
			return -1;
		}
	}

	private static ArrayList<Integer> toArray(String input) {
		String[] strArray = input.split(",");
		ArrayList<Integer> returnValues = new ArrayList<Integer>();
		for (String string : strArray) {
			returnValues.add(toInt(string));
		}
		return returnValues;
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}
}
