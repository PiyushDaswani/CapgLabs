package com.cg.labthirteen.dto;

interface Sum{
	public int add(int a, int b);
}
public class Exercise4 {

	public int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Exercise4()::sum;
		int a=10;
		int b=20;
		System.out.println(s.add(a, b));
		
	}
}
