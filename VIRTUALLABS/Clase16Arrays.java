
import java.util.Scanner;

public class Clase16Arrays {

    
public static void main (String[] args) {


//Crea un array de 10 elementos, con valores introducidos por el usuario
//Una vez introducidos, recorrer el array y contar cuantos valores son positivos, negativos o 0

int [] numeros = new int [10];
Scanner scn = new Scanner (System.in);
int pos = 0, neg = 0, cero = 0;

System.out.println ("Introduzca los elementos del array: ");

for (int i = 0; i<numeros.length;i++) { 
    System.out.print("numeros["+i+"] = ");
    numeros[i] = scn.nextInt();

}

for (int i = 0; i< numeros.length;i++) {
    if (numeros[i] > 0) {
    pos++;
    }else if(numeros[i] < 0) {
    neg++;
    }else {
    cero++;
    }

}



System.out.println("Positivos: " +pos);
System.out.println("Negativos: " +neg);
System.out.println("Ceros: "+cero);

}


}



/* 
 
//Crea un array "vacio" de 10 posiciones, introducir 10 nuemros eneteros y mostrar la media
de los valores positivos y la media de los valores negativos

Al final hay que comprobar si hay positivos, en ese caso mostrar la media

Si hay negativos, mostrar la media también
 */






