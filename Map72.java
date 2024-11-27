package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Map72 {

	public static void main(String[] args) 
	{
		 Map<Integer, String> map = new HashMap<>();

		 map.put(1, "Kumar");
		 map.put(2, "Akash");
		 map.put(3, "Manish");
		 map.put(4, "Rohit");

	        String nameCheck = "Akash";
	        int rollNo = 2;

	        if (map.containsKey(rollNo)) {
	            System.out.println("Roll number " + rollNo + " exists in the map.");
	            
	            if (map.get(rollNo).equals(nameCheck)) 
	            {
	                System.out.println(nameCheck + " is present with roll number " + rollNo);
	            }
	            else 
	            {
	                System.out.println(nameCheck + "is not present with roll number " + rollNo);
	            }
	        }
	        else 
	        {
	            System.out.println(rollNo + " does not exist in the map");
	        }

	}

}
