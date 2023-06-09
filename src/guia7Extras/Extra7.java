/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n , cont = 0, suma = 0, minimo = 999999, maximo = 0, aux , promedio;
        
        System.out.println("Digite la cantidad de numeros a ingresar: ");
        n = leer.nextInt();
        
        while(cont < n){
            do{
            System.out.println("Ingrese el numero " + (cont + 1) + ": ");
            aux = leer.nextInt();
            }while(aux <= 0);
            suma += aux;
            if(aux < minimo ){
                minimo = aux;
            }else if(aux > maximo){
                maximo = aux;
            }
                cont++;    
        }

    /*  do{
          do{
           System.out.println("Ingrese el numero " + (cont + 1) + ": ");
            aux = leer.nextInt();
          }while(aux <= 0);
            suma += aux;
            if(aux < minimo ){
                minimo = aux;
            }else if(aux > maximo){
                maximo = aux;
            }
                cont++;
      }while(cont != n );*/
      
       promedio = suma / n;
        System.out.println("");
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
        System.out.println("");
        System.out.println("EL valor minimo ingresado es: " + minimo);
        System.out.println("");
        System.out.println("El valor maximo ingresado es: " + maximo);
        System.out.println("");
        
    }
    
}
