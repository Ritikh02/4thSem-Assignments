/*Take two strings from the user. Concatenate them using the string method and the + operator, then display both results. 
Ask the user for an index number, then display the character at that index. */

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String a = obj.nextLine();
        String d=a;
        System.out.println("Enter 2nd String:");
        String b = obj.nextLine();
        a=a.concat(b);
        System.out.println("After using String Method the String is: "+a);
        System.out.println("After using using '+' operator the String is: "+(d+b));
        System.out.println("Enter any index to see the Character:");
        int index=obj.nextInt();
        char result=a.charAt(index);
        System.out.println("The Character found: "+result);

	}

}
