package Assignments;

public class Alphabets {

	public static void main(String[] args)
	{
		 String s = "No 16 kv in Bangalore#";
		 
		 int Alpha =0;
		 int num = 0;
		 int space = 0;

		 
		 for(int i=0;i<s.length();i++)
		 {
			 char c =s.charAt(i);
			 
			 if(Character.isLetter(c))
			 {
				 Alpha++;
			 }
			 else if(Character.isWhitespace(c))
			 {
				 space++;
			 }
			 else if(Character.isDigit(c))
			 {
				 num++;
			 }
		 }
		 
		 int special = s.length() -(Alpha +space+num);
		 
		 System.out.println("Alpha " + Alpha);
		 System.out.println("space " + space);
		 System.out.println("num " + num);
		 System.out.println("special " + special);
	}

}
