package Assignments;

import java.util.Scanner;

public class AreaCircleScanner {

	public static void main(String[] args)
	{//pi*r*r
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int r = sc.nextInt();
		System.out.println("Enter the value of Pi");
		double b= sc.nextDouble();
		double Area = b*r*r;
		System.out.println("The Radius of circle is "+ Area);
		sc.close();
	}

}

