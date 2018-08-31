package com.siqi.kattis;

import java.util.Scanner;

public class ColdPuterScience {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfTemp=sc.nextInt();
		int temp=0;
		int count=0;
		for (int i=0;i<numberOfTemp;i++) {
			temp= sc.nextInt();
			if (temp<0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
