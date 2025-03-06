// Primero, importamos la librería Scanner para poder leer datos del usuario
import java.util.Scanner;  // Esto es importante para poder usar la clase Scanner

public class Clase2 {  // Nombre de la clase, se puede modificar

    public static void main(String[] args) {  // Método principal, siempre necesario en cualquier programa Java

        // Declaración de variables: arriba del código es recomendable declarar las variables
        int a, b, aux;  // Declaramos las variables enteras a, b y una auxiliar aux
        double num;  // Variable para el número decimal, ejemplo de uso de double

        // Usamos Scanner para leer valores introducidos por el usuario
        Scanner scn = new Scanner(System.in);  // Creamos el objeto Scanner llamado scn

        // Solicitar al usuario que ingrese dos números
        System.out.print("Introduce el valor de a: ");  // Mensaje para el primer número
        a = scn.nextInt();  // Leemos el valor de a

        System.out.print("Introduce el valor de b: ");  // Mensaje para el segundo número
        b = scn.nextInt();  // Leemos el valor de b

        // Mostrar los valores originales antes de intercambiarlos
        System.out.println("Valores originales:");
        System.out.println("a = " + a);  // Mostramos el valor de a
        System.out.println("b = " + b);  // Mostramos el valor de b

        // Intercambiamos los valores de a y b usando una tercera variable (aux)
        aux = a;  // Guardamos el valor de a en aux
        a = b;  // Asignamos el valor de b a a
        b = aux;  // Asignamos el valor de aux (que tiene el valor original de a) a b

        // Mostramos los valores después de intercambiarlos
        System.out.println("Valores después del intercambio:");
        System.out.println("a = " + a);  // Mostramos el nuevo valor de a
        System.out.println("b = " + b);  // Mostramos el nuevo valor de b

        // Ejemplo de casteo: pasando un número decimal (double) a un número entero (int)
        System.out.print("Introduce un número decimal: ");
        num = scn.nextDouble();  // Leemos un número decimal
        int numEntero = (int) num;  // Hacemos el casteo de double a int
        System.out.println("Número decimal ingresado: " + num);  // Mostramos el número decimal
        System.out.println("Número casteado a entero: " + numEntero);  // Mostramos el número casteado

        // Otros ejemplos de operadores (puedes agregar más si lo necesitas)
        // Suma, resta, multiplicación, división y resto entre a y b
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int resto = a % b;

        // Mostramos los resultados de los operadores
        System.out.println("Resultados de operaciones con a y b:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);

        // Recuerda siempre dejar espacio y ser ordenado en tu código
        // Esto hace que tu código sea más legible y fácil de mantener
    }
}
