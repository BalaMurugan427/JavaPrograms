package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		s=s.toLowerCase();
		char ch[] = s.toCharArray();
		char m[] = new char[s.length()];
		String res;
		
        for(int i=0;i<s.length();i++)
        {       	
        	 m[i] = ch[(s.length()-1)-i];
        }
		
		res = new String(m);
	    if(s.equals(res))
	    {
	    	System.out.println(res+" is a palindrome");
	    }
	    else
	    {
	    	System.out.println(res+" is not a palindrome");
	    }
	    sc.close();
	}

}
