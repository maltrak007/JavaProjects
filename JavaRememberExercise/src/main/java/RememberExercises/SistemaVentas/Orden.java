/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.SistemaVentas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Orden {

    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Producto> cestaUsuario = new ArrayList<>();
    private static ArrayList<Integer> listaID = new ArrayList<>();
    private static float sumaTotal = 0;

    public static void main(String[] args) {
        Boolean salirApp = false;
        Scanner scanner = new Scanner(System.in);

        while (!salirApp) {
            IO.println("""
                       ***********************
                       ***Sistema de ventas***
                       ***1.Agregar Producto**
                       ***2.Mostrar Orden  ***
                       ***3.Crear Producto ***
                       ***4.Salir          ***
                       ***********************
                       """);
            
            int opcionUsuario = Integer.parseInt(scanner.nextLine());
            switch (opcionUsuario) {
                case 1:
                    AgregarProductoACesta(cestaUsuario);
                    break;

                case 2:
                    IO.println(CalcularTotal());
                    break;

                case 3:
                    AgregarProducto(productos);
                    break;

                case 4:
                    IO.println("Que pase un buen dia");
                    salirApp = true;
                    break;

                default:
                    IO.println("Opción no disponible");
                    break;
            }
        }

    }

    public static void AgregarProductoACesta(ArrayList<Producto> _cestaUsuario) {
        Scanner scanner = new Scanner(System.in);
        Boolean compraFinalizada = false;
        if (!productos.isEmpty()) {
            while (!compraFinalizada) {
                IO.println("¿Que producto desea agregar a la cesta?\n Seleccione el ID del producto o seleccione 0 para salir\n");
                for (Producto producto : productos) {
                    IO.println(producto.toString());
                }
                int productoUsuario = Integer.parseInt(scanner.nextLine());
                if (listaID.contains(productoUsuario)) {
                    for (Producto producto : productos) {
                        if (producto.getIdProducto() == productoUsuario) {
                            cestaUsuario.add(producto);
                            sumaTotal += producto.getPrecioProducto();
                        }
                    }
                    IO.println("Producto agregado correctamente");
                    IO.println("\n¿Desea agregar otro producto? (Y|Yes N|No)");
                    String opcionContinuar = scanner.nextLine();
                    if (opcionContinuar.toUpperCase().equals("YES") || opcionContinuar.toUpperCase().equals("Y")) {
                        continue;
                    } else if (opcionContinuar.toUpperCase().equals("NO") || opcionContinuar.toUpperCase().equals("N")) {
                        break;
                    }
                    IO.println("Introduzca un valor válido");
                } else if (productoUsuario == 0) {
                    compraFinalizada = true;
                } else {
                    IO.println("No hay producto con ese ID");
                }
            }
            //break;
        }
        IO.println("No hay productos disponibles");
        //break;
    }

    public static String CalcularTotal() {
        String totalFormateado = String.format("%.2f$", sumaTotal);
        String finalMessage = ("El total de su cesta es de:" + totalFormateado + " con un total de " + cestaUsuario.size() + " anhadidos\n");
        return finalMessage;
    }

    public static void AgregarProducto(ArrayList<Producto> _productosEnVenta) {
        Scanner scanner = new Scanner(System.in);
        Boolean idRepetido = false;
        IO.println("Nombre del producto");
        String nombreProducto = scanner.nextLine();
        IO.println("Indique un ID de producto");
        int idProducto = Integer.parseInt(scanner.nextLine());

        if (listaID.contains(idProducto)) {
            idRepetido = true;
        }
        while (idRepetido) {
            if (listaID.contains(idProducto)) {
                IO.println("ID no disponible introduzca uno nuevo");
                idProducto = Integer.parseInt(scanner.nextLine());
            } else {
                idRepetido = false;
            }
        }

        IO.println("Precio del producto");
        float precioProducto = Float.parseFloat(scanner.nextLine());

        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombreProducto(nombreProducto);
        nuevoProducto.setIdProducto(idProducto);
        nuevoProducto.setPrecioProducto(precioProducto);
        _productosEnVenta.add(nuevoProducto);

        listaID.add(idProducto);

        IO.println("Producto creado correctamente");
    }
}
