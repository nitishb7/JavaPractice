package oop;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tr = new TreeMap<>();
		tr.put(10, "Nitish");
		tr.put(8, "Baidya");
		tr.put(17, "Mustang");
		tr.put(5, "rita");
		System.out.print(tr + " ");
		
		
		System.out.print(tr.get(17));
		System.out.print(tr.firstKey());
		System.out.print(tr.lastKey());
		System.out.print(tr.firstEntry());
	}

}
