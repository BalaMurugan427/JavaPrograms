package Assignments;


interface SupermostClass
{
	abstract void model1();
	abstract void model2();	
}

abstract class Parent1 implements SupermostClass
{
	abstract void model3();
	abstract void model4();
	
	void concrete1()
	{
		System.out.println("This is concrete 1");
	}
	void concrete2()
	{
		System.out.println("This is concrete 2");
	}
}

class Subclass1 extends Parent1
{

	@Override
	public void model1() 
	{
		System.out.println("This is model 1");
	}

	@Override
	public void model2() 
	{
		System.out.println("This is model 2");
	}

	@Override
	void model3() 
	{
		System.out.println("This is model 3");
	}

	@Override
	void model4()
	{
		System.out.println("This is model 4");
	}
	
	void concrete3()
	{
		System.out.println("This is concrete 3");
	}
	void concrete4()
	{
		System.out.println("This is concrete 4");
	}
	
}

public class InterfaceSupermost extends Subclass1 
{

	
	public static void main(String[] args)
	{
		InterfaceSupermost obj = new InterfaceSupermost();
		obj.concrete1();
		obj.concrete2();
		obj.concrete3();
		obj.concrete4();
		obj.model1();
		obj.model2();
		obj.model3();
		obj.model4();
	}


}
