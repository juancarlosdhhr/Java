
/* P21. Ejercicio: Transforma el siguiente bucle for en un bucle while.
for ( int i = 5; i < 15; i++) {
 System.out.print(i + " ");
}
System.out.println(); */


package UNIDAD2EJERCICIOS;

public class Veintiuno {
    public static void main(String[] args) {
        // Versión con for
        for (int i = 5; i < 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // Versión con while
        int i = 5; // Inicialización de la variable antes del while
        while (i < 15) { // Condición del bucle
            System.out.print(i + " ");
            i++; // Incremento de la variable dentro del bucle
        }
        System.out.println(); // Salto de línea
    }
}
