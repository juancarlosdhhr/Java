
/* P20. Pedir un número de a 99 y mostrarlo escrito. Por ejemplo 43, mostraría: cuarenta y tres. */



package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Veinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número entre 0 y 99: ");
        int numero = scanner.nextInt();

        // Validar que el número esté en el rango correcto
        if (numero < 0 || numero > 99) {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 99.");
        } else {
            System.out.println("El número en texto es: " + convertirNumeroATexto(numero));
        }

        scanner.close();
    }

    public static String convertirNumeroATexto(int numero) {
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

        if (numero < 10) {
            return unidades[numero];  // Casos 0-9
        } else if (numero < 20) {
            return especiales[numero - 10];  // Casos 10-19
        } else if (numero % 10 == 0) {
            return decenas[numero / 10];  // Casos 20, 30, 40, ..., 90
        } else {
            return decenas[numero / 10] + " y " + unidades[numero % 10];  // Casos intermedios (ej. 43 → "cuarenta y tres")
        }
    }  
}
