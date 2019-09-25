package com.cg.labten.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.cg.labten.dto.Exercise1;
import com.cg.labten.dto.Exercise2;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileinp=new FileInputStream("E:\\Project\\CoreJavaLabTen\\src\\source.txt");
		FileOutputStream fileout = new FileOutputStream("E:\\Project\\CoreJavaLabTen\\src\\target.txt");
		Exercise1 ex = new Exercise1(fileinp, fileout);
		ex.start();
		System.out.println("\n------------------------------------------------------------\n");
		Exercise2 run = new Exercise2();
		Thread thread = new Thread(run);
		thread.start();
	}

}
