package Assignments;

abstract class Method1
{
	abstract void login_api();
	abstract void registration();
	void Search()
	{
	   System.out.println("This is a search method");
	}
}

public class AbstractClass extends Method1 {

	@Override
	void login_api() 
	{
		System.out.println("This is login api");
	}

	@Override
	void registration()
	{
		System.out.println("This is registration");
	}
	
	public static void main(String[] args) 
	{
		AbstractClass ab = new AbstractClass();
		ab.login_api();
		ab.Search();
		ab.registration();
	}


}
