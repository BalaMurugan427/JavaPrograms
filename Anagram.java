package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String s1 = "face";
		String s2 = "cafe";
	    if(s1.length() == s2.length())
	    {
		  char c1[] = s1.toCharArray();
		  char c2[] = s2.toCharArray();
		   Arrays.sort(c1);
		   String m = Arrays.toString(c1);
		   Arrays.sort(c2);
		   String n = Arrays.toString(c2);
		    if(m.equals(n))
		    {
			   System.out.println(s1 +" and "+s2+" is a anagram");
		    }
		    else 
		    {
		    	System.out.println(s1 +" and "+s2+" is not a anagram");
		    }
		}
	    else 
	    {
	    	System.out.println(s1 +" and "+s2+" is not a anagram");
	    }
		
	}

}
