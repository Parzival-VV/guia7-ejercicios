/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        
        System.out.println("Engrese primer numero: ");
        n1 = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese segundo numero: ");
        n2 = leer.nextInt();
        System.out.println("");
        
        suma = n1 + n2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("");
    }
    
}
