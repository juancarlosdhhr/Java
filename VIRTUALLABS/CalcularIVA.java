import java.util.Scanner;


public class CalcularIVA {
 
    




// ESTE VA A SER MI METODO "CALCULAR IVA":

static double CalcularIVA (double totalSinIVA, int porcentaje) {

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


System.out.println (CalcularIVA(totalSinIVA,porcentaje));




}}

