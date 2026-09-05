package com.maps;
import java.util.HashMap;
public class HashmapDemo {
	public static void main(String[]args) {
		HashMap <Integer,Integer> hmap = new HashMap<>();
		
		hmap.put(0,1);
		hmap.put(1,2);
		hmap.put(2,3);
		hmap.put(3,4);
		
		
		
		System.out.println(hmap);
		System.out.println(hmap.containsKey(6));
		//System.out.println(hmap.equals(0));
		System.out.println(hmap.get(0));
		//System.out.println(hmap.hashCode(0));
		System.out.println(hmap.isEmpty());
		System.out.println(hmap.size());

		


	}

}
