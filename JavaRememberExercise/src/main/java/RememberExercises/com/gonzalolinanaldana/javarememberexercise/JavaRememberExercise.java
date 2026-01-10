/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package RememberExercises.com.gonzalolinanaldana.javarememberexercise;

/**
 *
 * @author maltr
 */
public class JavaRememberExercise {

    public static void main(String[] args) {
       String nombreUsuario;
       String nombreUsuarioNormalizado;
       String nombreEmpresa;
       String extensionDominio;
       String emailNormalizado;
       String emailFinal;
       
       nombreUsuario = "Ubaldo Acosta Soto";
       nombreUsuarioNormalizado = nombreUsuario.toLowerCase().strip().replace(" ", ".");
       nombreEmpresa = "  Global Mentoring";
       extensionDominio = ".com.mx";
       emailNormalizado = "@" + nombreEmpresa.trim().replace(" ", ".").toLowerCase() + extensionDominio;
       IO.println("Email final generado: " + nombreUsuarioNormalizado + emailNormalizado);
    }
}
