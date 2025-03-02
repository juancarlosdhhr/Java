

/* P19. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. */

package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Diecinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el día, mes y año al usuario
        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        // Comprobar si la fecha es válida
        boolean fechaValida = false;

        if (mes >= 1 && mes <= 12) { // Mes válido
            int diasEnMes;

            // Determinar los días que tiene el mes
            switch (mes) {
                case 4, 6, 9, 11 -> diasEnMes = 30; // Abril, junio, septiembre, noviembre
                case 2 -> { // Febrero
                    // Año bisiesto: divisible por 4 y (no divisible por 100 o sí divisible por 400)
                    boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
                    diasEnMes = esBisiesto ? 29 : 28;
                }
                default -> diasEnMes = 31; // Meses con 31 días
            }

            // Verificar si el día es válido
            if (dia >= 1 && dia <= diasEnMes) {
                fechaValida = true;
            }
        }

        // Mostrar el resultado
        if (fechaValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada NO es válida.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
