package Assignments;

import java.util.Scanner;

public class CircumCircleScanner {

	public static void main(String[] args) 
	{//2*pi*r
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle");
		int r = sc.nextInt();
		System.out.println("Enter the value of Pi");
		double pi = sc.nextDouble();
		double res = 2*pi*r;
		System.out.println("The Circumference of circle is "+ res);
		sc.close();
		
		
		
		
	}

}
