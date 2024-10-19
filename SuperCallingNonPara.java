package Assignments;

class Parent
{
	Parent()
	{
		System.out.println("This is Parent");
	}
}

class Sub1 extends Parent
{
	Sub1()
	{
		super();
		System.out.println("This is Sub1");
	}
}

class Sub2 extends Sub1
{
	Sub2()
	{
		super();
		System.out.println("This is Sub2");
	}
}

class Sub3 extends Sub2
{
	Sub3()
	{
		super();
		System.out.println("This is Sub3");
	}
}


public class SuperCallingNonPara extends Sub3
{
	SuperCallingNonPara()
	{
		super();
		System.out.println("This is MainMethodClass");
	}
	public static void main(String[] args)
	{
		new SuperCallingNonPara();
		
	}

}

