import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class test {
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int fileNum1;                       // Data value from file
      int fileNum2;                       // Data value from file
      int fileNum3; 
      // Try to open file
      System.out.println("Opening file numFile.txt.");
      fileByteStream = new FileInputStream("/home/gabrielboudreau/MyRepo/Main/Projects/numFile.txt");
      inFS = new Scanner(fileByteStream);
      
      // File is open and valid if we got this far 
      // (otherwise exception thrown)
      // numFile.txt should contain two integers, else problems
      System.out.println("Reading two integers.");
      fileNum1 = inFS.nextInt();
      fileNum2 = inFS.nextInt();
      fileNum3 = inFS.nextInt();

      // Output values read from file
      System.out.println("num1: " + fileNum1);
      System.out.println("num2: " + fileNum2);
      System.out.println("num3: " + fileNum3);
      System.out.println("num1+num2+num3: " + (fileNum1 + fileNum2 + fileNum3));

      // Done with file, so try to close it
      System.out.println("Closing file numFile.txt.");
      // close() may throw IOException if fails
      fileByteStream.close(); 
   }
}