package Assignments;

class Overriding1
{
	void add(int i , int j)
	{
		int sum = i+j;
		System.out.println(sum);//40
	}
}
public class MethodOverriding extends Overriding1
{
	void add(int i,int j)
	{
		int sum1 = i+j+10;
		System.out.println(sum1);//50
	}

	public static void main(String[] args)
	{
		MethodOverriding m = new MethodOverriding();
		m.add(20, 20);		
	}

}
