package com.cg.labeight.dto;

public class PositiveString {

	public boolean isPositive(String s) {
		int n = s.length();

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) < s.charAt(i-1))
				return false;
		}

		return true;
	}
}
