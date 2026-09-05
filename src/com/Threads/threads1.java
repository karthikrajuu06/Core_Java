package com.Threads;

public class threads1  implements Runnable {
	@Override
	public void run () {
		System.out.println("Thresd is Running");
		
	}

	public static void main(String[] args) {
	threads1 t1 = new threads1();
	
	Runnable r1 = new Thread(t1);
	((Thread) r1).start();

	}

}
