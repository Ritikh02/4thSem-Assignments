/*Implement a Java program that involves dynamic data structures such as linked lists or 
trees, where elements are stored in arrays. Introduce scenarios, where accessing 
elements beyond the bounds of the array backing the data structure results in 
ArrayIndexOutOfBoundsException. Your task is to implement bounds checking and 
handle these exceptions effectively while maintaining the integrity of the data structure.
 */


import java.util.LinkedList;
import java.util.Scanner;

public class Q17 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=obj.nextInt();
		LinkedList <Integer>list=new LinkedList<>();
		System.out.println("Enter the Data:");
		for(int i=0;i<size;i++)
		{
			int o=obj.nextInt();
			list.add(o);
		}
		System.out.println(list);
		try
		{
		 System.out.println("Enter the index to access an element:");
         int index = obj.nextInt();
         if (index < 0 || index >= list.size())
         {
             throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
         }

         int element = list.get(index);
         System.out.println("Element at index " + index + ": " + element);
     } 
	
	 catch(ArrayIndexOutOfBoundsException e)
	{
         System.out.println(e);
     }

	}

}
