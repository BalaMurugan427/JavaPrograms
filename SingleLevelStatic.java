package Assignments;

class Single
{
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void Sub(int a, int b)
	{
		int res = a-b;
		System.out.println(res);
	}
}



public class SingleLevelStatic extends Single
{

	public static void main(String[] args) 
	{
		add(10,60);
		Sub(60,40);
	}

}
