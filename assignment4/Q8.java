/* Write a Java program to find the quare root of integer numbers. Demonstrate the use of 
try-catch block to handle ArithmeticException.*/

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any Number:");
		int a=obj.nextInt();
		
		double p=Math.sqrt(a);
		if(p==0 && p<=0)
		{
			throw new ArithmeticException("Output cannot be Zero!!!");
		}
		System.out.println(p);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
