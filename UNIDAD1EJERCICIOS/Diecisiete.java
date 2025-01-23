
/* Realiza un programa que genere letras aleatoriamente
y determine si son vocales o consonantes. */

package UNIDAD1EJERCICIOS;

import java.util.Random;

public class Diecisiete {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar una letra aleatoria entre 'a' y 'z'
        char letra = (char) ('a' + random.nextInt(26));

        // Mostrar la letra generada
        System.out.println("Letra generada: " + letra);

        // Comprobar si la letra es una vocal o consonante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("Es una consonante.");
        }
    }
}

