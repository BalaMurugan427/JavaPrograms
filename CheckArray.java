package Assignments;

public class CheckArray {

	public static void main(String[] args)
	{
		int p[] = {10,20,60,80};
		
		int h[] = {70};
		
		boolean isArray = false ;
		
		
		
		for (int i=0;i<p.length;i++)
		{
			isArray = (p[i] == h[0]);
		}
		
		if(isArray)
		{
			System.out.println(isArray + " :"+h[0]+" is present in the Array");
		}
		else
		{
			System.out.println(h[0]+" is not present in the Array");

		}
	}

}
