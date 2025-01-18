package Actividad3;
import java.util.Scanner;

public class EjemplosArrays{


    public static void main(String[] args) {
        // Declaración y asignación de valores al array

/* int [] nuss = new int[3];//La variable nuss constará de muchos numeros entero. Nuss ya no va a ser un entero sino una dirección de memoria, pero para que exista primero tengo que instanciarlo (es decir, )

int [] nuss = new int[3][3]; //Esto sería una matriz de 3 x 3

int exploracion[] = new int[10]; //Esta es otra forma de declarar un array

 */
//Por ejemplo:
int [] nuss = new int[3];
nuss[0] = 1; //En la posición 0 ponme un 1
nuss [1] = 2; //En la posición 1 ponme un 2
nuss[2] = 3; //En la posición 2 ponme un 3
nuss[3] = 7; //En la posición 3 ponme un 7


// Intento de asignar fuera del rango del array eliminado
    // nuss[3] = 7; // Esto generaría un error: ArrayIndexOutOfBoundsException

System.out.println(nuss[2]);

}}



//Otra  forma de hacerlo;

public static void main(String[] args) {
    // Declaración y asignación de valores al array

//Por ejemplo:
int [] nuss;
nuss = new int[3];

int [] sintoma = {0,0,0,0,0}; //Aquí además de definir el numero de variables les estamos definiendo un valor a cada una)
int [] exploracion = new int [5];//ESto es equivalente al de arriba pero sin definir los valores

for (int i=0;i<5;i++){
    exploracion[i] = 0;
}

System.out.println(sintoma[2]);

}}

