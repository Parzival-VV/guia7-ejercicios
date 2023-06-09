/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia7Extras;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Extra1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutosIngresados;
        int horas;
        int dia ;
        int horasDiferencia=0;
        System.out.println("Ingrese la cantidad de minutos: ");
        minutosIngresados = leer.nextInt();
        
        dia = (minutosIngresados / 60) / 24;
        horas = minutosIngresados / 60;
        
        if(horas > 24 ){
            horasDiferencia = horas % 24;
        }
        
        System.out.println("El equivalente es: " + dia + "dias ," + horasDiferencia + " horas.");
        
        
    }
    
}
