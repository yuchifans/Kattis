package com.siqi.kattis;

import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] pieceSet=new int[] {1,1,2,2,2,8};
		int numberToBeFound=0;
		int numberOfRemain=0;
		for(int i=0; i<pieceSet.length;i++) 
		{
			numberOfRemain=sc.nextInt(); 
			numberToBeFound=pieceSet[i]-numberOfRemain;
			System.out.print(numberToBeFound+" ");
		}
		sc.close();
	}
}
