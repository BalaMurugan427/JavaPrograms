package Assignments;

interface Inherit
{
	abstract void login_info();
	abstract void Address_info();
	
}
public class InterfaceProperty52 implements Inherit {

	public void login_info() 
	{
		System.out.println("This is login info");
	}
	
	public void Address_info()
	{
		System.out.println("This is Address info");
	}
	
	public static void main(String[] args) 
	{
		InterfaceProperty52 obj1 = new InterfaceProperty52();
		obj1.Address_info();
		obj1.login_info();
	}


}
