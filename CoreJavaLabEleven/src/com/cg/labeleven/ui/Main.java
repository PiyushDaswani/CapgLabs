package com.cg.labeleven.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cg.labeleven.dto.Exercise1;
import com.cg.labeleven.dto.Exercise2;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		FileInputStream fileinp=new FileInputStream("E:\\Project\\CoreJavaLabTen\\src\\source.txt");
		FileOutputStream fileout = new FileOutputStream("E:\\Project\\CoreJavaLabTen\\src\\target.txt");
		es.execute(new Exercise1(fileinp, fileout));
		es.execute(new Exercise2());
		es.shutdown();
	}
}
