/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SnackMachine;

import java.util.Objects;

/**
 *
 * @author maltr
 */
public class Snack {
    private static int snackCounter = 0;
    private int idSnack;
    private String snackName;
    private double snackPrice;

    public Snack(int idSnack, String snackName, double snackPrice) {
        ++snackCounter;
        this.idSnack = idSnack;
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }
    
    public static int getSnackCounter() {
        return snackCounter;
    }
    
    @Override
    public String toString() {
        return "{" + "idSnack=" + idSnack + ", snackName=" + snackName + ", snackPrice=" + snackPrice + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idSnack;
        hash = 29 * hash + Objects.hashCode(this.snackName);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.snackPrice) ^ (Double.doubleToLongBits(this.snackPrice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Snack other = (Snack) obj;
        if (this.idSnack != other.idSnack) {
            return false;
        }
        if (Double.doubleToLongBits(this.snackPrice) != Double.doubleToLongBits(other.snackPrice)) {
            return false;
        }
        return Objects.equals(this.snackName, other.snackName);
    }
    
    
}
