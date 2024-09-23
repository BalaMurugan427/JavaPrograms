package Assignments;

public class OperatorsNonStatic {
	
	void Add()
	{
		int a = 10;
		int b= 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	void Sub()
	{
		int a = 50;
		int b= 30;
		int sub = a-b;
		System.out.println(sub);
	}
	
	void Mul()
	{
		int a = 7;
		int b= 12;
		int mul = a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args) 
	{
		OperatorsNonStatic r1 = new OperatorsNonStatic();
		r1.Add();
		r1.Sub();
		r1.Mul();
	}

}
