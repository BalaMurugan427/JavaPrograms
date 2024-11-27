package Assignments;

 interface module1
 {
	 abstract void method1();
	 
 }
 
 abstract class module2 
 {
	 abstract void method2();
	 void method3() 
	 {
		 System.out.println("This is absctrcat class concrete method");
		 
	 }
 }



public class InheritKeywords53 extends module2 implements module1
{

	public static void main(String[] args) 
	{
		InheritKeywords53 obj = new InheritKeywords53();
		obj.method1();
		obj.method2();
		obj.method3();
	}

	@Override
	public void method1() 
	{
		System.out.println("This is interface class");
	}

	@Override
	void method2() 
	{
		System.out.println("This is interface class");		
	}

}
