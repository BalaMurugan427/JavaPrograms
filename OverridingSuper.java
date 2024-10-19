package Assignments;

class parent1
{
	void add(int i,int j)
	{
		int sum = i+j;
		System.out.println(sum);
	}
}

class parent2 extends parent1
{
	void add(int i,int j)
	{
		super.add(20, 20);
		int sum = i+j+10;
		System.out.println(sum);
	}
}
public class OverridingSuper extends parent2 
{
  void add(int i,int j)
  {
	  
	  System.out.println("This is Main Method");
	  super.add(20, 20);
  }
  

	public static void main(String[] args) 
	{
		OverridingSuper m = new OverridingSuper();
		m.add(10, 20);
		
	}

}
