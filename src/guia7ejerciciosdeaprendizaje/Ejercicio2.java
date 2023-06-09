/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.println("");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("");
    }
    
}
