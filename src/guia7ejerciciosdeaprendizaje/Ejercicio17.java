/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int elementos;
        int [] vector;
        
        System.out.println("Ingrese la cantidad de elementos del vector: ");
        elementos = leer.nextInt();
        System.out.println("");
        
        vector = new int[elementos];
        
        for (int i = 0; i < elementos; i++) {
            System.out.println("Ingrese el valor del vector en la posicion " + i + " :");
            vector [i] = leer.nextInt();
            
        }
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < 10){
                c1 ++;
            }else if(vector[i] >= 10 && vector[i] < 100){
                c2 ++;
            }else if(vector[i] >= 100 && vector[i] < 1000){
                c3 ++;
            }else if(vector[i] >= 1000 && vector[i] < 10000){
                c4 ++;
            }else if(vector[i] >= 10000 && vector[i] < 100000){
                c5 ++;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de numeros de un digito es: " + c1);
        System.out.println("");
        System.out.println("La cantidad de numeros de dos digitos es: " + c2);
        System.out.println("");
        System.out.println("La cantidad de numeros de tres digitos es: " + c3);
        System.out.println("");
        System.out.println("La cantidad de numeros de cuatro digitos es: " + c4);
        System.out.println("");
        System.out.println("La cantidad de numeros de 5 digitos es: " + c5);
        System.out.println("");
    }
    
}
