/*Ask for a string from the user. Convert the string to a character array. Prompt the user to enter a character to search in the string. 
Find the first and last occurrences of the character. Display the character array and the positions found (if any). */

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String:");
        String a = obj.nextLine();
        char[] arr = a.toCharArray();
        
        System.out.println("Character Array:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Enter the character to search:");
        char b = obj.next().charAt(0);
        
        // Find first occurrence
        int firstIndex = a.indexOf(b); 
        System.out.println("First occurrence of char " + b + " is found at index : " + firstIndex); 

        // Find last occurrence
        int lastIndex = a.lastIndexOf(b); 
        System.out.println("Last occurrence of char " + b + " is found at index: " + lastIndex); 
        
        // Display character array again
        System.out.println("Character Array After Search:");
        for (char c : arr) {
            System.out.print(c + " ");
        }

        obj.close();
    }
}
