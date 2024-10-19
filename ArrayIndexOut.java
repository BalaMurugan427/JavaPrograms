package Assignments;

public class ArrayIndexOut {

	public static void main(String[] args) 
	{
		String s = "Manish";
		char ch[] = s.toCharArray();
		char chr[] = new char[s.length()];
		for(int i =0;i<=ch.length;i++)
		{
			chr[i] = ch[i-1];
		}
		System.out.println(chr);
	}

}
