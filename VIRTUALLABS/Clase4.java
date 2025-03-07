port java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

// Clase 3: Explicación de condicionales (if, else if, else)
public class Clase3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Ejercicio 1: Determinar si una persona es mayor o menor de edad
        System.out.print("Ingrese su edad: ");
        int edad = scn.nextInt();
        
        if (edad >= 18) { // Si la edad es 18 o más, es mayor de edad
            System.out.println("El usuario es mayor de edad.");
        } else if (edad >= 0 && edad < 18) { // Si la edad está entre 0 y 17, es menor de edad
            System.out.println("El usuario es menor de edad.");
        } else { // Si la edad es negativa, mostramos un error
            System.out.println("Error: La edad ingresada no es válida.");
        }
        
        // Ejercicio 2: Determinar si un número es positivo, negativo o cero, y si es par o impar
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
        
        // Ejercicio 3: Comparación de Strings con equals y equalsIgnoreCase
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
        
        scn.close();
    }
}

// Clase 4: Explicación de switch
class Clase4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Ejercicio 1: Obtener el día de la semana a partir de un número
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
        
        // Ejercicio 2: Clasificación de notas
        System.out.print("Ingrese la nota del examen (0-10): ");
        int nota = scn.nextInt();
        
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7: case 8:
                System.out.println("Notable");
                break;
            case 9: case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Error: Nota no válida.");
        }
        
        // Ejercicio 3: Ordenar tres números de mayor a menor
        System.out.println("Ingrese tres números diferentes:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        
        if (num1 >= num2 && num2 >= num3) {
            System.out.println("Orden: " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println("Orden: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println("Orden: " + num2 + ", " + num1 + ", " + num3);
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println("Orden: " + num2 + ", " + num3 + ", " + num1);
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println("Orden: " + num3 + ", " + num1 + ", " + num2);
        } else {
            System.out.println("Orden: " + num3 + ", " + num2 + ", " + num1);
        }
        
        // Ejercicio 4: Contar cifras de un número
        System.out.print("Ingrese un número entre 0 y 99999: ");
        int numero = scn.nextInt();
        
        if (numero >= 0 && numero <= 99999) {
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (numero < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else if (numero < 10000) {
                System.out.println("El número tiene 4 cifras.");
            } else {
                System.out.println("El número tiene 5 cifras.");
            }
        } else {
            System.out.println("Error: Número fuera de rango.");
        }
        
        scn.close();
    }
}
