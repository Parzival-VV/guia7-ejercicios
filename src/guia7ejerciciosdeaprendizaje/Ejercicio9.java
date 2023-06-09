/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        String frase, letra, letraComparativa = "A";
        
        System.out.println("Ingresa palabra: ");
        frase = leer.nextLine();
        
        letra = frase.substring(0,1);
        
        if(letra.equals(letraComparativa)){
            System.out.println("CORRECTO.");
        }else{
            System.out.println("INCORRECTO.");
        }
        
    }
    
}
