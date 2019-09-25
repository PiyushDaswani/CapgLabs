package com.cg.labone.dto;

import java.util.Scanner;

public class Exercise2 {
	public static int calculateDifference(int n) {

		int sum = 0, i, sumOfSq = 0, sqOfSum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
			sumOfSq = sumOfSq + i * i;
		}
		sqOfSum = sum * sum;

		return sumOfSq - sqOfSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Difference is " + calculateDifference(n));
		sc.close();
	}
}
