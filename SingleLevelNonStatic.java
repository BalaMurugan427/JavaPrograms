package Assignments;

class Class1
{	
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	void Sub(int a, int b)
	{
		int sub;
		if(a>b)
		{
			sub = a-b;
			System.out.println(sub);
		}
		else if(b>a)
		{
			sub = b-a;
			System.out.println(sub);
		}
	}
} 


public class SingleLevelNonStatic extends Class1
{
	SingleLevelNonStatic()
	{
		System.out.println("This is main method");
	}

	public static void main(String[] args)
	{
		SingleLevelNonStatic sl =new SingleLevelNonStatic();
		sl.add(20, 30);
		sl.Sub(50, 80);
	}

}
