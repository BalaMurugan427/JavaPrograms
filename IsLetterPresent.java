package Assignments;

public class IsLetterPresent {

	public static void main(String[] args)
	{
		String input= " I'm a simple boy";
		char ch[] = input.toCharArray();
		boolean k = false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == 's')
			{
				k = true;
			}			
		}
		
		if(k)
		{
			System.out.println("s is present");
		}
		else
		{
			System.out.println("S is Not present");
		}
		
		


	}

}
