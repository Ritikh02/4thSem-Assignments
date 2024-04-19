/* Create a Java application that calculates the value of the expression sqrt(abs(sin(x) * 
cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division 
by zero or negative values inside the square root function */


import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		
		System.out.print("X=");
		double x=obj.nextDouble();
		try
		{
			double denominator=Math.tan(x)+1;
			double result=Math.sqrt(Math.abs(Math.sin(x)*Math.cos(x)))/denominator;;
			if(denominator<=0)
			{
				throw new ArithmeticException("where x leads to division \r\n"
						+ "by zero or negative values");
			}
			System.out.println("Result: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
