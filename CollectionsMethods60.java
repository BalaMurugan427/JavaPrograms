package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsMethods60 {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		System.out.println(list);
		
		list.add(2,"Violet");
		System.out.println(list);
		
		ArrayList list2 = new ArrayList();
		list2.add("brown");
		
		/*list.addAll(list2);
		System.out.println(list);*/
		
		list.addAll(3, list2);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		boolean b=list.containsAll(list2);
		System.out.println(b);
		
		System.out.println(list.size());
		
		var k=list.get(1);
		System.out.println(k);
		
		
		list.clear();
		System.out.println(list);
		
	}

}
