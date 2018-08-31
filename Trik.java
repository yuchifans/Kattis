package com.siqi.kattis;
import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ballPosition=1;
		String inputText = sc.nextLine();
		char[] ArrayText=inputText.toCharArray();
		for (char c:ArrayText) {
			if(c=='A') {
				switch (ballPosition) {
				case 1:
					ballPosition += 1; break;
				case 2:
					ballPosition -= 1; break;
				}
			}else if(c=='B') {
				switch (ballPosition) {
				case 2:
					ballPosition += 1; break;
				case 3:
					ballPosition -= 1; break;
				}
			}else if(c=='C') {
				switch (ballPosition) {
				case 1:
					ballPosition += 2; break;
				case 3:
					ballPosition -= 2; break;
				}
			}
			
		}
		System.out.println(ballPosition);
		sc.close();
	}

}
