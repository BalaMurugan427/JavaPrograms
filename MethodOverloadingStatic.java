package Assignments;

public class MethodOverloadingStatic {

	public static void main(String[] args)
	{
		Add(5,20);
		Add(10,20.5);
		Add(10,30,40);
		Add(17.4,30);
	}

	static void Add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void Add(int a, double b)
	{
		double d = a+b;
		System.out.println(d);
	}
	
	static void Add(int a , int b, int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	static void Add(double a,int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
}
