/* P25. Realiza un programa que transforme números en formato decimal a números en formato
romano (número < 4000). */

package UNIDAD2EJERCICIOS;

import java.util.Scanner;

public class Veinticinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario un número entero menor de 4000
        System.out.print("Introduce un número menor de 4000: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0 || numero >= 4000) {
            System.out.println("Número fuera de rango. Introduce un número entre 1 y 3999.");
        } else {
            // Convertir y mostrar el número en formato romano
            System.out.println("Número en romano: " + convertirARomano(numero));
        }
        
        scanner.close();
    }

    // Método para convertir un número decimal a romano
    public static String convertirARomano(int num) {
        // Arrays con valores decimales y sus correspondientes símbolos romanos
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                resultado.append(romanos[i]); // Agregar el símbolo romano
                num -= valores[i]; // Restar el valor correspondiente
            }
        }
        
        return resultado.toString();
    }
}


/* Explicación del código
1️⃣ Solicitar un número al usuario

Scanner scanner = new Scanner(System.in); → Permite leer la entrada del usuario.
int numero = scanner.nextInt(); → Guarda el número ingresado.
2️⃣ Verificar que el número esté entre 1 y 3999

Si no lo está, muestra un mensaje de error.
3️⃣ Convertir el número a romano

Se usa un método llamado convertirARomano(int num).
Se recorren los valores decimales en un array (valores[]), y si el número es mayor o igual al 
alor actual, se le resta ese valor y se agrega su símbolo romano (romanos[]) al resultado. */