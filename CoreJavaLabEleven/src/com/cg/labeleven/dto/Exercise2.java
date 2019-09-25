package com.cg.labeleven.dto;

import java.time.LocalTime;

public class Exercise2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		}
	}

}
