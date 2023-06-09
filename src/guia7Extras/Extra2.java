/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia7Extras;

/**
 *
 * @author Rafael
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 8, B = 6, C = 4, D = 2, aux;
        System.out.print("A=" + A +", B=" + B + ", C=" + C + ", D=" + D + "\n");
        aux = B;
        B = C;//B=4
        C = A;//C=8
        A = D;//A=2
        D = aux;//D=6;
         System.out.println("A=" + A +", B=" + B + ", C=" + C + ", D=" + D + "\n");
    }
    
}
