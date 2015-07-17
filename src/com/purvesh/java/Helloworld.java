package com.purvesh.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Helloworld  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Hello World");
        Car v1 = new Car();
        v1.setId(1);
        v1.setWheels(4);
        v1.setName("Benz");

        
        List<String> l1 = new ArrayList<String>();
        
        l1.add("a");
        l1.add("b");
        l1.add("c");
        
        v1.setParts(l1);
        for (String array :l1) {
        	System.out.println(array);
        }
        
        HashMap <String, String> t = new HashMap <String, String> ();
        t.put("name1", "value1");
        t.put("name2", "value2");
        t.put("name3", "value3");
        
        System.out.println(t.get("name2"));
	}

}