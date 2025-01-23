
/* Ejercicio: Realiza un programa en Java que dadas dos variables a y b,
intercambie los valores de a y b.
 */


 //El intercambio requiere una tercera variable auxiliar para no perder el valor original de a.

package UNIDAD1EJERCICIOS;

public class Tres {
    
    public static void main (String [] args)  {

int a= 5, b=8, temp;

temp = a; // Guardamos el valor original de "a" en "temp"
a = b;    // Asignamos el valor de "b" a "a"
b = temp; // Recuperamos el valor original de "a" (almacenado en "temp") y se lo asignamos a "b"

// La variable auxiliar sirve como un "almacén temporal" para guardar el valor original antes de sobrescribirlo.
//Es como si necesitas un "tercer vaso" al intercambiar el contenido de dos vasos llenos de agua.
System.out.println("El valor de a ahora es: " + a + " y el de b es: " + b);

    }


}


