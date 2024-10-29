package Assignments;

public class LettersCount {

	public static void main(String[] args) 
	{
		String name= "kv no 2";
		char ch[] = name.toCharArray();
		
		int lettercount = 0;
		int digit =0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				lettercount++;
			}
			if(Character.isDigit(ch[i]))
			{
				digit++;
			}
		}
		
		System.out.println(lettercount);
		System.out.println(digit);
		
	}
	

}
