import java.util.Scanner;

public class Clase17ArraysyMatrices {
    
}

public static void main(String[] args) {
    //Hay que leer la altura de N número de personas, y calcular la media.
    //Calcular cuantas personas tienen la altura superior a la media
    //Y calcular cuantas personas tienen la altura inferior a la media.

    int n;
    double sumaAlturas = 0.0;
    double media;
    int contMas = 0, contMenos = 0;
    Scanner scn = new Scanner(System.in);

    System.out.println("Introduzca cuantas personas quieres tomar la altura");
    n = scn.nextInt();

    double [] alturas = new double[n]; 
//Estamos declarando un array llamado alturas que almacenará valores decimales (double).
//Estamos creando el array con n posiciones.

// n es una variable que indica cuántos espacios tendrá el array.
//Cada posición del array se inicializa con 0.0 por defecto (porque double representa números decimales).
    System.out.println("Introduzca las alturas");
    for(int i = 0;i<alturas.length;i++){
        System.out.print("Altura: "+(i+1)+": ");
        alturas[i] = scn.nextDouble();
        sumaAlturas += alturas[i]; //sumaAlturas = sumaAlturas + alturas[i]
    }

    media = sumaAlturas / n;

    for(int i = 0;i<alturas.length;i++){
        if(alturas[i] > media){
            contMas++;
        }else if(alturas[i]<media){
            contMenos++;
        }
    }

    System.out.println("Número de personas: "+n);
    System.out.println("Personas con estaturas superior a la media: "+contMas);
    System.out.println("Personas con estaturas inferior a la media: "+contMenos);

}
}
                                        //EJERCICIO 4

 //Pide 10 números al usuario y guardarlos en un array
        //Una vez guardados recorre el array de números y los que sean números
        //pares, metelos en un nuevo array de números pares.
        //Al final del programa recorre solo el array de números pares
        Scanner scn = new Scanner(System.in);
        int [] numeros = new int[10];
        int contadorPares = 0;

        for(int i = 0;i< numeros.length;i++){
            numeros[i] = scn.nextInt(); //Vamos a ir metiendo todos los numeros que me va a introducir el usuario en el array numeros
            if(numeros[i] % 2 == 0){
                contadorPares++;
            }
        }

        int [] pares = new int[contadorPares]; //Declaramos este array una vez ya sabemos el valor de contadorPares++
        int indice = 0;

        for(int i = 0;i<numeros.length;i++){
            if(numeros[i] % 2 == 0){
                pares[indice] = numeros[i];
                indice++;
            }
        }

        for(int i = 0;i<pares.length;i++){
            System.out.println(pares[i]);
        }


    }
}




                                    //EJERCICIO 2


 //Crea un array "vacio" de 10 posiciones, introducir 10 números enteros y mostrar
        //la media de los valores positivos y la media de los valores negativos
        //Al final hay que comprobar si hay positivos, en ese caso mostrar la media
        //Si hay negativos, mostrar la media también

        int [] array = new int[10];
        int pos = 0, neg = 0;
        int sumaPos = 0, sumaNeg = 0;
        float mediaPos, mediaNeg;
        Scanner scn = new Scanner(System.in);

        for(int i = 0;i< array.length;i++){
            System.out.println("Introduzca el valor de la posicion "+i+": ");
            array[i] = scn.nextInt();
        }

        for(int i = 0;i< array.length;i++){
            if(array[i] > 0){
                sumaPos+= array[i]; //sumaPos = sumaPos + array[i]
                pos++;
            } else if (array[i]<0) {
                sumaNeg+=array[i]; //sumaNeg = sumaNeg + array[i]
                neg++;
            }
        }

        if(pos>0){
            mediaPos = (float) sumaPos / pos;
            System.out.println("La media de los positivos es: "+mediaPos);
        }else{
            System.out.println("No hay positivos");
        }

        if(neg>0){
            mediaNeg = (float) sumaNeg / neg;
            System.out.println("La media de los negativos es: "+mediaNeg);
        }else{
            System.out.println("No hay negativos");
        }



    }
}






                                        //EJERCICIO 5


                     /*Imprime el valor de la diagonal de una matriz*/

        Scanner scn = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz [" + i + "] [" + j + "]");
                matriz[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    System.out.print(matriz[i][j]+" "); //Nos da el valor de la fila i y la columna j de la matriz.
                }
            }
        }


    }
}



                                        // MATRICES


                                        //fxc
        //Crear dos matrices de 3x3 y crea una 3ª matriz donde almacenes la suma
        //de las dos matrices

        //1. Crear las dos matrices
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] suma = new int[3][3];
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca los valores de la primera matriz");
        for(int i = 0;i<matriz1.length;i++){
            for(int j = 0;j<matriz1[i].length;j++){
                System.out.print("Elemento ["+i+"] ["+j+"]: ");
                matriz1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Introduzca los valores de la segunda matriz");
        for(int i = 0;i<matriz2.length;i++){
            for(int j = 0;j<matriz2[i].length;j++){
                System.out.print("Elemento ["+i+"] ["+j+"]: ");
                matriz2[i][j] = scn.nextInt();
            }
        }

        //Sumar las matrices
        for(int i = 0;i<suma.length;i++){
            for(int j = 0;j<suma[i].length;j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("La matriz resultante es: ");
        for(int i = 0;i< suma.length;i++){
            for(int j = 0;j<suma[i].length;j++){
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }






    }

}
