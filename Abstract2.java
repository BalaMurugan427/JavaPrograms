package Assignments;

class Supermost
{
	Supermost()
	{
		System.out.println("This is supermost constructor");
	}
	Supermost(int i,int j)
	{
		this();
		System.out.println("Supermost Constructor is "+(i+j));
	}
	void add(int i,int j)
	{
		int sum = i+j;
		System.out.println(sum);
	}
	void Mul(int i,int j)
	{
		int multi = i*j;
		System.out.println(multi);
	}
}
abstract class AbParent extends Supermost
{
	AbParent()
	{
		super(10,40);
	}
	abstract void login();
	abstract void Regis();
	void OpenPage()
	{
		System.out.println("This is Open page");
	}
	void CartPage()
	{
		System.out.println("This is Cart page");
	}
	
}

public class Abstract2 extends AbParent
{
	Abstract2()
	{
		super();
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("This is login override");
	}

	@Override
	void Regis() {
		// TODO Auto-generated method stub
		System.out.println("This is Registration override");
	}


	public static void main(String[] args) 
	{
		Abstract2 abs = new Abstract2();
		abs.add(10, 10);
		abs.Mul(20, 5);
		abs.login();
		abs.Regis();
		abs.OpenPage();
		abs.CartPage();
	}

}
