package com.cg.labeight.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.labeight.dto.DateDifference;
import com.cg.labeight.dto.FileReadingClass;
import com.cg.labeight.dto.PositiveString;
import com.cg.labeight.dto.StringCounter;
import com.cg.labeight.dto.SumOfIntegers;
import com.cg.labeight.dto.Validater;

import javafx.util.converter.LocalDateStringConverter;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers seperated by ,");
		String line = sc.next();
		SumOfIntegers s = new SumOfIntegers();
		System.out.println(s.sumOfInt(line));
		System.out.println("\n------------------------------------------------------\n");
		FileReadingClass fr = new FileReadingClass();
		fr.readFile();
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("Enter the string");
		sc.nextLine();
		String str = sc.nextLine();
		StringCounter strc = new StringCounter();
		strc.printNoOf(str);
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("Enter the file name");
		String file = sc.next();
		fr.fileOptions(file);
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("Enter the String");
		String string = sc.next();
		PositiveString ps = new PositiveString();
		if(ps.isPositive(string)) {
			System.out.println("IT IS POSITIVE");
		}
		else {
			System.out.println("IT IS NEGATIVE");
		}
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("Enter the date in dd-MM-YYYY format");
		String date = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse(date,formatter);
		DateDifference dd = new DateDifference();
		dd.dateDifferenceCalculator(d);
		System.out.println("\n------------------------------------------------------\n");
		System.out.println("Enter the username");
		String username = sc.next();
		Validater v = new Validater();
		System.out.println(v.validateUsername(username));
		
		sc.close();
	}
	
}
