/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilesManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author maltr
 */
public class ReadFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);
        try
        {
            IO.println("File Content: ");
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while(line != null)
            {
                IO.println(line);
                line = input.readLine();
            }
            input.close();
        }catch(IOException e)
        {
            IO.println("Error trying to read the file");
        }
    }
}
