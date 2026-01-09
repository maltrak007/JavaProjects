/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilesManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author maltr
 */
public class FileManagement {

    public File CreateFile(String _fileName) {
        File file = new File(_fileName);
        try {
            if (file.exists()) {
                //IO.println("The file already exits");
                return file;
            } else {
                PrintWriter output = new PrintWriter(new FileWriter(file));
                output.close();
                //IO.println("The file was created succesfully");
                return file;
            }
        } catch (IOException e) {
            IO.println("There was an error when creating the file" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<String> ReadFile(File _fileToRead) {
        try {
            //IO.println("File Content: ");
            /*
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while(line != null)
            {
                IO.println(line);
                line = input.readLine();
            }
            input.close();
             */
            List<String> fileContent = Files.readAllLines(Path.of(_fileToRead.getName()));
            for (String line : fileContent) {
                IO.println(line);
            }
            return fileContent;
        } catch (IOException e) {
            IO.println("Error trying to read the file");
            return null;
        }
    }

    public void WriteFile(File _fileToWrite, boolean _overwrite, String _message) throws FileNotFoundException {
        if (!_fileToWrite.exists()) {
            System.out.println("Cannot write a non-existent file");
            return;
        }
        try (PrintWriter out = new PrintWriter(new FileWriter(_fileToWrite, !_overwrite))) {
            out.println(_message);
        } catch (IOException e) {
            IO.println("Input-Output Exception" + e.getMessage());
            e.getStackTrace();
        }
    }
}
