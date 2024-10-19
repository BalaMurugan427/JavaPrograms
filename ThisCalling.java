package Assignments;

public class ThisCalling {
	ThisCalling()
	{
		this(10);
		System.out.println("Hi this calling");
	}
	
	ThisCalling(int i)
	{
		this(10,20);
		System.out.println("Hi this from calling");
	}
	
	ThisCalling(int i,int j)
	{
		
		System.out.println(i+"Hi this from this calling");
		System.out.println(j+"Hi this from this calling");
	}

	public static void main(String[] args)
	{ 
		
		new ThisCalling();
		new ThisCalling(10);
		
		
		

	}

}
