/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor = 0, resto = 0, cociente = 0;
        
        do{
        System.out.println("Digite el valor del dividendo: ");
        dividendo = leer.nextInt();
        System.out.println("Digite el valor del divisor: " + "\n");
        divisor = leer.nextInt();
        if(dividendo < 2 || divisor < 2){
            System.out.println("Ingrese valores mayores a 1." + "\n");
        }
        }while(divisor < 2 || dividendo < 2);
        
         resto = dividendo;
        
        do{
            resto -= divisor;
            cociente ++; 
        }while(resto > divisor);
        
        System.out.println("El cociente de la division es : " + cociente + "\n");
        System.out.println("El resto de la division es: " + resto +"\n");
    }
    
}
