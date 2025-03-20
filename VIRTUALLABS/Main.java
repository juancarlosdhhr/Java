public class Clase18Metodos {
    
    public static void main(String[] args) {


//METODOS / FUNCION -> Bloque de codigo que solo se ejecuta cuando es llamado

/* 
 Se pueden dar 4 casos:

1. Métodos sin parámetros y sin return
2. Métodos con parámetros y sin return
3.Métodos sin parámetros y con return
4.Métodos con parámetros y con return


//1º No se puede crear un método dentro de otro método. Tendremos que salirnos fuera.

//2º PARÁMETRO != VARIABLE




 */
holaMundo();
ComprobarPar();
}

                    // 1. Métodos sin parámetros y sin return

static void holaMundo() {
    System.out.println("Hola mundo");

static void comprobarPar(int n) {

if (n % 2 == 0) {

    System.out.println("El número es un número par");
} else {
    System.out.println("Es un número impar");

}

}

static boolean comprobarPar(int n){

    boolean par = false;
    if(n % 2 == 0)
}
}

}


                        // 2. Métodos con parámetros y sin return

Poner un ejempolo









//EJERCICIO 1

/* Escriba un metodo el cual tiene que calcular el total de una factura. 
 * La función debe recibir %IVA y la cantidad a aplicar.
 
 */


package ejercicio1;

import java.util.Scanner;

public class Main {


// ESTE VA A SER MI METODO "CALCULAR IVA":

    static double calcularIVA (double totalSinIVA, int porcentaje) {

double total;
total = totalSinIVA + ((totalSinIVA*porcentaje)/100);
return total;


}

public static void main(String[] args) {




Scanner scn = new Scanner(System.in);

double totalSinIVA;
int porcentaje;

System.out.println("Introduzca el valor total sin IVA");
totalSinIVA = scn.nextDouble();

System.out.println("Introduzca el valor del porcentaje");
porcentaje = scn.nextInt();


System.out.println (calcularIVA(totalSinIVA,porcentaje));

//Aqui simplemente se llama al metodo y se imprime por pantalla y no hace falta poner 
//return porque ya está puesto en el método CalcularIVA del principio


}}


/* Un método en Java es un bloque de código reutilizable que realiza una tarea específica.

En este caso, el método que creaste calcularIVA se encarga de calcular el total de una factura con IVA.

La gran ventaja de los métodos es que podemos llamarlos muchas veces sin tener que escribir el mismo
 código una y otra vez. 
 
 Tu código tiene dos partes principales:

1️⃣ El método calcularIVA → Hace el cálculo del total con IVA.
2️⃣ El método main → Pide los datos al usuario y llama a calcularIVA para obtener el resultado.
 
 
 
 */




import java.util.Scanner;

public class Main {



static int sumaValores (int []  array) {

int suma = 0;
for (int i = 0;i<array.length;i++ ) {
    suma+= array  [i];

}
    return suma;

}




public static void main(String[] args) {

//Crea un método que reciba por parámetros un array y que muestre el resultado 
//de la suma de todos sus números

Scanner scn = new Scanner (System.in);

int [] num = new int [10] ;

System.out.println("Introduzca 10 números");

for(int i = 0; i<num.length;i++) {
    System.out.println("Introduzca número " + (i+1) + ":");
    num[i] = scn.nextInt();


}

    System.out.println (sumaValores(num));


//Súmame los valores del array num (en este caso con el método sumaValores que creamos al principio )
//lo que hacemos es decirle que el parámetro en este caso será un array, el cual hemos 
//definido posteriormente y lo hemos llamado "num".

}

}



//EJERCICIO 3

public class Main {


static double areaCirculo(double r) {

    final float PI = 3.14f;
    double resultado;
    resultado = PI*r*r;
    return resultado;

}


static double volumenCilindro(double r, double h){

    double resultado;
    resultado = areaCirculo(r)*h;
    return resultado;

}



public static void main (String[] args) {

/* Escribir un método que calcule el área de un círculo y otra que calcule 
 *el vloumen de un cilindro usando el primer método.
Área del círculo = pi*r*2
Volumen del cilindro = Ab*h


 El objetivo de este ejercicio es ver que hay métodos que me sirven a su vez para calcular otros métodos.

 */

Scanner scn = new Scanner (System.in);
double r,h;

System.out.println ("Introduzca el valor del radio");

r = scn.nextDouble();

System.out.println("Introduzca la altura");

h = scn.nextDouble();

System.out.println("El area del circulo es: " +areaCirculo(r));
System.out.println("El volumen del cilindro es: " +volumenCilindro(r,h));




}

//OTRO EJERCICIO

public static void main (String [] args) {

//Método que convierta un número decimal a binario
//Método que convierta un número binario a decimal


}





//OTRO EJERCICIO


static int numeroAleatorio(int min, int max) {
    int num;
    num = (int) (Math.random() * (max - min + 1) + max);
    return num;

}

/* Cuando se genera un número aleatorio con Math.random(), este da un valor entre 0 (inclusive) 
y 1 (exclusivo). Es decir, el valor más pequeño que puede dar es 0 y el valor más grande es 0.999999...,
 pero nunca llega a ser 1. */


public static void main (String [] args) {

    /*  Crea un método en el cual va a recibir dos parámetros:
        -El mínimo
        -El máximo

        El método me va a devolver un número aleatorio entre el mínimo y el máximo
    
    
    */


    System.out.println(numeroAleatorio(5,11));



    }
    
    









}

