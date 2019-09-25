package com.cg.labone.dto;

import java.util.Scanner;

public class Exercise1 {
	public static int calculateSum(int n) {

		int sum = 0, count = 0;
		int i = 1;
		while (count != n) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum = calculateSum(n);
		System.out.println(sum);
		sc.close();

	}
}
