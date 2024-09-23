package Assignments;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side of Square");
		int a = sc.nextInt();
		int res = a*a;
		System.out.println("The area of square is "+ res);
		sc.close();
	}

}
