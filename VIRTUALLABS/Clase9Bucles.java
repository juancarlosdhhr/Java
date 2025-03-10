import java.util.Scanner;

public class Clase9Bucles {
    

 public static void main(String[] args) {


/*
                                        EJERCICIO 11. 
 
 //Tabla de multiplicar del 1 al 10 de un nº dado por teclado. Forzar a que el nº introducido
 // esté entre el 1 y el 20, si no el programa no avanza.


  */

  //Forzar a que el nÃºmero sea entre 1 y 20

  int num;
  Scanner scn = new Scanner(System.in);

  System.out.println("Introduzca un nÃºmero entre 1 y 20");
  num = scn.nextInt();

  while (num <= 1 || num >= 20) { //LA CONDICION ES PARA QUE SE REPITA
      System.out.println("Error. Tiene que ser un numero entre 1 y 20");
      num = scn.nextInt();
  }

  for (int i = 1; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + i * num);
  }

}
}

                                        //EJERCICIO 12:
        // Crea un programa en el cual el usuario me va a introducir una contraseÃ±a
        //En caso de que sea incorrecta repetir que te introduzca la contraseÃ±a

        // ==, !=, .equals(), equalsIgnoreCase ->
        //mayor = MAYOR -> FALSE (.equals)
        // mayor = MAYOR -> TRUE (.equalsIgnoreCase)

        String contrasenia = "hola";
        String usuario;
        Scanner scn = new Scanner(System.in);

        /*do{
        System.out.println("Introduzca su contraseÃ±a");
        usuario = scn.next();
        }while(!contrasenia.equals(usuario));

        System.out.println("ContraseÃ±a correcta");*/

        System.out.println("Introduzca la contraseÃ±a");
        usuario = scn.next();

        while (!usuario.equals(contrasenia)) {
            System.out.println("Error. Introduzca de nuevo la contraseÃ±a");
            usuario = scn.next();
        }

        System.out.println("ContraseÃ±a correcta");

    }
}



                            //EJERCICIO 13: --> De momento no lo podemos hacer porque aun no hemos visto
                            //numeros aleatorios
                            
                            Como creamos en número Random
        //Número random es un número entre 0 y 1 (no inclusive)
        // 1-100
        /*
         * Se genera un nº secreto aleatorio (1,100). El usuario introduce un
         * nº por teclado. Hay 10 intentos para adivinar el nº secreto,
         * indicar si el nº introducido es mayor o menor
         * */


         int n = (int) ((Math.random() * 100) + 1);
         int intentos = 10;
         int intento_actual = 1;
         boolean adivinado = false;
         int num_usuario;
         Scanner scn = new Scanner(System.in);
 
         System.out.println("Bienvenido al juego de adivinar el número secreto");
         System.out.println("El número secreto se encuentra entre 1 y 100");
 
         //n = 10
         while (intento_actual <= intentos && !adivinado) { //adivinado == true
             System.out.println("Intento: " + intento_actual + ": Introduzca un número");
             num_usuario = scn.nextInt(); //10
 
             if (num_usuario == n) {
                 adivinado = true;
             } else if (num_usuario < n) {
                 System.out.println("El numero secreto es mayor");
             } else {
                 System.out.println("El número secreto es menor");
             }
             intento_actual++;
 
         }
 
         if (adivinado) {
             System.out.println("¡Felicidades has adivinado el número!");
         } else {
             System.out.println("Lo siento no has adivinado el número");
         }
 
 
     }
 }
  

                                    /* EJERCICIO 14: */

/* Sumar los números pares por un lado y los números impares por otro entre 1 y 99. Mostrar el
 *resultado total de cada suma.
 */

 //SUMATORIO -> Es un tipo de variable la cual, siempre la vamos a inicializar en 0 y se encargara de 
 //guardar la suma de x numeros

 int sumatorioImpares = 0;
 int sumatorioPares = 0;


 //Aquí nos muestra los impares porque inicializamos la i en 1 
 for (int i = 1; i <= 99; i += 2) { //i = i + 2 - IMPARES
     sumatorioImpares += i;
 }
//Aquí nos muestra los pares porque inicializamos la i en 0 
 for (int i = 0; i <= 99; i += 2) {
     sumatorioPares += i;
 }

 System.out.println("La suma de todos los impares es: " + sumatorioImpares);
 System.out.println("La suma de todos los pares es: " + sumatorioPares);

}
}


                                    /* EJERCICIO 15: */

//Pedir numeros mostrar su cuadrado hasta que introduzca un numero negativo
       
    //FOR O WHILE

        int num;
        int resultado;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Introduzca un numero");
            num = scn.nextInt();
            if (num >= 0) {
                resultado = num * num;
                System.out.println(resultado);
            }

