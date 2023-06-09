
package guia7ejerciciosdeaprendizaje;
/**
 * @author Rafael
 */
public class Ejercicio18 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] [] matriz = new int [4] [4];//inicio matriz bidimensional de 4*4.
        
        for (int[] matriz1 : matriz) { //for each para recorrer la matriz 
            for (int j = 0; j < matriz1.length; j++) {
                int aleatorio = (int) (Math.random() * 10);// se crea variable y se le asigna un valor aleatorio del 1 al 10
                matriz1[j] = aleatorio; //se le asigna valores aleatorios a la matriz
            }
        }
   /* int[] [] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //bloque de control.
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.println(matriz1[j] + " ");
            }
        }*/
        int [] [] matrizTraspuesta = new int [4] [4];// se crea  nueva matriz para almacenar los nuevos valores
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {//se recorre la matriz
                matrizTraspuesta [j][i] = matriz [i] [j];/*la matriz itera con la var i para las filas y j para las columnas
                en la nueva matriz guardamos las filas en las columnas y viceversa*/
            }
        }
            
            System.out.println("Esta es la matriz: ");//imprime la matriz por pantalla
         for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.println(matriz1[j] + " ");
            }
        }
         
             System.out.println("");
             System.out.println("Esta es la Matriz traspuesta: ");
             
        for(int [] matriz1 : matrizTraspuesta){// imprime la matriz traspuesta por pantalla
            for(int j = 0; j < matriz1.length; j++){
                System.out.println(matriz1[j] + " ");
            }
        }
    }
  
    
}
