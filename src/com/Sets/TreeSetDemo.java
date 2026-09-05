package com.Sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet <>();
		
		tset.add(10);
		tset.add(1);
		tset.add(15);
		tset.add(11);
		tset.add(12);
		System.out.println(tset);
		System.out.println(tset.first());
		System.out.println(tset.last());
	
		

	}

}
