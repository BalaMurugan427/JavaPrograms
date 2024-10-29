package Assignments;

public class ReplaceCapitals {

	public static void main(String[] args) 
	{
		String name= "I am The Boss";
        String uptd = name.replaceAll("[A-Z]", "");
        
        System.out.println(uptd);
	}

}
