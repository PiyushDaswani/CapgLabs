package com.cg.labfive.dto;

public class PrimeNumber {

	public boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	public void printPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
