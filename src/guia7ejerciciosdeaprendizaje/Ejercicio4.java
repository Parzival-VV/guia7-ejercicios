/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradosC, gradosF;
        
        System.out.println("Ingrese la cantidad de grados centigrados: ");
        gradosC = leer.nextDouble();
        System.out.println("");
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados centigrados ingresados equivalen a: " + gradosF + "fahrenheit");
        System.out.println("");
        
    }
    
}
