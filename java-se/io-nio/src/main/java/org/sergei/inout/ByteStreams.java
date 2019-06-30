package org.sergei.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Program which reads from the file and writes into the new one - low-level
 * approach that reads bytes and writes into the other file In case of character
 * based files it is better to use character stream
 * 
 * @author Sergei Visotsky
 */
public class ByteStreams {

    public static void main(String[] args) {
        
        try(FileInputStream in = new FileInputStream("src/main/resources/files/hello.txt"); 
            FileOutputStream out = new FileOutputStream("src/main/resources/files/hello_write.txt")) {
            
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
