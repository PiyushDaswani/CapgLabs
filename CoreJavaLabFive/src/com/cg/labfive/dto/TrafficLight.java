package com.cg.labfive.dto;

public class TrafficLight {

	public void showMessage( int choice) {
		switch(choice) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3: 
			System.out.println("GO");
			break;
		default:
			System.out.println("Wrong input");
		}
	}
}
