/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:

Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package guia7ejerciciosdeaprendizaje;

/**
 *
 * @author Rafael
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] [] matrizM = {{10,20,30,40,50,60,70,80,90,100}
                            ,{1 ,2 ,3 ,4 ,5, 6, 7, 8, 9, 10}
                            ,{56,78,95,22,73,47,58,60,91,99}
                            ,{41,87,24,56,97,74,87,42,74,35}
                            ,{32,76,79, 1,36, 5,67,96,12,11}
                            ,{99,13,54,88,89,90,75,41,47,76}
                            ,{67,78,87,45,14,22,26,56,56,78}
                            ,{98,45,34,23,32,56,74,16,19,18}
                            ,{24,67,97,46,87,13,67,89,93,24}
                            ,{21,28,78,98,90,77,12,65,11,23}
        };
        int [] [] matrizP = {{36,5,67},{89,90,75},{14,22,26}};
        
        for (int i = 0; i < matrizM.length; i++) {
        for (int j = 0; j < matrizM[i].length; j++) {
            boolean encontrado = true;
            for (int k = 0; k < matrizP.length; k++) {
                for (int l = 0; l < matrizP[k].length; l++) {
                    if (matrizM[i + k][j + l] != matrizP[k][l]) {
                        encontrado = false;
                        break;
                    }
                }
               
            }
            if (encontrado) {
                System.out.println("La submatriz P se encuentra en la matriz M en los índices:");
                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP[k].length; l++) {
                        System.out.println((i + k) + "," + (j + l));
                    }
                }
                break;
            }
        }
    }
    System.out.println("La submatriz P no se encuentra dentro de la matriz M.");
}
}