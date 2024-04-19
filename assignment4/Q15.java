/* Demonstration of use nested try-catch block. Write a Java program to handle 
NumberFormatException in outer try-catch block and ArithmeticException inside 
the inner try-catch block. */

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any String:");
		String a=obj.nextLine();
		try
		{
			int p=Integer.parseInt(a);
			System.out.println(p);
			
		try
		{
			System.out.println("Enter any 1st Number:");
			int b=obj.nextInt();
			System.out.println("Enter 2nd Number:");
			int c=obj.nextInt();
			if(c==0)
			{
				throw new ArithmeticException("Denominator cannot be Zero!!!");
			}
			int d=b/c;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
