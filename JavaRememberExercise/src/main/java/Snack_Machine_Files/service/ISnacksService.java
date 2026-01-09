/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Snack_Machine_Files.service;

import Snack_Machine_Files.domain.Snack;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public interface ISnacksService {
    public void AggregateSnack(Snack _snackToAdd);
    public void ShowSnackList();
    public List<Snack> RetrieveSnacks();
}
