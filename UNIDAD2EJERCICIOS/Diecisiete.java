/* P17. Pedir 3 números y mostrarlos ordenados de mayor a menor. */

package UNIDAD2EJERCICIOS;

import java.util.Scanner; // Importamos Scanner para leer datos del usuario

public class Diecisiete { // Nombre de la clase
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario tres números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        int num3 = scanner.nextInt();

        // Ordenar los números de mayor a menor
        int mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados de mayor a menor: " + mayor + " > " + medio + " > " + menor);

        // Cerrar el scanner
        scanner.close();
    }
}
