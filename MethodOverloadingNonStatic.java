package Assignments;

public class MethodOverloadingNonStatic {

	public static void main(String[] args)
	{
		MethodOverloadingNonStatic m = new MethodOverloadingNonStatic();
		m.Add(5.5, 10);
		m.Add(25, 50);
		m.Add(10, 6.5);
		m.Add(5, 10,25);
	}
	
	 void Add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	 void Add(int a, double b)
	{
		double d = a+b;
		System.out.println(d);
	}
	
	 void Add(int a , int b, int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	 void Add(double a,int b)
	{
		double sum = a+b;
		System.out.println(sum);
	}

}
