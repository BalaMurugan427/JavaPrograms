package Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface70 {

	public static void main(String[] args) 
	{
		 Map<Integer, String> map = new HashMap<>();
		 
	     map.put(1, "car1");
	     map.put(2, "car2");
	     map.put(3, "car3");
	     map.put(4, "car4");
	     
	     
	    for (Map.Entry<Integer, String> entry : map.entrySet())
	    {
	      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }
	     
	     

	}

}
