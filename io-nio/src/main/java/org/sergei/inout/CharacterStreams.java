package org.sergei.inout;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Program which reads from the file and writes into the new one In this case
 * CharacterStreams are used that are more suitable for the text files
 * 
 * @author Sergei Visotsky
 */
public class CharacterStreams {

    public static void main(String[] args) {
        
        try(FileReader inputStream = new FileReader("src/main/resources/files/hello.txt");
            FileWriter outputStream = new FileWriter("src/main/resources/files/hello_write.txt")) {
            
            int c;
            
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
