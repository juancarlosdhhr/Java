import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // ------------------------------ //
        // Ejercicio 1: Calcular área de polígonos
        // ------------------------------ //

        final float PI = 3.14f;
        int opcion;
        float area, radio, base, altura, lado;

        System.out.println("Menú de opciones: ");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo");
        System.out.print("Seleccione una opción: ");
        opcion = scn.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduzca el valor del radio: ");
                radio = scn.nextFloat();
                area = PI * radio * radio;
                System.out.println("El área del círculo con radio " + radio + " es: " + area + " cm².");
                break;
            case 2:
                System.out.print("Introduzca la base: ");
                base = scn.nextFloat();
                System.out.print("Introduzca la altura: ");
                altura = scn.nextFloat();
                area = base * altura;
                System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area + " cm².");
                break;
            case 3:
                System.out.print("Introduzca el valor del lado del cuadrado: ");
                lado = scn.nextFloat();
                area = lado * lado;
                System.out.println("El área del cuadrado con lado " + lado + " es: " + area + " cm².");
                break;
            case 4:
                System.out.print("Introduzca la base: ");
                base = scn.nextFloat();
                System.out.print("Introduzca la altura: ");
                altura = scn.nextFloat();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area + " cm².");
                break;
            default:
                System.out.println("Esa opción no existe.");
        }

        // ------------------------------ //
        // Ejercicio 2: Control de bombillas según día y mes
        // ------------------------------ //

        boolean b1 = false; // Por defecto, ambas bombillas están apagadas
        boolean b2 = false;

        System.out.print("Introduzca el día del mes: ");
        int dia = scn.nextInt();
        System.out.print("Introduzca el mes (número): ");
        int mes = scn.nextInt();

        if (dia % 2 == 0 && mes % 2 == 0) {
            b1 = true; // Encender bombilla 1 si día y mes son pares
        } else {
            b2 = true; // Encender bombilla 2 si uno de los dos es impar
        }

        System.out.println("El estado de la bombilla b1 es: " + b1);
        System.out.println("El estado de la bombilla b2 es: " + b2);

        // ------------------------------ //
        // Ejercicio 3: Convertir segundos a horas, minutos y segundos
        // ------------------------------ //

        System.out.print("Introduzca la cantidad de segundos: ");
        int segundos = scn.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        System.out.println(horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s).");

        scn.close(); // Cerramos el scanner
    }
}
