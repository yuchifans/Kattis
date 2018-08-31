package com.siqi.kattis;
import java.util.Scanner;

public class NewAphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputText=sc.nextLine();	
		String outputText=inputText.toLowerCase();
		String[][] alphbet=  {{"a","@"},{"b","8"},{"c","("},{"d","|)"},{"e", "3"},{"f","#"},{"g","6"},
				{"h","[-]"},{"i","|"},{"j","_|"},{"k","|<"},{"l","1"},{"m","[]\\/[]"},{"n","[]\\[]"},
				{"o","0"},{"p","|D"},{"q","(,)"},{"r","|Z"},{"s","$"},{"t","']['"},{"u","|_|"},{"v","\\/"},
				{"w","\\/\\/"},{"x","}{"},{"y","`/"},{"z","2"}};
		for(int i=0; i<alphbet.length;i++) {	
			outputText=outputText.replace(alphbet[i][0], alphbet[i][1]);
		}
		System.out.println(outputText);
		sc.close();
	}

}
