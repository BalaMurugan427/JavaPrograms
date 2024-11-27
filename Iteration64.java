package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration64 {

	public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) 
        {
            String list1 = iterator.next();
            System.out.println(list1);
        }

        iterator = list.iterator(); 
        while (iterator.hasNext()) 
        {
            String list2 = iterator.next();
            if (list2.equals("Banana")) 
            {
                iterator.remove(); 
                System.out.println("Removed: " + list2);
            }
        }

        System.out.println("Updated List: " + list);

	}

}
