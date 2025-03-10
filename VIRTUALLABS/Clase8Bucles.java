

 import java.util.Scanner;
 
 public class Clase8Bucles {
        public static void main(String[] args)  {
    


/*INICIO BUCLES

FOR -> Rangos (1-10), numero de repeticiones

WHILE -> No tenemos ni rango, ni numero de repeticiones concretas

DO - WHILE -> 1º Ejecuta y 2º Comprueba
 */


//Crea un bucle que imprima los números del 1 al 5


//EJEMPLO BUCLE CON WHILE:

//En los WHILE primero compruebay si me da true ejecut

 /* int i = 1;
while(i<=5){ //Condicion(true/false). Que se cumpla al principio pero que se deje de cumplir al final
        System.out.println(i);
        i++; // i = 1 + 1 

}
        }
} 
      */
 

//EJEMPLO BUCLE CON  DO WHILE:
//En Do While me meto primero al DO y despues compruebo si se cumple mi condicion
//Siempre hace la primera vuelta, y en caso de que se cumpla dará más vueltas o no

//El DO es "ejecutar. Ejecuta y después comprueba
//A diferencia del while que primero comprueba y después ejecuta

/* int i=7;

do {

        System.out.println(i); // 7
        i++; // 8

}while(i<=5);
        }
}

 */

// BUCLE FOR: 

//1º Hacemos la declaración de la variable dentro del parentesis
//El bucle FOR primero COMPRUEBA y luego EJECUTA

/* for(int i= 1; i<5; i++){
        System.out.print(i+ "-");// el "ln" es para que imprima los numeros en vertical, si le quitamos el ln los imprimirá en horizontal
}
        }
} */

/*  Escribir un programa donde se pida la edad de un usuario y se impriman los numeros
 del 1 hasta la edad del usuario.
 */
 /* Scanner scn= new Scanner (System.in);
int edad;
 System.out.println ("Introduzca por pantalla su edad");
 edad = scn.nextInt();

 for(int i=1;i<=edad;i++){
        System.out.println("Has cumplido " +i+ " años");
 
 }
}} */



//prima los numeros desde el 1 hasta el numero que introduzca el usuario, muestra solo los
//impares y separados por comas


     /*    Scanner scn = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.println("Introduzca un número:");
        int num = scn.nextInt();  // Leer el número que el usuario ingresa

        // Bucle para imprimir números impares hasta el número dado por el usuario
        for (int i = 1; i <= num; i += 2) {  // Comienza desde 1 y va sumando 2
            System.out.println(i);
        }

        scn.close();  // Cerrar el escáner al final
    }
}


 */
/* Crea un programa donde el usuario le vas a pedir un numero, ese numero va a ser la table de 
 * multiplicar quie vas a imprimir del 1-10.
 * 
 * Ejemplo:
 * 
 * 
 Num del usuario ->3

 3x1 = 3





 3x10 =30
 */




 /* Scanner scn = new Scanner(System.in);
 int num;

 System.out.println("Introduzca el nñumero de la tabla de multiplicar que quieras");
 num  = scn.nextInt();

 for(int i= 1; i <=10;i++){
        System.out.println(num+" X "+i+ " = " +(num*i));

 }}}

 */



 /* Crea un programa en el cual el usuario me va a introducir una contraseña.
  * En caso de que sea incorrecta repetir que te introduzca la contraseña

  */

 

  String contrasenia = "hola";
  String usuario;

  Scanner scn = new Scanner(System.in);

 

//Lo vamos a meter dentro de un DO porque necesitamos que mínimo una vez se ejecute

do{
        
        System.out.println("Introduzca su contraseña");
        usuario = scn.next();

//El siguientr while equivale a decir "Ejecuta de nuevo el bucle siempre que la contraseña este mal"

} while (!contrasenia.equals(usuario));

//Si la contraseña NO es correcta entonces se repetirá el bucle pidiendo de nuevo "Introduzca su contraseña"


System.out.println("Contraseña correcta");

        }}


        //¿CÓMO LO HARÍAMOS CON UN WHILE?

        System.out.println("Introduzca la contraseña");
        usuario = scn.next();

        while (!usuario.equals(contrasenia)){
                System.out.println("Error. Introduzca de nuevo la contraseña");
                usuario = scn.next();

        }

        System.out.println("Contraseña correcta");

}
}
