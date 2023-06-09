/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author Rafael
 */
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double n, doble, triple, rCuadrada;
        System.out.println("Ingrese un numero entero: ");
        n = leer.nextInt();
        System.out.println("");
        
        doble = n * 2;
        triple = n * 3;
        rCuadrada =  Math.sqrt(n);
        
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("");
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("");
        System.out.println("La raiz cuadrada del numero ingresado es: " + rCuadrada);
        System.out.println("");
    }
    
}
