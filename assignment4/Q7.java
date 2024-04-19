/*Create a method that takes a string input and converts it to an integer. Handle 
NumberFormatException using try-catch block and prompt the user to enter a valid 
number upon exception. */

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any String:");
		String s=obj.nextLine();
		int a=Integer.parseInt(s);
		System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
