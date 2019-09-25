package com.cg.labfive.dto;

public class Fibonacci {

	public int reccursiveFind(int n) {
		if(n<=1) {
			return n;
		}
		return reccursiveFind(n-1) + reccursiveFind(n-2);
	}
	
	public int normalFind(int n) {
		int a = 0;
		int b = 1;
		int temp = 0;
        if (n == 0) 
            return 0; 
        for (int i = 2; i <= n; i++) { 
            temp = a + b; 
            a = b; 
            b = temp; 
        } 
        return b;
	}
	
}
