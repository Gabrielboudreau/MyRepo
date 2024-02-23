import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class project_4_1 {
    public static void main(String[] args) {
        String inputFile = "/home/gabrielboudreau/MyRepo/Main/Projects/txt files/ParkPhotos.txt"; //Input path
        String outputFile = "/home/gabrielboudreau/MyRepo/Main/Projects/txt files/NewParkPhotos.txt"; // Output path
        
        try {
            modifyFile(inputFile, outputFile); //Method Call
            System.out.println("File modification successful.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());  //Error Exception
        }
    }
    
    public static void modifyFile(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); //Reads ParkPhotos, edits and copies
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) { //Writes edited line in NewParkPhotos
            
            String line;
            while ((line = reader.readLine()) != null) {
                
                String modifiedLine = line.replaceAll("photo.jpg", "info.txt"); //Replace keywords
                writer.write(modifiedLine); //Write modfiedline
                writer.newLine(); // Add newline character
            }
        }
    }
}
