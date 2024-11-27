package Assignments;

import java.util.HashMap;
import java.util.Map;

public class MapInterface71 {

	public static void main(String[] args) 
	{
		Map<String, Integer> fruits = new HashMap<>();
		
		fruits.put("Apple", 15);
		fruits.put("Grape", 25);
		fruits.put("Orange", 35);
		fruits.put("Dragon", 50);
		
        String fruit1 = "Grape";
        if (fruits.containsKey(fruit1)) 
        {
            int quantity = fruits.get(fruit1);
            System.out.println("Quantity of " + fruit1 + " is " + quantity);
        } else 
        {
            System.out.println(fruit1 + " not found in the collection.");
        }

        
        String fruit2 = "Orange";
        if (fruits.containsKey(fruit2)) 
        {
        	fruits.remove(fruit2);
            System.out.println(fruit2 + " removed from the collection.");
        } else 
        {
            System.out.println(fruit2 + " not found in the map.");
        }

        System.out.println("All fruits with their quantities:");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) 
        {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

	}

}
