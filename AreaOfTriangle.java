package Assignments;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args)
	{//12*b*h
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of Triangle");
		int b = sc.nextInt();
		System.out.println("Enter the Height of Triangle");
		int h = sc.nextInt();
		int res = (b*h)/2;
		System.out.println("The area of Traingle is "+ res);
		sc.close();
	}

}
