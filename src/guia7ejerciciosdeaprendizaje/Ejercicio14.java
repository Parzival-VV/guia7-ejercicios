/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double cantidadEuros;
        String moneda;
        
        
        System.out.println("Ingrese la cantidad de euros: ");
        cantidadEuros = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingrese la moneda a la que desea convertir, 'Dolar', 'Libra', 'Yen': ");
        leer.nextLine();
        moneda = leer.nextLine();
        System.out.println("");
        
        
        convertir(cantidadEuros, moneda);
    }
    
    public static void convertir(double cantidadEuros, String moneda){
    
        double libra = 0.86;
        double dolar = 1.28611;
        double yen = 129.852;
        double conversion;
        switch(moneda){
            case "Dolar":
                conversion = cantidadEuros * dolar;
                System.out.println("La cantidad de euros ingresados es: " + cantidadEuros + " y equivale a : " + conversion + "dolares.");
                System.out.println("");
                break;
            case "Libra":
                conversion = cantidadEuros * libra;
                System.out.println("La cantidad de euros ingresados es: " + cantidadEuros + " y equivale a : " + conversion + " libras.");
                System.out.println("");
                break;
            case "Yen":
                conversion = cantidadEuros * yen;
                System.out.println("La cantidad de euros ingresados es: " + cantidadEuros + " y equivale a : " + conversion + "yenes.");
                System.out.println("");
                break;
        }
        
}
    
}


