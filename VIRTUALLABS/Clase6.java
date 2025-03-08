import java.util.Scanner;

public class Clase6 {

    public static void main(String[] args) {

        // Ejercicio 1: Precio de la revista
        Scanner scn = new Scanner(System.in);
        float precio;
        int estudiante;
        int anios;

        // Pedir datos
        System.out.println("Introduzca el precio de la revista:");
        precio = scn.nextFloat();

        System.out.println("Indique si es estudiante o no. Marque 1 para indicar que sí es estudiante y 2 para indicar que no es estudiante.");
        estudiante = scn.nextInt();

        System.out.println("Introduzca los años de antigüedad del suscriptor:");
        anios = scn.nextInt();

        // Calcular precio con descuento
        if (anios > 5) {
            if (estudiante == 1) {
                precio = precio * 0.8f; // 20% descuento si es estudiante
            } else {
                precio = precio * 0.85f; // 15% descuento si no es estudiante
            }
        } else if (anios >= 3 && anios <= 5) {
            if (estudiante == 1) {
                precio = precio * 0.9f; // 10% descuento si es estudiante
            } else {
                precio = precio * 0.95f; // 5% descuento si no es estudiante
            }
        } else if (anios == 0) {
            if (estudiante == 1) {
                precio = precio * 0.98f; // 2% descuento si es estudiante y no tiene antigüedad
            } else {
                System.out.println("No aplica descuento.");
            }
        } else {
            System.out.println("Error en los datos.");
        }

        System.out.println("Precio total a pagar: " + precio);

        // Ejercicio 2: Número escrito en palabras
        System.out.println("Introduce un número de 0 a 99:");
        int num = scn.nextInt();

        int decenas = num / 10;
        int unidades = num % 10;

        String uniText = "";
        String decR = "";
        String dec = "";

        // 0-9
        if (unidades == 1) {
            uniText = "uno";
        } else if (unidades == 2) {
            uniText = "dos";
        } else if (unidades == 3) {
            uniText = "tres";
        } else if (unidades == 4) {
            uniText = "cuatro";
        } else if (unidades == 5) {
            uniText = "cinco";
        } else if (unidades == 6) {
            uniText = "seis";
        } else if (unidades == 7) {
            uniText = "siete";
        } else if (unidades == 8) {
            uniText = "ocho";
        } else if (unidades == 9) {
            uniText = "nueve";
        }

        // 10-19
        if (decenas == 1 && unidades == 0) {
            decR = "diez";
        } else if (decenas == 1 && unidades == 1) {
            decR = "once";
        } else if (decenas == 1 && unidades == 2) {
            decR = "doce";
        } else if (decenas == 1 && unidades == 3) {
            decR = "trece";
        } else if (decenas == 1 && unidades == 4) {
            decR = "catorce";
        } else if (decenas == 1 && unidades == 5) {
            decR = "quince";
        } else if (decenas == 1 && unidades == 6) {
            decR = "dieciséis";
        } else if (decenas == 1 && unidades == 7) {
            decR = "diecisiete";
        } else if (decenas == 1 && unidades == 8) {
            decR = "dieciocho";
        } else if (decenas == 1 && unidades == 9) {
            decR = "diecinueve";
        }

        // 20-90
        if (decenas == 2) {
            dec = "veinte";
        } else if (decenas == 3) {
            dec = "treinta";
        } else if (decenas == 4) {
            dec = "cuarenta";
        } else if (decenas == 5) {
            dec = "cincuenta";
        } else if (decenas == 6) {
            dec = "sesenta";
        } else if (decenas == 7) {
            dec = "setenta";
        } else if (decenas == 8) {
            dec = "ochenta";
        } else if (decenas == 9) {
            dec = "noventa";
        }

        // Mostrar el número escrito
        if (num < 10) {
            System.out.println("El número es: " + uniText);
        } else if (num < 20) {
            System.out.println("El número es: " + decR);
        } else if (num < 100) {
            if (num % 10 == 0) {
                System.out.println("El número es: " + dec);
            } else {
                System.out.println("El número es: " + dec + " y " + uniText);
            }
        }

        // Ejercicio 3: Cajero automático
        float saldo = 1000;
        int opcion;
        float ingRet;

        System.out.println("Menu de opciones: \n1. Ingresar dinero \n2. Retirar dinero \n3. Salir");
        opcion = scn.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Cuánto dinero quiere ingresar?");
                ingRet = scn.nextFloat();
                saldo += ingRet; // saldo = saldo + ingreso
                break;

            case 2:
                System.out.println("¿Cuánto dinero quiere retirar?");
                ingRet = scn.nextFloat();
                if (ingRet <= saldo) {
                    saldo -= ingRet; // saldo = saldo - retiro
                } else {
                    System.out.println("No puedes retirar más de lo que tienes.");
                }
                break;

            case 3:
                System.out.println("Salir");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Tenemos en total " + saldo + " euros.");
    }
}
