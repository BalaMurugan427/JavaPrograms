package Assignments;

public class StringEndsWith {

	public static void main(String[] args) 
	{
		String name= "I'm a boy";
		
		if(name.endsWith("y"))
		{
			System.out.println("The string ends with y");
		}
		else {
			System.out.println("Not Y ;The string ends with "+name.charAt(name.length()-1));
		}

	}

}
