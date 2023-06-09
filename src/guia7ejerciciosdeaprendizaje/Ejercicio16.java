/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int elementos;
        double nBuscado;
        int contRepetidos = -1;
        int posicion;
        
        System.out.println("Ingrese el tamaño del vector: ");
        elementos = leer.nextInt();
        System.out.println("");
        
        double [] vector = new double[elementos];
        
        for (int i = 0; i < vector.length; i++) {
            int aleatorio = (int) (Math.random() * 10);
            vector[i] = aleatorio;
        }
        
        System.out.println("Ingrese numero a buscar en el vector: ");
        nBuscado = leer.nextDouble();
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == nBuscado){
                posicion = i;
                System.out.println("Su numero se encuentra en las siguientes posiciones: " + posicion);
                contRepetidos ++;
                
        }
            
    }
        
            System.out.println("");
            System.out.println("Su numero se repite: " + contRepetidos);
            System.out.println("");
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);
            
        }
    
}
}
