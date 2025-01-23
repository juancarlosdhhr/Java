
/* Realiza un programa con una variable entera t la cual contiene un tiempo
en segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos. */


package UNIDAD1EJERCICIOS;

import java.util.Scanner;

public class Dieciocho {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el tiempo en segundos
        System.out.print("Introduce el tiempo en segundos: ");
        int t = scanner.nextInt();

        // Calcular las horas, minutos y segundos
        int horas = t / 3600; // 1 hora = 3600 segundos
        int minutos = (t % 3600) / 60; // El resto de segundos dividido por 60 nos da los minutos
        int segundos = t % 60; // El resto de segundos después de extraer las horas y los minutos

        // Mostrar el resultado
        System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        
        // Cerrar el scanner
        scanner.close();
    }
}
