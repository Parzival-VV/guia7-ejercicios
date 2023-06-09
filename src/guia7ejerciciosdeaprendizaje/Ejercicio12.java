/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia7ejerciciosdeaprendizaje;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
       
        int contadorCorrectas = 0, contadorIncorrectas = 0;
        
        do{
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            
            if(cadena.substring(0, 1).equals("x") && cadena.substring(4, 5).equals("o") && cadena.length() == 5){
                contadorCorrectas ++;
            }else if(cadena.equals("&&&&&") && contadorIncorrectas == 0){
                contadorIncorrectas = 0;
            }else if(cadena.equals("&&&&&") && contadorIncorrectas > 0){
                break;
            }else{
                contadorIncorrectas ++;
            }
            
        }while(!"&&&&&".equals(cadena));
        
        System.out.println("La cantidad de cadenas de formato correctas son: " + contadorCorrectas);
        System.out.println("");
        System.out.println("La cantidad de cadenas de formato incorrecto son: " + contadorIncorrectas);
    }
    
}
