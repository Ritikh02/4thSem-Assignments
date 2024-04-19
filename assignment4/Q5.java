/*Develop a program that performs complex mathematical (may have log, trigonometric
and algebraic functions) computations. Handle unchecked NullPointerException
gracefully using try-catch block and provide a meaningful error message */

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Number:");
		String a=obj.nextLine();
		try
		{
			int p=Integer.parseInt(a);
			double q=Double.parseDouble(a);
			int po=(int)Math.log(p);
			double qo=(double)Math.sin(q);
			
			System.out.println(po);
			System.out.println(qo);
			
			try
			{
				int r=p*p+p-p*p*p/p;
				System.out.println(r);
			}
			catch (ArithmeticException e)  
			{
				System.out.println(e);
			}
		}
		catch (NullPointerException e) 
		{
			System.out.println(e);
		}

	}

}
