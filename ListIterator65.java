package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator65 {

	public static void main(String[] args)
	{
        ArrayList<String> list = new ArrayList<>();
        list.add("Car1");
        list.add("Car2");
        list.add("Car3");
        list.add("Car4");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) 
        {
            String list1 = listIterator.next();
            System.out.println(list1);
        }

        System.out.println("Backward Iteration:");
        while (listIterator.hasPrevious()) 
        {
            String list2 = listIterator.previous();
            System.out.println(list2);
        }


	}

}
