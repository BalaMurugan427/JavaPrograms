package Assignments;

import java.util.Scanner;

public class MathAreaOfCircle {

	public static void main(String[] args) 
	{
		double pi = Math.PI;
		System.out.println("Enter the Radius of circle");
		Scanner sc = new Scanner(System.in); 
		int r = sc.nextInt();
		double Area = pi*r*r;
		System.out.println(Area);
		sc.close();  		
	}

}
