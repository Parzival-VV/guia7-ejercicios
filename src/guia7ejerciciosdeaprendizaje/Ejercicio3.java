/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String frase;
       
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("");
        
        System.out.println("Su frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Su frase en minusculas es: " + frase.toLowerCase());
        System.out.println("");
        
    }
    
}
