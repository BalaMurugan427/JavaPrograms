package Assignments;

public class Call_Static_Methods {

	public static void main(String[] args) 
	{
		add(10,20);
		Sub(40,25);
		Mul(6,7);
		Div(105,7);
		Mod(154,21);
	}
	
	static void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("Addition is"+ sum);
	}
	
	static void Sub(int a,int b)
	{
		int sum = a-b;
		System.out.println("Sub is"+ sum);
	}
	
	static void Mul(int a,int b)
	{
		int sum = a*b;
		System.out.println("Mul is"+ sum);
	}
	
	static void Div(int a,int b)
	{
		int sum = a/b;
		System.out.println("Div is"+ sum);
	}
	static void Mod(int a,int b)
	{
		int sum = a%b;
		System.out.println("Mod is"+ sum);
	}
	
	

}
