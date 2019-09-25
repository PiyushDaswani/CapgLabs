package com.cg.labthirteen.dto;

import java.util.Scanner;

interface Factorial{
	public int cal(int num);
}
public class Exercise5 
{

	public int factorial(int num) {
		int temp=1;
		while(num>0) {
			temp=temp*num;
			num--;
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Factorial fact=new Exercise5()::factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose fact is to be calculated: ");
		int num=sc.nextInt();
		System.out.println(fact.cal(num));
		sc.close();
	}
}