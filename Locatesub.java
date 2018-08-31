package com.siqi.kattis;
import java.util.Scanner;

public class Locatesub {
	int dictionary[] = new int[26];
	private String decrypt(String line, String key) {
		int counter = 0;
		int startIndex = 0;
		for (int i = 0; i < 1 + line.length() - key.length(); i++) {
			if (canMatch(line.substring(i, i + key.length()), key)) {
				counter++;
				startIndex = i;
			}
		}
		if (counter == 0) {
			return "0";
		} else if (counter == 1) {
			return line.substring(startIndex, startIndex + key.length());
		}
		return Integer.toString(counter);
	}

	public boolean canMatch(String s1, String s2) {
		for (int j = 0; j < s2.length(); j++) {
			Character keyChar = s2.charAt(j);
			Character sourceChar = s1.charAt(j);
			int keyCharIndex = ((int) keyChar) - 97;
			int sourceCharIndex = ((int) sourceChar) - 96;
			if (dictionary[keyCharIndex] == 0) {
				for (int a : dictionary) {
					if (a == sourceCharIndex) {
						dictionary = new int[26];
						return false;
					}
				}
				dictionary[keyCharIndex] = sourceCharIndex;
			} else if (dictionary[keyCharIndex] != sourceCharIndex) {
				dictionary = new int[26];
				return false;
			}
		}
		dictionary = new int[26];
		return true;
	}

	public static void main(String[] args) {
		Locatesub base = new Locatesub();
		Scanner scanner = new Scanner(System.in);
		String result = base.decrypt(scanner.nextLine(), scanner.nextLine());
		System.out.println(result);
		scanner.close();
	}

}
