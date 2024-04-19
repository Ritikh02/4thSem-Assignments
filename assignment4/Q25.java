/*Implement a method that reads an integer from the user but handles
InputMismatchException using try-catch block */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
	public static void Method()throws InputMismatchException
	{
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Number:");
		@SuppressWarnings("unused")
		int num=obj.nextInt();
	    System.out.println("You ");
	}

	public static void main(String[] args) {
		try
		{
		Method();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}

	}

}
