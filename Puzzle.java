package com.siqi.kattis;

import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] puzzel = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				puzzel[i][j] = sc.nextInt();
			}
		}
		int direction = sc.nextInt();
		switch (direction) {
		case 0:
			SwitchtoLeft(puzzel);
			break;
		case 1:
			SwitchtUp(puzzel);
			break;
		case 2:
			SwitchtRight(puzzel);
			break;
		case 3:
			SwitchtDown(puzzel);
			break;
		}
		sc.close();
	}

	private static void SwitchtoLeft(int[][] puzzel) {
		int[][] sp = puzzel;
		boolean[][] merged = new boolean[4][4];
		for (int n = 0; n < 3; n++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if ((sp[i][j] != 0) && (sp[i][j] == sp[i][j + 1]) && !merged[i][j]) {
						sp[i][j] += sp[i][j + 1];
						sp[i][j + 1] = 0;
						for (int k = 0; k <= j; k++) {
							merged[i][k] = true;
						}
					}
					if (sp[i][j] == 0) {
						sp[i][j] = sp[i][j + 1];
						sp[i][j + 1] = 0;
					}
				}
			}
		}
		printPuzzel(sp);
	}

	private static void SwitchtRight(int[][] puzzel) {
		int[][] sp = puzzel;
		boolean[][] merged = new boolean[4][4];
		for (int n = 0; n < 3; n++) {
			for (int i = 0; i < 4; i++) {
				for (int j = sp[0].length - 1; j > 0; j--) {
					if ((sp[i][j - 1] != 0) && (sp[i][j] == sp[i][j - 1]) && !merged[i][j]) {
						sp[i][j] += sp[i][j - 1];
						sp[i][j - 1] = 0;
						for (int k = sp[0].length - 1; k >= j; k--) {
							merged[i][k] = true;
						}
					}
					if (sp[i][j] == 0) {
						sp[i][j] = sp[i][j - 1];
						sp[i][j - 1] = 0;
					}
				}
			}
		}
		printPuzzel(sp);
	}

	private static void SwitchtUp(int[][] puzzel) {
		int[][] sp = puzzel;
		boolean[][] merged = new boolean[4][4];
		for (int n = 0; n < 3; n++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if ((sp[j][i] != 0) && (sp[j][i] == sp[j + 1][i]) && !merged[j][i]) {
						sp[j][i] += sp[j + 1][i];
						sp[j + 1][i] = 0;
						for (int k = 0; k <= j; k++) {
							merged[k][i] = true;
						}
					}
					if (sp[j][i] == 0) {
						sp[j][i] = sp[j + 1][i];
						sp[j + 1][i] = 0;
					}
				}
			}
		}
		printPuzzel(sp);
	}

	private static void SwitchtDown(int[][] puzzel) {
		int[][] sp = puzzel;
		boolean[][] merged = new boolean[4][4];
		for (int n = 0; n < 3; n++) {
			for (int i = 0; i < 4; i++) {
				for (int j = sp.length - 1; j > 0; j--) {
					if ((sp[j - 1][i] != 0) && (sp[j][i] == sp[j - 1][i]) && !merged[j][i]) {
						sp[j][i] += sp[j - 1][i];
						sp[j - 1][i] = 0;
						for (int k = sp[0].length - 1; k >= j; k--) {
							merged[k][i] = true;
						}
					}
					if (sp[j][i] == 0) {
						sp[j][i] = sp[j - 1][i];
						sp[j - 1][i] = 0;
					}
				}
			}
		}
		printPuzzel(sp);
	}

	private static void printPuzzel(int[][] puzzel) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(puzzel[i][j] + " ");
			}
			System.out.println();
		}
	}
}
