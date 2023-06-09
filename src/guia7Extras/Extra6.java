/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int personas;
        double [] estaturas;
        double [] estaturasMayor;
        double aux;
        int cont = 0;
        
        System.out.println("Ingrese cantidad de personas: ");
        personas = leer.nextInt();
        System.out.println("");
        
       estaturas = new double [personas];
       estaturasMayor = new double [personas];
       
        
        for (int i = 0; i <= personas - 1; i++) {
            System.out.println("Ingrese la estatura de la persona " + (i + 1) + ": ");
            aux = leer.nextDouble();
            if(aux <= 1.60){
                estaturas [i] = aux;
                cont ++;
            }else{
                estaturasMayor [i - cont] = aux;
            }
            
        }
        double promedioGeneral = (sumaVector(estaturas) + sumaVector(estaturasMayor)) / personas;
        double promedioMenor = sumaVector(estaturas) / cont;
        
        System.out.println("El promedio de estaturas de personas que miden menos de 1.6 metros es: " + promedioMenor);
        System.out.println("");
        System.out.println("El promedio de general de las estaturas de las personas ingresadas es: " + promedioGeneral);
        
              
    }public static double sumaVector (double [] vector){
        double suma=0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i];
            }
        
        return suma;
    }
    
}
