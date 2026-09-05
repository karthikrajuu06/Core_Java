package com.Threads;

public class Mythread  extends Thread{
	public void run() {
		System.out.println("thread is runnig");
	}
	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		Thread m1 = new Thread(t1);
		System.out.println(m1.getState());
		System.out.println("thread creation");
		m1.start();
		System.out.println("thread is started ");
		
		try {
			m1.sleep(3000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
			
		}
		
			
		}
		

	}


