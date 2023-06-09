/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        do{
        System.out.println("Ingrese una letra: ");
        letra = leer.nextLine();
        }while(letra.length() > 1);
        System.out.println("");
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Es una vocal.");
        }else{
            System.out.println("No es una vocal.");
        }
    }
    
}
