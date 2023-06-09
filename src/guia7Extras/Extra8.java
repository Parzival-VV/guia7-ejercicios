/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 1, pares = 0 , impares = 0;
        
        
        while(n > 0){
            System.out.println("Digite un numero: ");
            n = leer.nextInt();
            if(n%5 ==0){
                break;
            }
            if(n%2 == 0){
                pares ++;
            }else{
                impares ++;
            }
          
        }
        
        
        System.out.println("");
        System.out.println("La cantidad de numeros ingresados es: " + (pares + impares) + "\n");
        System.out.println("La cantidad de numeros pares ingresados fue: " + pares + "\n");
        System.out.println("La cantidad de numeros impares ingresados fue: " + impares + "\n");
    }
    
}
