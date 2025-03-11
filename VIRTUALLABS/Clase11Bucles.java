public class Clase11Bucles {
    
}

//EJERCICIO BUCLES

 //Pide al usuario que indique un nivel de prioridad 0-5
 Scanner scn = new Scanner(System.in);
 int nivelPrioridad = -1; //ABC
 do{
     System.out.println("Introduzca nivel de prioridad. Niveles permitidos 0-5");
     if(scn.hasNextInt()){
         nivelPrioridad = scn.nextInt();
     }else{
         scn.next();
     }

 }while(nivelPrioridad < MIN_PRIORIDAD || nivelPrioridad > MAX_PRIORIDAD);




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

        for(int i = 1;i<=num;i++){ //i = i + 2
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

        for(int j = 1;j<=5;j++){ //j = 3
            for(int i = 5;i>=j;i--){  //i = 5 ; 5 -> 3 (3)
                System.out.print("*");
            }
            System.out.println("");
        }





    }
}



//EJERCICIO 3

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
