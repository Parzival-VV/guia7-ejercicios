/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String palabra;
        
        System.out.println("Ingrese una palabra: ");
        palabra = leer.nextLine();
        
        if(palabra.equals("eureka")){
            System.out.println("Correcto.");
        }else{
            System.out.println("INCORRECTO.");
        }
        
        
        
    }
    
}
