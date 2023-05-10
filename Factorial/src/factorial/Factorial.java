
package factorial;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Ciclo for
 * Programa para el cálculo del fatorial de un número
 *
 */

public class Factorial {

    static int numero;
       static double factorial = 1.0;
    
       
       public void entrada(){
      
       
        System.out.print("Introduzca un número entero: ");
        Scanner stdIn = new Scanner(System.in);
        numero = stdIn.nextInt();
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println(numero + "! = " + factorial);
    }
}
