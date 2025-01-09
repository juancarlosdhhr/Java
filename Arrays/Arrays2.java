package Arrays;

public class Arrays2 {
    /* public static void main(String[] args) {
        int [] arr1 = new int [10]; // Crea un array con 10 elementos, todos inicializados a 0 por defecto
        int [] arr2 = {10,20,30,40,50};// Crea un array con valores específicos



        int a=10, b=7;

        a=b;

        //También se pueden igualar arrays, pero NO SE DEBE  HACER porque cuando lo hacemos
        //lo que teníamos en arr1 se pierde. Se queda ese espacio en memoria 
        //arr1 = arr2 

        System.out.println("el valor de a es: " +a );
        b=10;
        System.out.println("el valor de a es: " +a );

    }
}

 */

//ASIGNAR REFERENCIA DE ARRAY 2 A ARRAY 1
//"Hacer que dos arrays apunten al mismo espacio de memoria"
//"Compartir la referencia entre dos arrays"
//"Referenciar el mismo array con dos variables"
//"Vincular dos arrays para que apunten al mismo array"

 /* public static void main(String[] args) {
    int [] arr1 = {1, 2, 3, 4, 5}; 
    int [] arr2 = {10, 20, 30, 40, 50}; // Crea un array con valores específicos

    arr1 = arr2; // Asigna la referencia de arr2 a arr1

    System.out.println(arr1[0]);  // Imprime arr1[0], que es 10
    arr2[0] = 555;  // Cambia el valor de arr2[0] a 555
    System.out.println(arr2[0]);  // Imprime arr2[0], que es 555
    System.out.println(arr1[0]);  // Imprime arr1[0], que también es 555, porque arr1 ahora apunta a arr2

    // Nos dará el mismo resultado: 555
}
 */

//COPIAR ARRAYS USANDO EL BUCLE FOR

/* public static void main(String[] args) {
    // Se crean dos arrays de enteros con valores específicos
    int [] arr1 = {1, 2, 3, 4, 5}; 
    int [] arr2 = {10, 20, 30, 40, 50}; // Se crea otro array con valores específicos

    // Se recorre el primer array, arr1
    for (int i = 0; i < arr1.length; i++) {
        // Se asigna a arr1[i] el valor de arr2[i]
        arr1[i] = arr2[i];  // Se copia el valor de cada elemento de arr2 en arr1
    }

    // Se imprime el primer valor de arr1 (después de haberlo copiado de arr2)
    System.out.println(arr1[0]);  // Imprime el valor de arr1[0], que ahora es 10 (porque arr2[0] es 10)

    // Se cambia el valor de arr2[0] a 55
    arr2[0] = 55;  // Cambia el primer valor de arr2, ahora arr2[0] es 55

    // Se imprime nuevamente el primer valor de arr1
    System.out.println(arr1[0]);  // Imprime arr1[0], que sigue siendo 10 (porque arr1 es una copia de arr2, no una referencia)
}
 */


//OTRA FORMA CON EL BUCLE FOR:

for (int i=0;i<arr1.length;i++{
    if (arr1[i]==arr2[i]){
        correcto=true;

    }else {
        correcto=false;
    }

})




//METODO SYSTEM ARRAYCOPY (Alternativa para copiar los arrays sin usar el bucle FOR)

public static void main(String[] args) {
    // Se crean dos arrays de enteros con valores específicos
    int [] arr1 = {1, 2, 3, 4, 5}; 
    int [] arr2 = {10, 20, 30, 40, 50}; // Se crea otro array con valores específicos

//arraycopy(arr1, posicion desde la que quiero copiar que es por defecto 0, arr2, posicion a la que copiar, numero de elementos que quiero copiar(2)  )
//el arr1 es vector de origen, arr2 es el vector destino, la posicion 0, empiezo en la 0 y me copias 2 elementos
    System.arraycopy(arr1, 0, arr2, 0, 2); //Cópiame el array1 desde la posición 0 en el array2 desde la posición 0 y copiame 2 elementos.

//LOS 5 PARÁMETROS SON:
    //1º VECTOR ORIGEN
    //POSICIÓN INICIAL DESDE LA QUE COPIAR
    //VECTOR DESTINO
    //POSICIÓN EN LA QUE EMPEZAR A COPIAR
    //NÚMERO DE ELEMENTOS A COPIAR

//tambiñen se podría copiar el array completo así: 
// System.arraycopy(arr1, 0, arr2, 0, arr2.length);

    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    System.out.println(arr2[3]);
    System.out.println(arr2[4]);

}
}