//Si el numero es menor a 0 entraria en el while y como tampoco se cumple no se va a volver a repetir

        } while (num >= 0);

    }
}


                                    /* EJERCICIO 16: */

 //Leer un numero, indicar si es positivo o negativo y cuando sea 0 se pare el bucle

 int num;
 Scanner scn = new Scanner(System.in);

 do {
     System.out.println("Introduzca un numero");
     num = scn.nextInt(); //0

     if (num < 0) { //FALSE
         System.out.println("Numero negativo");
     } else if (num > 0) { //FALSE
         System.out.println("Numero positivo");
     }

     //Mientras que el numero sea distinto de 0 se va a repetir el numero
 } while (num != 0);

 System.out.println("Fin del programa");

}
}


                                    /* EJERCICIO 17 */

 //Pedir numeros hasta introducir un 0 hacer la suma entre los numeros

 int num;
 int suma = 0;
 Scanner scn = new Scanner(System.in);

 do {
     System.out.println("Introduzca un numero");
     num = scn.nextInt(); //0
     suma += num; // suma = 45
 } while (num != 0); //FALSE

 System.out.println("El resultado de la suma final es: " + suma);

}
}


                                    /* EJERCICIO 18 */

 //Introduza numero hasta introducir un 0 y mostrar la media de los numeros
        //Contador -> una variable, generalmente inicilizada en 0

        int num;
        int suma = 0;
        int cont = 0;
        float media;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Introduzca un nÃºmero");
            num = scn.nextInt();
            if (num < 0) {
                suma += num; //suma = 10 + 20
                cont++; // cont++ es lo mismo que cont = cont + 1
            }
        } while (num < 0);

        media = (float) suma / cont;

        System.out.println("La media de todos los numeros es: " + media);

    }
}


                                    /* EJERCICIO 19: */

 /*
        * Escribir todos los números del 100 al 0 de 2 en 2.
        * Adicionalmente mostrar un contador total de los que terminan en 8.
        * */

        //78 / 10 = 7,8
        //78 % 10 = 8
        //68 % 10 = 8

        int contador = 0;

        for(int i = 100;i>=0;i-=2){//i = i - 2
            System.out.println(i);
            if(i % 10 == 8){
                contador++; //
            }
        }

        System.out.println("La cantidad de números que acaban en 8 es: "+contador);

    }
}


                                    /* EJERCICIO 20: */

Scanner scanner = new Scanner(System.in);
int suma = 0;

for (int i = 0; i < 5; i++) {
    System.out.print("Introduzca número: ");
    int numero = scanner.nextInt();
    suma += numero;
}

System.out.println("La suma total es: " + suma);
}
}


                                    /* EJERCICIO 21 */

/* 21 Realizar un programa que nos pida un número n, y nos diga cuantos
        números hay entre 1 y n que son primos
        Un número es primo cuando es divisible dos veces (% == 0, 2 veces) */
        

        int n;
        Scanner scn = new Scanner(System.in);
        int contadorPrimos = 0;

        System.out.println("Introduzca el valor de la variable n");
        n = scn.nextInt(); // 13

        for (int i = 1; i <= n; i++) { // 1 .. 14

            boolean esPrimo = true;

            if (i < 2) {
                esPrimo = false;
            } else { // Números a partir del 2
                for (int j = 2; j < i; j++) { // j<5 FALSE
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
            }

            if (esPrimo) { //true
                contadorPrimos++;
            }


        }


    }
}


                                        /* EJERCICIO 22 */

//n = 5
        /*
        *****
        *****
        *****
        *****
        *****
        BUCLES ANIDADOS -> Bucles dentro de bucles
         */

         int n;
         Scanner scn = new Scanner(System.in);
 
         System.out.println("Introduzca el valor de n");
         n = scn.nextInt();
 
         for (int j = 1; j <= n; j++) {
             for (int i = 1; i <= n; i++) {
                 System.out.print("*");
             }
             System.out.print("\n"); //SALTO DE LINEA AL FINAL DE LA FILA
         }
     }
 }

 


                                        /* EJERCICIO 23 */
                                //PARA TRABAJAR LOS BUCLES ANIDADOS//

/* Dibuja un cuadrado de n elementos de lado utilizando *. Los n elementos los introduce el usuario 
por pantalla.

  //n = 5
        /*
        *****
        *****
        *****
        *****
        *****
        BUCLES ANIDADOS -> Bucles dentro de bucles
         */

         int n;
         Scanner scn = new Scanner(System.in);
 
         System.out.println("Introduzca el valor de n");
         n = scn.nextInt();
 
         for (int j = 1; j <= n; j++) { //Controla las filas
             for (int i = 1; i <= n; i++) { //Controla las columnas
                 System.out.print("*");
             }
             System.out.print("\n"); //SALTO DE LINEA AL FINAL DE LA FILA
 
         }
     }
 }
 