/* 5.	Create a Java program that compares the performance of StringBuilder and StringBuffer when performing repeated string concatenations. The program should:
a.	Prompt the user to enter a base string and the number of times it should be concatenated to itself.
b.	Use StringBuilder to concatenate the string the specified number of times, tracking the time taken to complete the operation.
c.	Repeat the process using StringBuffer, again tracking the time taken.
d.	Output the time taken for each operation and the final length of the resulting strings to demonstrate both the time efficiency and the result of using StringBuilder and StringBuffer
*/

import java.util.Scanner;

public class Q5 {
	private static StringBuilder performStringBuilderConcatenation(String baseString, int numConcatenations) {
        StringBuilder stringBuilder = new StringBuilder(baseString.length() * numConcatenations);
        for (int i = 0; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        return stringBuilder;
    }

    private static StringBuffer performStringBufferConcatenation(String baseString, int numConcatenations) {
        StringBuffer stringBuffer = new StringBuffer(baseString.length() * numConcatenations);
        for (int i = 0; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        return stringBuffer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string: ");
        System.out.print(">"+" ");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations: ");
        System.out.print(">"+" ");
        int numConcatenations = scanner.nextInt();
        scanner.close();

        long startTime, endTime, duration1,duration2;

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderResult = performStringBuilderConcatenation(baseString, numConcatenations);
        endTime = System.currentTimeMillis();
        duration1 = endTime - startTime;
        System.out.println("\nUsing StringBuilder...");
        System.out.println("Time taken: " + duration1 + " milliseconds");
        System.out.println("Final string length: " + stringBuilderResult.length());

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBufferResult = performStringBufferConcatenation(baseString, numConcatenations);
        endTime = System.currentTimeMillis();
        duration2 = endTime - startTime;
        System.out.println("\nUsing StringBuffer...");
        System.out.println("Time taken: " + duration2 + " milliseconds");
        System.out.println("Final string length: " + stringBufferResult.length());
        if(duration1>duration2)
        {
        	System.out.println("Comparison: StringBuffer was slower than StringBuilder by " +(duration2-duration1)+ " millisecond.");
        }
        else if(duration1<duration2)
        {
        	System.out.println("Comparison: StringBuilder was faster than StringBuffer by " +(duration2-duration1)+ " millisecond.");
        }
        else
        	System.err.println("Both are same time!!!!");
    }

    
}
