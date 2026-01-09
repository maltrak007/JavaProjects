/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilesManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author maltr
 */
public class CreateFile {

    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        File file = new File(fileName);
        try {
            if (file.exists()) {
                IO.println("The file already exits");
            } else {
                PrintWriter output = new PrintWriter(new FileWriter(file));
                output.close();
                IO.println("The file was created succesfully");
            }
        } catch (IOException e) {
            IO.println("There was an error when creating the file" + e.getMessage());
            e.printStackTrace();
        }

    }
}
