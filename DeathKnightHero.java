package com.siqi.kattis;

import java.util.Scanner;

public class DeathKnightHero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfBattles=sc.nextInt();
		 
		int numberOfwin=0;
		for (int i=0;i<numberOfBattles;i++) {
			String ability=sc.next();
			if(!ability.contains("CD")) {
				numberOfwin++;
			}
		}
		System.out.println(numberOfwin);
		sc.close();
	}

}
