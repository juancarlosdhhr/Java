
/* Escribe un programa Java que declare una variable entera N y asígnale
un valor. A continuación escribe las instrucciones que realicen lo siguiente:
Incrementar N en 77.
Decrementarla en 3.
Duplicar su valor.
Si por ejemplo N = 1 la salida del programa será:

 */

package UNIDAD1EJERCICIOS;

public class Siete {
   
    public static void main(String[] args){
        int N = 5;

System.out.println("Valor inicial de N = " + N);
 N+=77;
 System.out.println("N + 77 = " + N);
 N-=3;
 System.out.println("N - 3 = " + N);
 N*=2;
 System.out.println("N * 2 = " + N);

    }

}
