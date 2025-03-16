import java.util.Scanner;

public class Clase13Bucles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // ---------------- EJERCICIO 1 ----------------
        /*
        1
        12
        123
        1234
        12345
        */
        System.out.println("Introduzca el nivel del triángulo:");
        int nivel = scn.nextInt(); 

        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // ---------------- EJERCICIO 2 ----------------
        /*
        * Hacer el factorial de un número
        * 5! = 5*4*3*2*1 = 120
        */
        System.out.println("Introduzca un número entero positivo:");
        int num = scn.nextInt();
        int factorial = 1;

        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);

        // ---------------- EJERCICIO 3 ----------------
        /*
         * Suma de negativos y promedio de positivos
         */
        System.out.println("Introduzca cuántos números vas a introducir:");
        int cantidad = scn.nextInt();

        int sumatorioNeg = 0, sumatorioPos = 0, contPos = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduzca un número:");
            int a = scn.nextInt();
            
            if (a < 0) {
                sumatorioNeg += a;
            } else if (a > 0) {
                sumatorioPos += a;
                contPos++;
            }
        }

        System.out.println("Suma de negativos: " + sumatorioNeg);
        if (contPos > 0) {
            float media = (float) sumatorioPos / contPos;
            System.out.println("La media de los positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        // ---------------- EJERCICIO 4 ----------------
        /*
         * Simulación del lanzamiento de cinco monedas diferentes
         */
        System.out.println("Lanzamiento de 5 monedas:");

        for (int i = 1; i <= 5; i++) {
            int m = (int) (Math.random() * 8);
            int p = (int) (Math.random() * 2);

            String moneda = switch (m) {
                case 0 -> "1 céntimo";
                case 1 -> "2 céntimos";
                case 2 -> "5 céntimos";
                case 3 -> "10 céntimos";
                case 4 -> "20 céntimos";
                case 5 -> "50 céntimos";
                case 6 -> "1 euro";
                default -> "2 euros";
            };

            String posicion = (p == 0) ? "cara" : "cruz";

            System.out.println(moneda + " - " + posicion);
        }

        scn.close();
    }
}
