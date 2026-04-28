package oop;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hs = new HashMap<>();

        hs.put(1, "nb");
        hs.put(2, "n");
        hs.put(3, "n");
        hs.put(4, "nbvc");
        hs.put(5, "nbac");

        System.out.println(hs);
        
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