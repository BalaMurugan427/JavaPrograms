package Assignments;

public class ExceptionHandling73 {

	public static void main(String[] args) 
	{
	      try {
	            int[] numbers = {10, 20, 30};
	            

	            System.out.println("Accessing an element: " + numbers[5]);
	            int res = numbers[1]/0;
	            System.out.println("First:" + res);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Error1:  " + e.getMessage());
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error2:" + e.getMessage());
	        } 
	        catch (Exception e) {
	            System.out.println("Error3: " + e.getMessage());
	        }

	}

}
