import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class Clase4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // ------------------------------ //
        // Ejercicio 1: Determinar si una persona es mayor o menor de edad
        // ------------------------------ //
        System.out.print("Ingrese su edad: ");
        int edad = scn.nextInt();
        
        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad.");
        } else if (edad >= 0 && edad < 18) {
            System.out.println("El usuario es menor de edad.");
        } else {
            System.out.println("Error: La edad ingresada no es válida.");
        }
        
        // Conclusión:  
        // Se ha determinado correctamente si la persona es mayor o menor de edad.  
        // El programa también maneja casos donde la edad es inválida.

        // ------------------------------ //
        // Ejercicio 2: Determinar si un número es positivo, negativo o cero, y si es par o impar
        // ------------------------------ //
        System.out.print("Ingrese un número: ");
        int num = scn.nextInt();
        
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // Comprobamos si el número es par o impar
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // Conclusión:
        // El programa identifica correctamente la naturaleza del número y su paridad.

        // ------------------------------ //
        // Ejercicio 3: Comparación de Strings con equals y equalsIgnoreCase
        // ------------------------------ //
        System.out.print("Ingrese un texto: ");
        scn.nextLine(); // Consumimos la línea vacía
        String textoUsuario = scn.nextLine();
        String textoReferencia = "Hola";
        
        if (textoReferencia.equals(textoUsuario)) {
            System.out.println("Los textos son exactamente iguales.");
        } else if (textoReferencia.equalsIgnoreCase(textoUsuario)) {
            System.out.println("Los textos son iguales, ignorando mayúsculas y minúsculas.");
        } else {
            System.out.println("Los textos son diferentes.");
        }
        
        // Conclusión:
        // Se ha verificado la igualdad de cadenas, diferenciando mayúsculas y minúsculas.

        // ------------------------------ //
        // Ejercicio 4: Obtener el día de la semana a partir de un número (switch)
        // ------------------------------ //
        System.out.print("Ingrese un número del 1 al 7 para obtener el día de la semana: ");
        int dia = scn.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Ese día de la semana no existe.");
        }
        
        // Conclusión:
        // El programa usa `switch` de manera eficiente para asociar un número a un día.

        // ------------------------------ //
        // Ejercicio 5: Clasificación de notas
        // ------------------------------ //
        System.out.print("Ingrese la nota del examen (0-10): ");
        int nota = scn.nextInt();
        
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Error: Nota no válida.");
        }
        
        // Conclusión:
        // Se ha clasificado la nota correctamente y se previenen errores de entrada.

        // ------------------------------ //
        // Ejercicio 6: Validación de usuario y contraseña
        // ------------------------------ //
        scn.nextLine(); // Consumimos el salto de línea pendiente
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = scn.nextLine();

        System.out.print("Introduzca la contraseña: ");
        String contrasenya = scn.nextLine();

        if (nombre.equals("raul.albiol@thepower.education") && contrasenya.equals("1234")) {
            System.out.println("Bienvenido al sistema.");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }
        
        // Conclusión:
        // Se ha implementado un sistema básico de validación de credenciales.

        // ------------------------------ //
        // Ejercicio 7: Descuento en Tienda Don Pepa
        // ------------------------------ //
        System.out.print("Ingrese el monto de la compra: ");
        float montoCompra = scn.nextFloat();
        scn.nextLine(); // Consumimos el salto de línea

        System.out.print("Ingrese el día de la semana: ");
        String diaSemana = scn.nextLine();

        if (diaSemana.equalsIgnoreCase("martes") || diaSemana.equalsIgnoreCase("jueves")) {
            montoCompra *= 0.85f; // Aplicamos el 15% de descuento
            System.out.println("Has tenido un 15% de descuento.");
        } else {
            System.out.println("No has obtenido ningún descuento.");
        }

        System.out.println("El total a pagar es: " + montoCompra + " euros.");

        // Conclusión:
        // El programa calcula correctamente los descuentos según el día de la compra.
        /* La conclusión de este ejercicio es que si tengo una variable inicializada del sistema,
         (como en el caso de montoCompra) que, dependiendo de si yo entro o no entro en una condición 
         se puede cambiar.

 */

        scn.close(); // Cerramos el scanner
    }
}
