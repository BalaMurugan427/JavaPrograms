package Assignments;

public class PrintString {

	public static void main(String[] args)
	{
		String name = "RAM";
		char k[] = name.toCharArray();
		//System.out.println(k.length);
		char ch[] = new char[name.length()];
		
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for(int i=0;i<k.length;i++)
		{
			ch[i] = k[(k.length-1)-i];
			System.out.println(ch[i]);
		}
	}

}
