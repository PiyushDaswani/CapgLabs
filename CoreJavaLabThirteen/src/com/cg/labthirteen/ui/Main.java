package com.cg.labthirteen.ui;

import java.util.Scanner;

import com.cg.labthirteen.dto.Exercise1;
import com.cg.labthirteen.dto.Exercise2;
import com.cg.labthirteen.dto.Exercise3;

public class Main {

	public static void main(String[] args) {
		new Exercise1().lambdaPower(2, 3);
		System.out.println("\n-----------------------------------------------------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.next();
		new Exercise2().printStringWithSpace(s);
		System.out.println("\n-----------------------------------------------------------\n");
		new Exercise3().validateNamePass();
		sc.close();
	}

}
