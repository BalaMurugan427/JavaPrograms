package Assignments;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lenght of Rectangle");
		int l = sc.nextInt();
		System.out.println("Enter the Breath of Rectangle");
		int b = sc.nextInt();
		int res = l*b;
		System.out.println("The Area of Rectangle is "+res);
		sc.close();
	}

}
