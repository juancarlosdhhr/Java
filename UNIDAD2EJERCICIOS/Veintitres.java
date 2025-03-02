
/* P23. Realiza un programa que muestre por pantalla los 5 prImeros números pares */

package UNIDAD2EJERCICIOS;

public class Veintitres {
    public static void main(String[] args) {
        int count = 0; // Contador de números pares
        int num = 2;   // Primer número par

        while (count < 5) { // Se ejecuta hasta encontrar 5 pares
            System.out.println(num);
            num += 2; // Incrementa en 2 para obtener el siguiente número par
            count++;  // Aumenta el contador
        }
    }
}


/* Explicación paso a paso
1️⃣ count = 0; → Creamos un contador que empieza en 0. Este nos dirá cuántos números pares hemos mostrado.

2️⃣ num = 2; → Como el primer número par es 2, lo guardamos en la variable num.

3️⃣ while (count < 5) → Mientras hayamos mostrado menos de 5 números pares, repetimos el bloque de código dentro del while.

4️⃣ System.out.println(num); → Mostramos el número par actual.

5️⃣ num += 2; → Sumamos 2 al número para obtener el siguiente número par.

Ejemplo: Si num vale 2, en la siguiente iteración valdrá 4, luego 6, luego 8...
6️⃣ count++; → Aumentamos el contador para saber que ya imprimimos un número par.

7️⃣ Cuando el contador llegue a 5, el while se detiene.

 */