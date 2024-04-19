/*Write a Java program to demonstrate a checked exception (e.g.,
FileNotFoundException) being thrown and caught using try-catch block */

import java.io.File;
import java.util.Scanner;

public class Q24 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Copy and Paste the Path of File from the Directory:");
		String s=obj.nextLine();
		File f=new File(s);
		try
		{
			if(f.exists())
			{
				
				System.out.println("File "+ f.getName()+" found Sucessfully...");
			}
			else
			{
				throw new FileNotFoundException("File not exist in the directory..");
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e);
			e.printStackTrace(); 
		}
		obj.close();

	}

}
