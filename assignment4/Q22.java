/*Create a custom checked exception class named CustomCheckedException. Use this 
exception in your program to handle a specific error condition and demonstrate its usage 
using try-catch block. */

import java.util.Scanner;

class CustomCheckedException extends Exception
{
	CustomCheckedException(String M)
	{
		super(M);
	}
}
public class Q22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Any Number");
		int a=obj.nextInt();
		try
		{
			if(a<0)
			{
				throw new CustomCheckedException(a+"Number Can't be Negative!!");
			}
			System.out.println("Number is:" +a);
		}
		catch(CustomCheckedException e)
		{
			System.out.println(e);
		}

	}

}
