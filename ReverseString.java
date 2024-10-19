package Assignments;

public class ReverseString {

	public static void main(String[] args)
	{
        String s = "Palindrome";
        char ch[] = s.toCharArray();
        System.out.println(ch);
        System.out.println(s);
        char m[] = new char[s.length()];
       /* for(int i=ch.length-1,j=0;i>=0;i--,j++)
        {
        	 m[j]=ch [i];
        }*/
        for(int i=0;i<s.length();i++)
        {       	
        	 m[i] = ch[(s.length()-1)-i];
        }
        
        System.out.println(m);
        
    }

}
