/*Design a Java program that evaluates the value of the function (sin(x) * cos(x)) / (sin(x) 
+ cos(x)) for a given value of x. Handle potential arithmetic exceptions that may arise 
due to invalid mathematical operations. */

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
       @SuppressWarnings("resource")
	Scanner obj=new Scanner(System.in);
		System.out.print("X=");
		double x=obj.nextDouble();
		try
		{
			double denominator=Math.sin(x)+Math.cos(x);
			double result=Math.sin(x)*Math.cos(x)/denominator;;
			if(denominator<=0)
			{
				throw new ArithmeticException(" may arise \r\n"
						+ "due to invalid mathematical operations");
			}
			System.out.println("Result: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
