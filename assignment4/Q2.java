/*You are given a string containing alpha-numeric characters. Design a Java program that 
displays the numeric characters if it is preceded by a vowel and consonant in the given 
string. If such numeric characters are not present in the given string, display appropriate 
message. If the input string is null or empty, throw a NullPointerException with an 
appropriate error message. Ensure that the program handles any potential exceptions 
gracefully */

import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner obj=new Scanner(System.in);
    	try
    	{
    	System.out.println("Enter any String:");
		String s=obj.nextLine();
		if(s.isEmpty())
		{
			throw new NullPointerException("String Cannot be Null");
		}
    	
        int vowels = 0, consonants = 0;
        char prevChar = ' ';

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); ++i)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                if (Character.isDigit(prevChar)) 
                {
                    System.out.println("Number before vowel is: " + prevChar);
                }
                ++vowels;
            }
            else if (ch >= 'a' && ch <= 'z') 
            {
                ++consonants;
            }
            prevChar = ch;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
        catch(NullPointerException e)
		{
			System.out.println(e);
		}
        
    }
}
