/*Implement a Java application that computes the value of the expression log(abs(sin(x) 
+ cos(x))) / (tan(x) - cot(x)) for a given value of x. Ensure proper error handling for 
potential arithmetic exceptions and negative values inside the logarithmic function */

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("X=");
		double x=obj.nextDouble();
		try 
		{
			double neumorator=Math.log(Math.abs(Math.sin(x)+Math.cos(x)));
			double denominator=Math.sin(x)+Math.cos(x);
			double result=neumorator/denominator;;
			if(neumorator<0 && denominator==0)
			{
				throw new ArithmeticException(" negative values inside the logarithmic function");
			}
			System.out.println("Result: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
