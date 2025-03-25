
    
//FACTORIAL RECURSIVO

package factorialRecursivo;

public class Recursividad {
    public static void main(String[] args) {

        int n = 5;
        //Guarda el resultado en una variable
        int resultado = factorialRecursivo(n);

        //Muestra el resultado
        System.out.println(resultado);

    }

    public static int factorialRecursivo(int numero) {

        int resultado;

        if (numero == 1) {
            //Se termina la recursión
            resultado = 1;
        } else {
            //Se llama asi misma la funcion, con el valor del numero menos 1
            resultado = numero * factorialRecursivo(numero - 1);
        }

        //Devolvemos el valor
        return resultado;

    }
}




//RECURSIVIDAD


package recursividad;

public class Main {


    /*static void recorrerArray(int [] n){
       for (int i = 0;i<n.length;i++){
           System.out.println(n[i]);
       }
   }*/


    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        metodoRecursivo(num, 0);

    }


    static void metodoRecursivo(int[] n, int indice) {
        //Caso base
        if (indice == (n.length - 1)) {
            System.out.println(n[indice]);
        } else {//Caso recursivo
            System.out.println(n[indice]);
            metodoRecursivo(n, indice + 1);
        }
    }

}


//SUMATORIO RECURSIVO

package sumatorioRecursivo;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        //guardamos el resultado en una variable
        int resultado = sumaRecursiva(n);
        //Mostramos el resultado
        System.out.println(resultado);

    }

    public static int sumaRecursiva(int numero) {

        int resultado;

        if (numero == 1) {
            //Se termina la recursion
            resultado = 1;
        } else {
            //Se llama a si misma la función con el parametro numero menos 1
            resultado = numero + sumaRecursiva(numero - 1);
        }

        //Devuelve el resultado
        return resultado;
    }
}

