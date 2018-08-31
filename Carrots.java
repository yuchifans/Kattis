package com.siqi.kattis;

import java.util.Scanner;

public class Carrots {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] ArrayS=s.split(" ");
		String inputnumber=ArrayS[0];
		String token=ArrayS[ArrayS.length-1];
		for(int i=0;i<Integer.parseInt(inputnumber);i++) {
			s=sc.nextLine();	
		}
		System.out.println(token);
		sc.close();
	}

}
