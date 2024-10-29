package Assignments;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args)
	{
		int k[] = {45,55,65,75};
		
		int l[] = {45,55,65,75};
		
		boolean b =Arrays.toString(k).equals(Arrays.toString(l));
		System.out.println(b);
	}

}
