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

import java.util.Scanner;

public class Main {

    // Método para convertir un número decimal a binario
    static String decimalBinario(int numeroDecimal) {
        String binario = "";
        int resto;

        if (numeroDecimal == 0) {
            binario = "0";
        } else {
            while (numeroDecimal > 0) {
                resto = numeroDecimal % 2; // Obtiene el resto dividiendo por 2 (0 o 1)
                binario = resto + binario; // Agrega el resto al inicio de la cadena
                numeroDecimal = numeroDecimal / 2; // Divide entre 2
            }
        }

        return binario;
    }

    // Método para convertir un número binario (String) a decimal (int)
    static int binarioDecimal(String numeroBinario) {
        int decimal = 0;
        int multiplicador = 1; // Representa las potencias de 2 (1, 2, 4, 8, ...)

        // Recorremos el número binario desde el último dígito hasta el primero
        for (int i = numeroBinario.length() - 1; i >= 0; i--) { 
            char digito = numeroBinario.charAt(i); // Obtiene el carácter en la posición i

            if (digito == '1') { 
                decimal += multiplicador; // Suma la potencia de 2 correspondiente
            }

            multiplicador *= 2; // Multiplica por 2 en cada iteración
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce un número decimal para convertir a binario:");
        int decimal = scn.nextInt();
        System.out.println("Binario: " + decimalBinario(decimal));

        System.out.println("Introduce un número binario para convertir a decimal:");
        String binario = scn.next();
        System.out.println("Decimal: " + binarioDecimal(binario));

        scn.close();
    }
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
    






//OTRO EJERCICIO


/* Se pide crear una matriz 4x4 de numeros enteros que inicalmente esta vacia, nos piden
 * hacer un menu de opxiones.
 * 
 * 1. Crear una matriz, con numeros rellenados por el usuario (sin metodos)
 * 2. Sumar una fila que se pedirá al usuario (controlar que se elija una correcta)
 * 3.  Sumar los numeros de una columna que se pedirá al usuario (controlar que se elija una correcta)
 * 4.Sumar la diagonal principal
 * 5.Sumar la diagonal inversa
 * 6.La media de todos los valores de la matriz
 * 
 */


 import java.util.Scanner;

 public class Main {
     static int sumarFila(int[][] matriz, int fila) {
         int suma = 0;
         suma = 0;
         for (int i = 0; i < matriz[fila - 1].length; i++) {
             suma += matriz[fila][i];
         }
 
         return suma;
     }
 
     static int sumarColumna(int[][] matriz, int columna) {
         int suma = 0;
         for (int i = 0; i < matriz.length; i++) {
             suma += matriz[i][columna - 1];
         }
         return suma;
     }
 
     static int diagonalPrincipal(int[][] matriz) {
         int suma = 0;
         for (int i = 0; i < matriz.length; i++) {
             suma += matriz[i][i];
 
         }
         return suma;
     }
 
     static int diagonalInversa(int[][] matriz) {
         int suma = 0;
         for (int i = 0; i < matriz.length; i++) {
             for (int j = matriz.length - 1; j >= 0; j--) {
                 suma += matriz[i][j];
             }
         }
         return suma;
     }
 
     static float mediaMatriz(int[][] matriz) {
         int suma = 0;
         float media;
         int cont = 0;
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 suma += matriz[i][j];
                 cont++;
             }
         }
         media = (float) suma / cont;
         return media;
     }
 
     public static void main(String[] args) {
         /*
          * Se pide crear una matriz 4x4 de números enteros que inicialmente esta vacía,
          * nos piden hacer un menú de opciones
          * - 1. Crear una matriz, con números rellenados por el usuario (sin métodos)
          * - 2. Sumar una fila que se pedirá al usuario (controlar que se elija una correcta)
          * - 3. Sumar los números de una columna que se pedirá al usuario(controlar qeu se elija una correcta)
          * - 4. Sumar la diagonal principal
          * - 5. Sumar la diagonal inversa
          * - 6. La media de todos los valores de la matriz
          * */
 
         int[][] matriz = new int[4][4];
         Scanner scn = new Scanner(System.in);
         int opcion;
         int fila;
         int columna;
 
         System.out.println("Introduzca una de las siguientes opciones:");
         System.out.println("1. Crear una matriz, con números rellenados por el usuario");
         System.out.println("2. Sumar una fila que se pedirá al usuario (controlar que se elija una correcta)");
         System.out.println("3. Sumar los números de una columna que se pedirá al usuario(controlar que se elija una correcta)");
         System.out.println("4. Sumar la diagonal principal");
         System.out.println("5. Sumar la diagonal inversa");
         System.out.println("6. La media de todos los valores de la matriz");
         opcion = scn.nextInt();
 
         switch (opcion) {
             case 1:
                 System.out.println("Introduzca los números en la matriz");
                 for (int i = 0; i < matriz.length; i++) {
                     for (int j = 0; j < matriz[i].length; j++) {
                         System.out.println("Introduzca el valor para [" + i + "][" + j + "]");
                         matriz[i][j] = scn.nextInt();
                     }
                 }
                 break;
             case 2:
                 System.out.println("Introduza la fila");
                 fila = scn.nextInt();
                 System.out.println(sumarFila(matriz,fila));
                 break;
             case 3:
                 System.out.println("Introduza la columna");
                 columna = scn.nextInt();
                 System.out.println(sumarColumna(matriz,columna));
                 break;
             case 4:
                 System.out.println(diagonalPrincipal(matriz));
                 break;
             case 5:
                 System.out.println(diagonalInversa(matriz));
                 break;
             case 6:
                 System.out.println(mediaMatriz(matriz));
                 break;
             default:
                 System.out.println("No existe esa opción");
         }
 
 
     }
 }




