

/* P22. Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla:
*
**
***
**** */



package UNIDAD2EJERCICIOS;

public class Veintidos {
    public static void main(String[] args) {
        // Bucle para imprimir la figura
        for (int i = 1; i <= 4; i++) { // Controla el número de filas
            for (int j = 1; j <= i; j++) { // Imprime '*' según la fila en la que esté
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
