/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 * @author Rafael
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double n1, n2;
        int opc; 
        
        System.out.println("Ingrese primer numero: ");
        n1 = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingrese segundi numero: ");
        n2 = leer.nextDouble();
        System.out.println("");
        System.out.println("");
        /*En este bloque pedimos los dos numeros para operar.*/
        
        int fin = 0; //Se establece variable para salir del bucle cuando sea necesario.
        while(fin == 0){ //se inicia bucle while que mientras la variable fin sea igual a 0 el bloque dentro del bucle se va a seguir ejecutando.
        System.out.println("MENU:");
        System.out.println("1. Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicar.");
        System.out.println("4. Dividir.");
        System.out.println("5. Salir.");
        System.out.println("Elija opcion: ");
        opc = leer.nextInt();
        /*Se muestra por pantalla el menu y el ingreso a l mismo mediante la variable opc*/
        
          
             switch(opc){//inicia bucle switch
                 case 1:
                     System.out.println("La suma de los numeros ingresados es: " + (n1 + n2) );
                     
                     break;
                 case 2:
                     System.out.println("La resta de los numeros ingresad4os es: " + (n1 - n2));
                    
                     break;
                 case 3:
                     System.out.println("La multiplicacion de los numeros ingresados es: " + (n1 * n2));
                                       
                     break;
                 case 4:
                     System.out.println("La division de los numeros ingresados es: " + (n1 / n2));
                     
                     break;
                 case 5:
                     System.out.println("¿Esta seguro que desa salir del programa (S/N)?: ");
                     leer.nextLine();/*cabe destacar que en esta linea de comandos esta para limpiar el buffer de teclado dado que mi primera opcion fue la siguiente:
                     
                     System.out.println("¿Esta seguro que desa salir del programa (S/N)?: ");
                     String respuesta = leer.nextLine();
                      if(){etc...
                     de esta manera me repetia el menu y no me dejaba ingresar la respuesta.
                     
                     */
                     String respuesta = leer.nextLine();
                     if(respuesta.equalsIgnoreCase("S")){
                         fin = 1;
                     }
                    break;
                    /*Para salir del programa segun las especificaciones se procede como dicta si la respuesta es "S" 
                    la variable fin pasa a valer 1 y se interrumpe el bucle while*/
                 default:
                     System.out.println("La opcion ingresada es incorrecta, intentelo de nuevo.");
                     // en caso de ingresar un caracter no valido sale el mensaje de arriva y se repite el bucle.
                    break;
        }
        }
    }
    }
        
    

