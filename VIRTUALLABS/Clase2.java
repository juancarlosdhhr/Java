// Primero, importamos la librería Scanner para poder leer datos del usuario
import java.util.Scanner;  // Esto es importante para poder usar la clase Scanner que nos permite leer entradas desde el teclado

public class Clase2 {  // Definimos la clase "Clase2", que es el nombre de nuestro programa

    public static void main(String[] args) {  // El método "main" es el punto de inicio de ejecución del programa

        // Declaración de variables
        // Las variables almacenan valores. Es importante declarar las variables antes de usarlas.
        // Declaramos tres variables de tipo entero (int): a, b, y aux (auxiliar para el intercambio de valores).
        int a, b, aux;  
        
        // También declaramos una variable de tipo double, que es para trabajar con números decimales
        double num;  

        // Usamos Scanner para leer datos del usuario
        Scanner scn = new Scanner(System.in);  // Creamos el objeto Scanner llamado "scn" que leerá la entrada del teclado

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Introduce el valor de a: ");  // Mostramos un mensaje en pantalla pidiendo al usuario que ingrese el valor de "a"
        a = scn.nextInt();  // Usamos el método nextInt() del objeto "scn" para leer un número entero y lo almacenamos en "a"

        System.out.print("Introduce el valor de b: ");  // Mostramos un mensaje en pantalla pidiendo al usuario que ingrese el valor de "b"
        b = scn.nextInt();  // Usamos el método nextInt() nuevamente para leer otro número entero y lo almacenamos en "b"

        // Mostramos los valores de "a" y "b" antes de intercambiarlos
        System.out.println("Valores originales:");
        System.out.println("a = " + a);  // Imprimimos el valor actual de "a"
        System.out.println("b = " + b);  // Imprimimos el valor actual de "b"

        // Aquí comenzamos el proceso de intercambio de los valores de "a" y "b" usando una tercera variable
        aux = a;  // Guardamos el valor de "a" en la variable auxiliar "aux" (ahora "aux" tiene el valor de "a")
        a = b;    // Asignamos el valor de "b" a "a" (ahora "a" tiene el valor de "b")
        b = aux;  // Asignamos el valor de "aux" (que es el valor original de "a") a "b" (ahora "b" tiene el valor original de "a")


        /* La solución es usar una tercera variable para almacenar temporalmente el valor de a antes de que lo cambiemos. Aquí es donde entra la variable aux.  */
        // Mostramos los nuevos valores de "a" y "b" después del intercambio
        System.out.println("Valores después del intercambio:");
        System.out.println("a = " + a);  // Imprimimos el valor de "a" después de que ha sido intercambiado
        System.out.println("b = " + b);  // Imprimimos el valor de "b" después de que ha sido intercambiado

        // Ejemplo de casteo: convertir un número decimal (double) a entero (int)
        // El casteo se hace cuando queremos convertir un tipo de dato a otro tipo compatible.
        System.out.print("Introduce un número decimal: ");  // Pedimos al usuario que ingrese un número decimal
        num = scn.nextDouble();  // Leemos un número decimal con el método nextDouble() y lo almacenamos en "num"
        
        int numEntero = (int) num;  // Hacemos el casteo. Convertimos el valor de "num" (double) a un entero (int)
        
        // Mostramos el número decimal ingresado y su versión casteada a entero
        System.out.println("Número decimal ingresado: " + num);  // Imprimimos el número decimal tal como fue ingresado
        System.out.println("Número casteado a entero: " + numEntero);  // Imprimimos el valor casteado a entero

        // Realizamos algunas operaciones básicas con "a" y "b" (como suma, resta, multiplicación, etc.)
        int suma = a + b;  // Sumamos "a" y "b" y guardamos el resultado en la variable "suma"
        int resta = a - b;  // Restamos "b" de "a" y guardamos el resultado en la variable "resta"
        int multiplicacion = a * b;  // Multiplicamos "a" por "b" y guardamos el resultado en "multiplicacion"
        int division = a / b;  // Dividimos "a" entre "b" y guardamos el resultado en "division" (el resultado será entero)
        int resto = a % b;  // Obtenemos el resto de la división de "a" entre "b" (modulo) y lo guardamos en "resto"

        // Imprimimos los resultados de las operaciones
        System.out.println("Resultados de operaciones con a y b:");
        System.out.println("Suma: " + suma);  // Imprimimos el resultado de la suma
        System.out.println("Resta: " + resta);  // Imprimimos el resultado de la resta
        System.out.println("Multiplicación: " + multiplicacion);  // Imprimimos el resultado de la multiplicación
        System.out.println("División: " + division);  // Imprimimos el resultado de la división
        System.out.println("Resto: " + resto);  // Imprimimos el resultado del resto de la división
    }
}
