/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia7ejerciciosdeaprendizaje;
/**
 *
 * @author Rafael
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int [] [] matrizTraspuesta = new int [3] [3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta [j][i] = matriz[i][j];
                
            }
            
        }
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("  ");
                System.out.print(matriz1[j]);
            }
        }
        System.out.println("");
         for (int[] matriz1 : matrizTraspuesta) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("  ");
                System.out.print(matriz1[j]);
            }
        }
         System.out.println("");
         boolean antiSimetrica = true;
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 if(matrizTraspuesta[i] [j] != -(matriz [i] [j])){
                     antiSimetrica = false;
                     break;
                 }
                 
             }
            
        }
       if(antiSimetrica == true){
           System.out.println("La matriz es antisimetrica.");     
       } else if(antiSimetrica == false){
            System.out.println("La matriz NO es antisimetrica."); 
       }
    }
    
}
