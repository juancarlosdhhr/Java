import java.util.Scanner;

public class Clase11Bucles {
    
}

//EJERCICIO BUCLES

 //Pide al usuario que indique un nivel de prioridad 0-5
 Scanner scn = new Scanner(System.in);
 int nivelPrioridad = -1; //ABC
 do{
     System.out.println("Introduzca nivel de prioridad. Niveles permitidos 0-5");
     if(scn.hasNextInt()){ //LLamo al scanner y compruebo si es un numero entero
         nivelPrioridad = scn.nextInt(); //Si es un numero entero actualizará el nivel de prioridad al nuevo valor
     }else{
         scn.next(); //En caso de que no sea un numero limpiamos el buffer
     }

 }while(nivelPrioridad < MIN_PRIORIDAD || nivelPrioridad > MAX_PRIORIDAD);


}
}

/* 
 * El método hasNextInt() se usa para comprobar si la siguiente entrada del usuario es un número entero.
 * Permite evitar errores al intentar leer datos no válidos, ya que verifica antes de leer.
 * 
 * Si el usuario introduce un valor que no es un número entero, el método devuelve `false`.
 * Para evitar un bucle infinito, es necesario limpiar el buffer de entrada con `scn.next()`
 * antes de volver a pedir el número.
 */

//Ejemplo:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número entero:");

        while (!scn.hasNextInt()) {  // Mientras la entrada no sea un número entero
            System.out.println("Eso no es un número válido. Inténtalo de nuevo:");
            scn.next();  // Limpia el buffer y evita un bucle infinito
        }

        num = scn.nextInt();  // Ahora sí, lee el número entero
        System.out.println("Número introducido: " + num);
        
        scn.close();  // Cierra el Scanner
    }
}









                                            //EJERCICIO 1


        /*
        * Escribe un programa que pida al usuario un número y sume todos los
        * números impares desde el 1 hasta ese número (inclusive)
        * */

        Scanner scn = new Scanner(System.in);
        int num;
        int sum = 0; // 0 + 1 + 3 + 5

        System.out.println("Introduzca un número");
        num = scn.nextInt();

        for(int i = 1;i<=num;i++){ // Otra forma es i = i + 2 (pondriamos en ese caso i+=2))
            if(i % 2 != 0){
                sum += i; // sum = sum + i
            }
        }

        System.out.println("El valor de la suma del 1 hasta "+num+" es: "+sum);


    }
}


                                            //EJERCICIO 2

 /*
        *****
        ****
        ***
        **
        *

        */

        for(int j = 1;j<=5;j++){ //j = 3 //
            for(int i = 5;i>=j;i--){  //i = 5 ; 5 -> 3 (3) //Este bucle (j) es el que marca cuantos asteriscos imprime por fila
                System.out.print("*");
            }
            System.out.println("");
        }





    }
}

🔍 Explicación paso a paso
1️⃣ Primer for (j) → Controla las FILAS

j empieza en 1 y llega hasta 5.
Cada j representa una fila del triángulo.
2️⃣ Segundo for (i) → Controla cuántos * se imprimen por fila

i empieza en 5 y va disminuyendo hasta que es igual a j.
Esto hace que en cada nueva fila se impriman menos *.
3️⃣ System.out.print("*") → Imprime un * sin salto de línea

Esto forma la fila con la cantidad correcta de asteriscos.
4️⃣ System.out.println(""); → Salto de línea

Esto hace que cada nueva fila se imprima en la siguiente línea.


//SERIE FIBONACCI                                        //EJERCICIO 3

//0,1,1,2,3,5,8,13,21

int num;
Scanner scn = new Scanner(System.in);
int a = 0, b = 1, siguiente;

System.out.println("¿Cuantos números quieres mostrar de la serie fibonacci?");
num = scn.nextInt();

for(int i = 1;i<=num;i++){
    System.out.print(a+", "); //Imprimir el valor actual

    siguiente = a + b;
    a = b;
    b = siguiente;

}
}
}
