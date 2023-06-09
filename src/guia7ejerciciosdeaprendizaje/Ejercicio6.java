/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        System.out.println("Ingrese un numero entero: ");
        n = leer.nextInt();
        System.out.println("");
        
        if(n % 2 == 0){
            System.out.println("El numero ingresado es PAR.");
        }else{
            System.out.println("");
            System.out.println("El numero ingresado es IMPAR.");
        }
        System.out.println("");
    }
    
}
