package Assignments;

public class ReplaceEntireNumerics 
{

	public static void main(String[] args) 
	{
		String name= "My home is near to sector 2 Patna 4";
		
		String uptd = name.replaceAll("[0-9]", " ");
		System.out.println(uptd);
	}

}
