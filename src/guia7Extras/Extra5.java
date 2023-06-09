/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package guia7Extras;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String claseSocio;
        double costoTratamiento;
        
         do{
        System.out.println("Ingrese la clase de su clase ");
        claseSocio = leer.nextLine();
        
         }while(!claseSocio.equalsIgnoreCase("A") && !claseSocio.equalsIgnoreCase("B") && !claseSocio.equalsIgnoreCase("C"));
        
         switch(claseSocio){
             case "A":
             case "a":
                     System.out.println("Ingrese El costo del tratamiento: ");
                     costoTratamiento = leer.nextDouble();
                     System.out.println("");
                     costoTratamiento -= costoTratamiento *0.5;
                    System.out.println("El costo de su tratamiento con el % 50 de descuento es: " +  "$" + costoTratamiento + "\n");
                 break;
             case "B":
             case "b":
                     System.out.println("Ingrese El costo del tratamiento: ");
                     costoTratamiento = leer.nextDouble();
                     System.out.println("");
                     costoTratamiento -= costoTratamiento *0.35;
                     System.out.println("El costo de su tratamiento con % 35 de descuento es: "+  "$" +  costoTratamiento + "\n");
                 break;
             case "C":
             case "c":
                     System.out.println("El costo de su tratamiento no tiene descuentos usted abona el % 100 del total.");
                     System.out.println("");
             default:
                 break;
                 
         }
         
         
    }
    
}

