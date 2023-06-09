/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nLimite, num, suma = 0;
        
        System.out.println("Ingrese un numero positivo: ");
        nLimite = leer.nextDouble();
        
        do{
            System.out.println("Ingrese un numero a sumar: ");
                    num = leer.nextDouble();
                    suma += num;
        }while(suma < nLimite);
        
        System.out.println("El numero limite es: " + nLimite);
        System.out.println("");
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
