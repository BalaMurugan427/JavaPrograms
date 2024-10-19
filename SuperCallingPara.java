package Assignments;

class Parent1
{
	Parent1(Boolean c)
	{
		System.out.println("This is Parent");
	}
}

class Sub11 extends Parent1
{
	Sub11(char a)
	{
		super(true);
		System.out.println("This is Sub1");
	}
}

class Sub12 extends Sub11
{
	Sub12(double a, int b)
	{
		super('i');
		System.out.println("This is Sub2");
	}
}

class Sub13 extends Sub12
{
	Sub13(int a,int b)
	{
		super(5.0,7);
		System.out.println("This is Sub3");
	}
}


public class SuperCallingPara extends Sub13
{
	String res;
	SuperCallingPara(String s)
	{		
		super(10,20);
		res =s;
		System.out.println("This is MainMethodClass");
	}
	public static void main(String[] args)
	{
		SuperCallingPara i = new SuperCallingPara("Print");
		System.out.println(i.res);
	}

}

