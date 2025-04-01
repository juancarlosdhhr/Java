public class Excepciones {
    
}

/*
                =====================================================
                                    EXCEPCIONES EN JAVA
                =====================================================

Las excepciones en Java son objetos que provienen de una jerarquía de clases.
La clase base es `Throwable`, y de ella derivan `Exception` y `Error`.
*/

// ===================================================
// Ejemplo 1: Acceso a un índice fuera del rango
// ===================================================

 package ejercicio11121314;

public class Main {
    public static void main(String[] args) {

        double [] v = new double[15];
        acceso_por_indice(v, 16);

    }

    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }

        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}



// ===================================================
// Ejemplo 2: Excepción personalizada por edad
// ===================================================


package excepcionconthrow;

public class Main {

    public static void main(String[] args) {

        //Lanzar excepción personalizada si la edad es menor a 18
        try{
            validarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    static void validarEdad(int edad){
        if(edad<18){
            //Coche c1 = new Coche("16535GHJ");
            //coche.arrancar();
            throw new IllegalArgumentException("Debe ser mayor a 18 años");
        }
        System.out.println("Acceso permitido");
    }

}


// ===================================================
// Ejemplo 3: Excepción personalizada para índices fuera de rango
// ===================================================


package excepcionesconArrays;

public class IndiceFueraDeRangoException extends Exception{
    public IndiceFueraDeRangoException(String mensaje){
        super(mensaje);
    }

}


// ===================================================
// Ejemplo 4: Manejo de excepciones en arrays
// ===================================================


package excepcionesconArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Pida al usuario ingresar el tamaño de un array
        * Pida al usuario ingresar los elementos de un array
        * Pida al usuario ingresar un indice para acceder a un elemento del array
        * Si el indice esta fuera de rango, lanzar una excepción personalizada (throws)
        * Manejar la exepción en el main, mostrando un mensaje de error
        * */

        Scanner scn = new Scanner(System.in);
        int tamanio, indice, valor;

        try{
            System.out.println("Intrese el tamaño del array");
            tamanio = scn.nextInt();

            int [] num = new int[tamanio];

            System.out.println("Ingrese los elementos del array");
            for (int i = 0;i<tamanio;i++){
                System.out.println("Elemento ["+i+"]: ");
                num[i] = scn.nextInt();
            }

            System.out.println("Ingrese el indice que desea consultar");
            indice = scn.nextInt();

            valor = obtenerElemento(num,indice);
            System.out.println("El valor en el indice "+indice+" es: "+valor);
        }catch (IndiceFueraDeRangoException e){
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrión un error inesperado "+e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }

    static int obtenerElemento(int [] array, int indice) throws IndiceFueraDeRangoException{
        if(indice < 0 || indice >= array.length){
            throw new IndiceFueraDeRangoException("Indice: "+indice+" fuera de rango. Debe estar entre 0 y "+(array.length -1));
        }
        return array[indice];
    }
}


// ===================================================
// Ejemplo 5: Excepción personalizada con `throws`
// ===================================================


package excepcionesconthrows2;

public class CustomException extends Exception{
    public CustomException(String mensaje){
        super(mensaje);//getMessage();
    }
}

package excepcionesconthrows2;

public class Main {
    public static void main(String[] args) {

        //Excepción Comprobada -> Son excepciones que el compilador Java obliga a manajear con try-catch o throws
        //IOException, FileNotFoundException
        //Excepción No Comprobada ->Son excepciones que el compilador NO ogliga a manejar
        //ArithmeticException,  ArrayIndexOutOfBoundsException, NullPointerException

        try {
            validar(20); //Llamamos al método validar() con 0 provocará la excepción
        } catch (CustomException e) {
            System.out.println("Error: "+e.getMessage()); //Capturar la exceción y mostrar el mensaje
        }finally {
            System.out.println("Fin del programa");
        }

    }

    static void validar(int num) throws CustomException{
        if(num<=0){
            throw new CustomException("El número debe ser mayor a 0");
        }
    }
}






package excepcionespdfDAW.ejercicio8;

public class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("Número negativo no permitido");
    }
    public NumeroNegativoException(String mensaje){
        super(mensaje);
    }
}

