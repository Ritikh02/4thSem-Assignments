/*Request a sentence and two words from the user: one to search for and one to replace it with. 
Find the first occurrence of the search word in the sentence. 
Replace the word using substring operations and concatenation. Display the original and the modified sentences. */

import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Sentence:");
        String a = obj.nextLine();
        System.out.println("Enter any two words:");
        String b = obj.nextLine();
        String c = obj.nextLine();
        int firstIndex = a.indexOf(b); 
        System.out.println("First occurrence of word " + b + " is found at index : " + firstIndex); 
        if (firstIndex != -2)
        {
            // Replace the word using substring operations and concatenation
            String modifiedSentence = a.substring(0, firstIndex) + c + a.substring(firstIndex + b.length());
            System.out.println("Original Sentence: " + a);
            System.out.println("Modified Sentence: " + modifiedSentence);
        } 
        else 
        {
            System.out.println("Word '" + b + "' not found in the sentence.");
        }


	}

}
