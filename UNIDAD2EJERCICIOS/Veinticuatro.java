
/* P24. Realiza un programa que muestre por pantalla las tablas de multiplicar del 1 al 10 con el
siguiente formato:
Tabla del 10
*************
10 x 1 = 10
10 x 2 = 20
10 x 3 = 30
10 x 4 = 40
10 x 5 = 50
10 x 6 = 60
10 x 7 = 70
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100 */




package UNIDAD2EJERCICIOS;

public class Veinticuatro {
    public static void main(String[] args) {
        // Bucle para recorrer las tablas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("*************");

            // Bucle para calcular la multiplicación del número actual (i) del 1 al 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }
}


/* Explicación del código
1️⃣ Bucle externo (for (int i = 1; i <= 10; i++))

Este bucle se encarga de recorrer los números del 1 al 10 y generar cada tabla de multiplicar.
2️⃣ Muestra el título de la tabla

System.out.println("Tabla del " + i); → Muestra el número de la tabla.
System.out.println("*************"); → Imprime las líneas de asteriscos.
3️⃣ Bucle interno (for (int j = 1; j <= 10; j++))

Este segundo bucle recorre los multiplicadores del 1 al 10 para el número actual (i).
System.out.println(i + " x " + j + " = " + (i * j)); → Imprime cada resultado de la tabla.
4️⃣ System.out.println();

Se usa para agregar un espacio en blanco entre cada tabla. */