package excepcionespdfDAW;

public class ejercicio11121314 {
    public static void main(String[] args) {

        double[] v = new double[15];
        acceso_por_indice(v, 16);

    }

    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j < v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }

        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}



// ===================================================
// Ejemplo 6: Manejo de excepciones con `finally`
// ===================================================


package excepcionespdfDAW;

public class ejercicio15 {
    public static void main(String[] args) {

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }

    }

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1; //valor = 1
            valor = valor + Integer.parseInt("42");  //43
            valor = valor + 1; //44
            System.out.println("Valor al final del try : " + valor); //44
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
        } finally {
            valor = valor + 1; //45
            System.out.println("Valor al final de finally : " + valor);
        }

        valor = valor + 1; //46
        System.out.println("Valor antes del return : " + valor); //46
        return valor;

    }
}

package excepcionespdfDAW;

public class ejercicio16 {
    public static void main(String[] args) {

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }

    }

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1; //valor = 1
            valor = valor + Integer.parseInt("W");  //1
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42"); //43
            System.out.println("Valor al final del catch : " + valor); //43
        } finally {
            valor = valor + 1;  //44
            System.out.println("Valor al final de finally : " + valor); //44
        }

        valor = valor + 1; //45
        System.out.println("Valor antes del return : " + valor); //45
        return valor; //45

    }
}

package excepcionespdfDAW;

public class ejercicio17 {
    public static void main(String[] args) {

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }

    }

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
            throw e;
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally : " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;

    }
}


// ===================================================
// Ejemplo 7: Excepción al acceder a un carácter en una cadena
// ===================================================


package excepcionespdfDAW;

public class ejercicio6 {

    static char caracterEn(String texto, int indice) throws Exception {
        if(indice >= 0 && indice < texto.length()){
            return texto.charAt(indice);
        }else{
            throw new Exception("Indice fuera de rango");
        }
    }
}

package excepcionespdfDAW;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String lect_teclado;
        char resultado;
        try {
            System.out.println("Introduzca la cadena de caracteres");
            lect_teclado = scn.nextLine();

            resultado = caracterEn(lect_teclado, 7);

            System.out.println("El caracter de la posición 7 es: " + resultado);

        } catch (Exception e) {
            System.out.println("Has intentado acceder a una posición fuera del rango de la cadena de caracteres");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }

    }

    static char caracterEn(String texto, int indice) throws Exception {
        if (indice >= 0 && indice < texto.length()) {
            return texto.charAt(indice);
        } else {
            throw new Exception("Indice fuera de rango");
        }
    }
}

/* Las excepciones de RunTimeException, no son controladas

No es obligatorio el uso del try-catch ni del throws

IndexOutOfBoundsException
 */

 package excepciontrycatch;

public class Main {
    public static void main(String[] args) {
        //¿Qué es una excepción? -> Evento anómalo que puede ocurrir
        //durante la ejecución de un programa y que alteral el flujo
        //normal del mismo

        //Try***-catch**-finally(v)

        try { //El código en el cual voy a comprobar si hay excepción
            int num = 10 / 0;
        } catch (ArithmeticException e) { //En el catch entraré si salta la excepción que indico
            System.out.println("Excepción capturada: "+e);
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Pila de ejecución: ");
            e.printStackTrace(); //Muestra el rastreo de la pila de ejecución
        }
        finally { //Parte del código que se ejecuta indpendientemente que haya excepción o no
            System.out.println("Adios");
        }

    }
}

package expecionesconthrows;

public class Main {
    public static void main(String[] args) {

        try {

            lanzarError();

        } catch (MiException e) {
            System.out.println("Excepción personalizada capturada: " + e.getMessage());
        }


    }

    static void lanzarError() throws MiException {
        throw new MiException("Esto es un error personalizado");
    }

}

package expecionesconthrows;

public class MiException extends Exception{
    public MiException(String mensaje){
        super(mensaje);
    }
}


