package com.cg.labfive.ui;

import java.util.Scanner;

import com.cg.labfive.dto.Employee;
import com.cg.labfive.dto.Fibonacci;
import com.cg.labfive.dto.PrimeNumber;
import com.cg.labfive.dto.TrafficLight;
import com.cg.labfive.dto.ValidateData;
import com.cg.labfive.exception.EmployeeException;
import com.cg.labfive.exception.UserException;

public class MyApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter between 1 and 3");
		System.out.println("1.Red \t\t 2.Yellow \t\t 3.Green");
		int choice = sc.nextInt();
		TrafficLight tl = new TrafficLight();
		tl.showMessage(choice);

		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Enter n to find the nth value of fibonacci series");
		int n = sc.nextInt();
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.reccursiveFind(n));
		System.out.println(fib.normalFind(n));
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Enter the number upto which prime numbers should be printed");
		int num = sc.nextInt();
		PrimeNumber pn = new PrimeNumber();
		pn.printPrimeNumber(num);
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Enter the name");
		sc.nextLine();
		String name = sc.nextLine();
		ValidateData vn = new ValidateData();
		try {
			vn.validateName(name);
			System.out.println("Valid name");
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		try {
			vn.validateAge(age);
			System.out.println("age valid");
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("Enter the id of the Employee");
		int empId = sc.nextInt();
		System.out.println("Enter the name of the Employee");
		String empName = sc.next();
		System.out.println("Enter the salary of the Employee");
		double empSal = sc.nextDouble();
		try {
			vn.validateSalary(empSal);
			Employee emp = new Employee(empId, empName, empSal);
			System.out.println("Employee created successfully" + emp);
		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
			System.err.println("Employee not created");
		}
		sc.close();

	}

}
