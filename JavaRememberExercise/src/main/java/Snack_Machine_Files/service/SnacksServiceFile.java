/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Snack_Machine_Files.service;

import FilesManagement.FileManagement;
import Snack_Machine_Files.domain.Snack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class SnacksServiceFile implements ISnacksService{
    private final String fileName = "inventory_snacks.txt";
    private List<Snack> snackList = new ArrayList<>();
    FileManagement fileManager = new FileManagement();
    
    //Adds to the txt the new snacks
    @Override
    public void AggregateSnack(Snack _snackToAdd) {
        File file = fileManager.CreateFile(fileName);
        try {
            fileManager.WriteFile(file, false, _snackToAdd.toString());
        } catch (FileNotFoundException ex) {
            System.getLogger(SnacksServiceFile.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    //Reads and display the txt content
    @Override
    public void ShowSnackList() {
        File file = fileManager.CreateFile(fileName);
        List<String> fileContent = fileManager.ReadFile(file);
        for(String line:fileContent)
        {
            IO.println(line);
        }
    }
    
    //Reads the content of the txt and fill the private list
    @Override
    public List<Snack> RetrieveSnacks() {
        File file = fileManager.CreateFile(fileName);
        List<String> fileContent = fileManager.ReadFile(file);
        for(String line:fileContent)
        {
            String[] snackData = line.split("\\|");
            String snackName = snackData[1];
            var snackPrice = snackData[2];
            Snack snackToFillData = new Snack(snackName, Double.parseDouble(snackPrice));
            snackList.add(snackToFillData);
        }
        return snackList;
    }
}
