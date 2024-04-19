/*Implement a Java program that calculates the value of the expression (sin(x) + cos(x)) 
/ tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to 
avoid division by zero errors. */

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		try
		{
			System.out.print("X=");
			int x=obj.nextInt();
			double result=(Math.sin(x)+Math.cos(x))/Math.tan(x);
			final double EPSILON = 1e-10; 
			if(Math.abs(x % (Math.PI / 2)) < EPSILON || Math.abs(x % (Math.PI / 2) - (Math.PI / 2)) < EPSILON)
			{
				throw new ArithmeticException("Division by zero error: x is close to a multiple of π/2");
			}
			System.out.print("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
