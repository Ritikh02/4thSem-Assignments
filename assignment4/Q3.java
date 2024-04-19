/*Implement a custom NullPointerException class named
CustomNullPointerException that mimics the behavior of the standard
NullPointerException, but instead of using default error messages or null references, 
it takes a String message as its constructor argument. Your task is to create this custom 
exception class and demonstrate its usage in a Java program */

import java.util.Scanner;
class CustomNullPointerException extends NullPointerException
{
	CustomNullPointerException(String Message)
	{
		super(Message);
	}
}
public class Q3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any String:");
		String s=obj.nextLine();
		if(s.isEmpty())
		{
			throw new CustomNullPointerException("String Cannot be Empty");
		}
		else
		{
			System.out.println("Length of the given String "+s+" is:"+s.length());
		}
		}
		catch(CustomNullPointerException e)
		{
			System.out.println(e);
		}
	}

}
