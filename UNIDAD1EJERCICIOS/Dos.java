
/* Ejercicio: Escribe un programa Java que realice lo siguiente: 
Declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y
asigna a cada una un valor.
A continuación muestra por pantalla:
El valor de cada variable.
La suma de N + A
La diferencia de A - N
El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
mostrar por pantalla:
 */

package UNIDAD1EJERCICIOS;

public class Dos {
    

public static void main (String [] args) {

int N = 6;
double A = 2.77;
char C = 'h';

System.out.println("Variable N = " + N);
System.out.println("Variable A = " + A);
System.out.println("Variable C = " + C);
System.out.println(N + " + " + A + "=" + (N+A));
System.out.println(A + " - " + N + "=" + (A-N));  
System.out.println("Valor numérico del carácter " + C + " = " + (int)C); // Aquí ocurre lo interesante: (int)C convierte el carácter C a su valor numérico.


}


}
