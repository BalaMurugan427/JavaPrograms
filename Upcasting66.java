package Assignments;

class First
{
	public void FirstMethod()
	{
		System.out.println("This is parent method");
	}	
}

class Second1 extends First
{
	public void SecondMethod()
	{
		System.out.println("This is Second method");
	}	
}

public class Upcasting66 extends Second1
{
	public void Subclass()
	{
		System.out.println("This is Main method");
	}

	public static void main(String[] args) 
	{
		First ref =(First) new Upcasting66();
		ref.FirstMethod();		
	}

}
