package Assignments;

class Multi1
{
	void add(int a , int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
}

class Multi2 extends Multi1
{
	void sub(int a , double b)
	{
		double res1 = a-b;
		System.out.println(res1);
	}
}

class Multi3 extends Multi2
{
	void Mul(int a,int b)
	{
		int res2 = a*b;
		System.out.println(res2);
	}
}

class Multi4 extends Multi3
{
	void div(int a,int b)
	{
		int res3 = a/b;
		System.out.println(res3);
	}
}


public class MultiLevel extends Multi4
{
	public static void main(String[] args)
	{
		MultiLevel m = new MultiLevel();
		m.add(20, 50);
		m.sub(80, 50);
		m.Mul(15, 12);
		m.div(125, 15);
		
	}

}

