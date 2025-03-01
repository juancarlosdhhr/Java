
//¿Qué mostrará el siguiente código por pantalla?


package UNIDAD1EJERCICIOS;

public class Trece {
    public static void main (String[] args) {
        int num = 5;
        num += num - 1 * 4 + 1; // num += 2 -> num = num + 2 -> 5 + 2 = 7  
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 7 >> 1; 
        //7 * 4 = 28 
        //28 % 3 = 1 (ya que 28 / 3 = 9 y sobra 1) 
        // 1 * 7 = 7 ->7 >> 1 
        // desplazamos los bits de 7 una posición a la derecha: 7 en binario: 00000111 Desplazando a la derecha (>> 1): 00000011 (que es 3 en decimal)
        //4 % 3 = 1 (porque 4 / 3 = 1 y sobra 1)
        // Resultado = 1
        System.out.println(num);
        }
}
