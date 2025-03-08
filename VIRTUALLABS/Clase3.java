import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        
        // Ejemplo 1: Comprobación de mayor o menor de edad
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la edad al usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        // Comprobamos si el usuario es mayor o menor de edad
        if (edad >= 18) {
            // Si la edad es mayor o igual a 18, la persona es mayor de edad
            System.out.println("El usuario es mayor de edad.");
        } else if (edad >= 0 && edad <= 17) {
            // Si la edad es mayor o igual a 0 y menor o igual a 17, la persona es menor de edad
            System.out.println("El usuario es menor de edad.");
        } else {
            // Si la edad es un valor negativo, significa que es un valor incorrecto
            System.out.println("Error: Edad no válida.");
        }

        System.out.println("Fin del programa.");

        
        // Ejemplo 2: Comprobación de si un número es positivo, negativo o cero
        System.out.print("\nIntroduce un número: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            // Si el número es mayor que 0, entonces es positivo
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            // Si el número es menor que 0, entonces es negativo
            System.out.println("El número es negativo.");
        } else {
            // Si el número es 0, mostramos que el número es cero
            System.out.println("El número es 0.");
        }

        
        // Ejemplo 3: Comprobación si el número es par o impar
        System.out.print("\nIntroduce un número para comprobar si es par o impar: ");
        int num2 = scanner.nextInt();
        
        if (num2 % 2 == 0) {
            // Si el resto de la división del número por 2 es 0, es un número par
            System.out.println("El número es par.");
        } else {
            // Si el resto de la división del número por 2 no es 0, es un número impar
            System.out.println("El número es impar.");
        }

        
        // Ejemplo 4: Comparación de cadenas de texto con 'equals' y 'equalsIgnoreCase'
        scanner.nextLine();  // Limpiar el buffer del scanner para evitar problemas al leer texto
        System.out.print("\nIntroduce un texto: ");
        String textoUsuario = scanner.nextLine();
        
        String texto = "Hola";
        
        // Usamos equals para comparar exactamente las cadenas (teniendo en cuenta mayúsculas/minúsculas)
        if (texto.equals(textoUsuario)) {
            System.out.println("¡Enhorabuena! Has introducido el texto correcto.");
        } else {
            System.out.println("El texto no es correcto.");
        }

        // Usamos equalsIgnoreCase para comparar las cadenas sin tener en cuenta mayúsculas y minúsculas
        if (texto.equalsIgnoreCase(textoUsuario)) {
            System.out.println("¡Enhorabuena! Has introducido el texto correctamente, ignorando mayúsculas/minúsculas.");
        } else {
            System.out.println("El texto no es correcto, incluso ignorando mayúsculas/minúsculas.");
        }

        
        // Ejemplo 5: Uso de booleano en condicionales
        boolean a = true;
        
        // Usamos la variable booleana 'a' directamente en el if
        if (a) {
            // Si 'a' es true, ejecutamos este bloque
            System.out.println("\nEl valor de 'a' es true.");
        } else {
            // Si 'a' es false, ejecutamos este bloque
            System.out.println("\nEl valor de 'a' es false.");
        }

        // Usamos la negación de la variable 'a' con '!'
        if (!a) {
            // Si 'a' es false (porque usamos '!a'), ejecutamos este bloque
            System.out.println("\nEl valor de 'a' es false.");
        } else {
            // Si 'a' es true, ejecutamos este bloque
            System.out.println("\nEl valor de 'a' es true.");
        }
        
        scanner.close(); // Cerramos el scanner para liberar recursos
    }
}


/* Resumen de las Estructuras Condicionales:

if: Ejecuta el bloque si la condición es verdadera.
        
else if: Ejecuta si el bloque anterior (if) no se cumple, pero la condición de else if es verdadera.     

else: Ejecuta si ninguna de las condiciones anteriores se cumple.


Equivalencias en español (simplificadas):

if: "Si"

else if: "Y si" o "Si no, pero..."
 
else: "Si no" (Cuando no se cumple ninguna condición anterior) */

