/* P26. Escribe un programa en Java que le pida al usuario un entero N y dibuje
un triángulo creciente de altura N. Por ejemplo, si N es 4, deberá dibujar: 
*
**
***
****


*/
package UNIDAD2EJERCICIOS;

import java.util.Scanner;  // El import debe ir fuera de la clase

public class Veintiseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero N
        System.out.print("Introduce un número entero N para la altura del triángulo: ");
        int N = scanner.nextInt();

        // Dibujar el triángulo creciente
        for (int i = 1; i <= N; i++) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        scanner.close();
    }
}
