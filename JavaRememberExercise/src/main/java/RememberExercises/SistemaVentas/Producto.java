/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.SistemaVentas;

import java.util.Objects;

/**
 *
 * @author maltr
 */
public class Producto {

    private static int contadorProductosCreados = 0;

    private int idProducto;

    private String nombreProducto;

    private float precioProducto;

    @Override
    public String toString() {
        return "{" + "idProducto=" + idProducto
                + ", nombreProducto=" + nombreProducto + ", precioProducto="
                + precioProducto + '}';
    }

    public Producto() {

    }

    public Producto(int idProducto, String nombreProducto, float precioProducto) {
        ++Producto.contadorProductosCreados;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public static int getContadorProductosCreados() {
        return contadorProductosCreados;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idProducto;
        hash = 37 * hash + Objects.hashCode(this.nombreProducto);
        hash = 37 * hash + Float.floatToIntBits(this.precioProducto);
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
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (Float.floatToIntBits(this.precioProducto) != Float.floatToIntBits(other.precioProducto)) {
            return false;
        }
        return Objects.equals(this.nombreProducto, other.nombreProducto);
    }
}
