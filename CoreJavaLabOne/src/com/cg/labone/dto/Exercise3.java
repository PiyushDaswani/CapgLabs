package com.cg.labone.dto;

import java.util.Scanner;

public class Exercise3 {

	public static boolean checkNumber(int n) {
		int a = n%10;
		n = n/10;
		while(n>0)
		{
			int b= n%10;
			if(a <b)
				return false;
			a = b;
			n = n/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
	
}
