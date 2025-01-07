
// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

// Declaramos la clase principal
public class Clase1 {
    // Declaramos una constante para el IVA (no se utiliza en el código actual, pero es un ejemplo de constante)
    final static int IVA = 21;

    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos introducidos por el usuario desde la consola
        Scanner entrada = new Scanner(System.in);

        // Declaramos una variable entera para almacenar el número ingresado por el usuario
        int n = 0 ;

        // Declaramos una variable booleana para verificar si la entrada es un número entero
        boolean esEntero;

        // Solicitamos al usuario que introduzca un número
        System.out.println("Introduce un número:");

        // Verificamos si la entrada del usuario es un número entero
        esEntero = entrada.hasNextInt();

        // Si la entrada es un número entero, la leemos y la almacenamos en la variable `n`
        if (esEntero) {
            n = entrada.nextInt(); // Leemos el número ingresado por el usuario
            System.out.println("El número introducido es: " + n); // Mostramos el número ingresado
        } else {
            // Si la entrada no es un número entero, mostramos un mensaje de error
            System.out.println("No es un número válido.");
        }

        // Cerramos el objeto Scanner para liberar los recursos
        entrada.close();
    }
}

 //EJEMPLO CON SWITCH Y CASE:

// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

// Declaramos la clase principal
public class Clase1 {
    // Declaramos una constante para el IVA (aunque no se utiliza en este código, es un ejemplo de constante)
    final static int IVA = 21;

    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos introducidos por el usuario desde la consola
        Scanner entrada = new Scanner(System.in);

        // Inicializamos la variable entera con un valor por defecto
        int n = 0;

        // Solicitamos al usuario que introduzca un número entre 1 y 5
        System.out.println("Introduce un número entre 1 y 5:");

        // Verificamos si la entrada del usuario es un número entero
        if (entrada.hasNextInt()) {
            // Leemos el número ingresado por el usuario
            n = entrada.nextInt();

            // Usamos switch-case para realizar acciones basadas en el valor de 'n'
            switch (n) {
                case 1:
                    System.out.println("Has introducido el número uno.");
                    break; // Finaliza el caso si se cumple
                case 2:
                    System.out.println("Has introducido el número dos.");
                    break;
                case 3:
                    System.out.println("Has introducido el número tres.");
                    break;
                case 4:
                    System.out.println("Has introducido el número cuatro.");
                    break;
                case 5:
                    System.out.println("Has introducido el número cinco.");
                    break;
                default:
                    // Si el número no está entre 1 y 5, mostramos un mensaje
                    System.out.println("El número no está entre 1 y 5.");
            }
        } else {
            // Si la entrada no es un número entero, mostramos un mensaje de error
            System.out.println("No es un número válido.");
        }

        // Cerramos el objeto Scanner para liberar los recursos
        entrada.close();
    }
}

//LosIF son muy costosos. Cuando hacemos un IF lo que hace el ordenador es que convierte lo que estamos comparando en ceros y unos
// lo lleva a una puerta lógica, lo evalúa y devuelve una solución, entonces es algo muy costoso en términos de procesamiento.

//En conclusión, todo lo que podamos hacer con SWITCH le va a dar mucha más agilidad a mi código.
