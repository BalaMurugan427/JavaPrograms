package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteration63 {

	public static void main(String[] args) 
	{
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        ListIterator<String> iterator = list.listIterator();
	        
	        try 
	        {
	            System.out.println(iterator.previous());
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
