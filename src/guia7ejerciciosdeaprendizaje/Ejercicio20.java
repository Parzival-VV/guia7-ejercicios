/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       // int [] [] matriz = {{2,7,6},{9,5,1},{4,3,8}};// variable de control, se sabe que es un cubo magico.
        int [] [] matriz = new int [3] [3];
        int [] sumaFilas = new int [3]; 
        int [] sumaColumnas = new int [3];
        
       int sumaDiagonal1 = 0, sumaDiagonal2 = 0;
       int num, cont = 0;
        System.out.println("**Ingrese numero del 1 al 9 para crear un cuadrado y verificar si es magico o no.");
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz [i].length; j++) {
                do{
                    System.out.println("Ingrese un numero para la posicion: " + i + " " + j); 
                    num = leer.nextInt();
                    if(num < 1 ||  num > 9){
                        System.out.println("");
                        System.out.println("ERROR, EL NUMERO INGRESADO NO ESTA ENTRE 1 Y 9.");
                    }
                    matriz [i][j] = num;
                    cont ++;
                
                }while(num < 1 || num >9 && cont <= 9);
            }
            
        }
       
       for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal1 += matriz [i][i];//se almacena la suma de la diagonal desde matriz[0][0] + matriz[1][1] +  matriz[2][2]
            sumaDiagonal2 += matriz[matriz.length - 1 - i][i];//se almacena la suma de la diagonal desde matriz[2][0] + matriz[1][1] +  matriz[0][2]
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas [i] += matriz [i][j];//en un vector de 3 elementos guardo las sumas de cada fila
                sumaColumnas [j] += matriz [i][j];//en un vector de 3 elementos guardo la suma de cada columna.
           }
        }
       int contador = 0;
       if(sumaDiagonal1 == sumaDiagonal2 ){
               contador ++;
           }
       for(int i = 0; i < sumaFilas.length; i ++){
           if(sumaDiagonal1 == sumaFilas[i] && sumaDiagonal1 == sumaColumnas [i]
              && sumaDiagonal2 == sumaFilas[i] && sumaDiagonal2 == sumaColumnas [i]){
               contador ++;
           }
       }
       /*Comparo que el resultado de todas las suman sean iguales si las comparaciones son correctas el contador se incrementa en uno por cada vuelta del bucle
       y se incrementa en uno si las suma de las diagonales son iguales dando un total de 4 comparaciones, si son correctas el cuadrado es magico.*/
       if(contador == 4){
           System.out.println("LA SUMA DE TODOS SUS LADOS Y DIAGONALES SON IGUALES, ES UN CUADRADO MAGICO");
       }else{
           System.out.println("LA SUMA DE SUS LADOS Y DIAGONALES NO SON IGUALES, NO ES UN CUADRADO MAGICO.");
       }
       
    }
}
