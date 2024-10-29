package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueRuntime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size = sc.nextInt();
		int k[] = new int[size];
		System.out.println("Enter the "+size+ " number of size: ");
		for (int i=0;i<k.length;i++)
		{
			k[i] = sc.nextInt();
		}		
		System.out.println(Arrays.toString(k));
		sc.close();
	}

}
