package oop;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {

        Hashtable<Integer, String> hs = new Hashtable<>();

        hs.put(1, "nb");
        hs.put(2, "n");
        hs.put(3, "n");
        hs.put(4, "nbvc");
        hs.put(5, "nbac");
        hs.put(null, "nbacd");
//        System.out.println(hs); can't use null in hastable
        
        Set<Integer> key = hs.keySet();
        
        for (Integer i : key){
        	System.out.print(i +" ");
        }
        
        System.out.println();
        Collection<String> values = hs.values();
        
        for (String s : values) {
        	System.out.print(s +" ");

        }
    }
}
