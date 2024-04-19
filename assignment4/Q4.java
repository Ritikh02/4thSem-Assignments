/*Implement a Java program that reads a file path from the command line argument and 
attempts to read the contents of the file. If the file path is null or points to a non-existent 
file, throw a custom FileNotFoundException. If the file exists but cannot be read due 
to permission issues, throw a custom FileReadPermissionException. Your task is to 
create these custom exception classes and handle them appropriately in your program */


import java.io.File;
import java.util.Scanner;

class FileNotFoundException extends Exception {
    FileNotFoundException(String s) {
        super(s);
    }
}

class FileReadPermissionException extends Exception {
    FileReadPermissionException(String s) {
        super(s);
    }
}

public class Q4 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.println("Paste the Path of File in the directory :");
        String s = obj.nextLine();
        File f = new File(s);

        try {
            if (!f.exists()) 
            {
                throw new FileNotFoundException("File not Found");
            }
        } 
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        try {
            if (f.exists())
            { // Use && here instead of ||
            	System.out.println("File Name is: " + f.getName());
                
            } 
            else if(!f.canRead())
            {
            	throw new FileReadPermissionException("File cannot be read that...");
            }
        }
        catch (FileReadPermissionException e)
        {
            System.out.println(e);
        }
    }
}
