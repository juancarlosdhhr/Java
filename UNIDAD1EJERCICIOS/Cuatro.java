
/* Escribe un programa Java que realice lo siguiente: declarar dos
variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un
valor. A continuación muestra por pantalla:
El valor de cada variable.
La suma X + Y
La diferencia X – Y
El producto X * Y
El cociente X / Y
El resto X % Y
La suma N + M
La diferencia N – M
El producto N * M
El cociente N / M
El resto N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables
Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el
valor 4.7 se debe mostrar por pantalla:
 */







package UNIDAD1EJERCICIOS;

public class Cuatro {
    
    public static void main (String [] args) {
        int X = 1, Y = 2;
        double M = 3.2, N = 4.7;

        System.out.println("Variable X = " + X);
        System.out.println("Variable Y = " + Y);
        System.out.println("Variable M = " + M);
        System.out.println("Variable N = " + N);

        System.out.println(X + "+" + Y + "=" + (X+Y));
        System.out.println(X + "-" + Y + "=" + (X-Y));
        System.out.println(X + "*" + Y + "=" + (X*Y));
        System.out.println(X + "/" + Y + "=" + (X/Y));
        System.out.println(X + "%" + Y + "=" + (X%Y));
        System.out.println(N + "+" + M + "=" + (N+M));
        System.out.println(N + "-" + M + "=" + (N-M));
        System.out.println(N + "*" + M + "=" + (N*M));
        System.out.println(N + "/" + M + "=" + (N/M));
        System.out.println(N + "%" + M + "=" + (N%M));
        System.out.println(X + "+" + N + "=" + (X+N));
        System.out.println(Y + "/" + M + "=" + (Y/M));
        System.out.println(Y + "%" + M + "=" + (Y%M));
        System.out.println("Variable X" + "=" + X + "el doble es: " + (2*X) );
        System.out.println("Variable Y" + "=" + Y + "el doble es: " + (2*Y) );
        System.out.println("Variable M" + "=" + M + "el doble es: " + (2*M) );
        System.out.println("Variable N" + "=" + N + "el doble es: " + (2*N) );
        System.out.println(X + "+" + Y + "+" + M + "+" + N + "=" + (X+Y+M+N));
        System.out.println(X + "*" + Y + "*" + M + "*" + N + "=" + (X*Y*M*N));




        

    }


}
