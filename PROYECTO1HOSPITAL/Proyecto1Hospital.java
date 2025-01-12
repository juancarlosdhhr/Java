package PROYECTO1HOSPITAL;

import java.util.Scanner;

public class Proyecto1Hospital {
    // DEFINIMOS CONSTANTES
    public static final int NUSS_MIN = 100000, NUSS_MAX = 999999;
    public static final int SINTOMA_MIN = 0, SINTOMA_MAX = 3;
    public static final int EXPLORACION_MIN = 0, EXPLORACION_MAX = 3;
    public static final int TRAUMATICA_MIN=0, TRAUMATICA_MAX=3;
    public static void main(String[] args) {
        // DEFINIMOS VARIABLES
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int nuss = 0, sintoma = 0, exploracion = 0;

        // PEDIMOS EL NÚMERO DE LA SEGURIDAD SOCIAL
        System.out.println("Escribe el número de la seguridad social:");
        System.out.println("(Numero entre " + NUSS_MIN + " y " + NUSS_MAX + ")");

        // Control de errores
        do {
            // Verificar el tipo de datos
            if (sc.hasNextInt()) {
                nuss = sc.nextInt();
                // Verificamos el rango
                if ((nuss >= NUSS_MIN) && (nuss <= NUSS_MAX)) {
                    // Rango correcto
                    correcto = false;
                } else {
                    // Rango erróneo
                    correcto = true;
                    System.out.println("Error en el rango. Entre " + NUSS_MIN + " y " + NUSS_MAX);
                }
            } else {
                System.out.println("Error de tipo de datos. Entre " + NUSS_MIN + " y " + NUSS_MAX);
                correcto = true;
                sc.next();
            }
        } while (correcto);

        // PEDIMOS EL SÍNTOMA
        do {
            // Mostramos menú
            System.out.println("¿Síntoma del paciente?");
            System.out.println("Dolor (0)");
            System.out.println("Lesión traumática (1)");
            System.out.println("Fiebre alta (2)");
            System.out.println("Confusión o desorientación (3)");

            // Validamos datos tipo // 0..3
            if (sc.hasNextInt()) {
                sintoma = sc.nextInt();
                // Validamos rango
                if ((sintoma >= SINTOMA_MIN) && (sintoma <= SINTOMA_MAX)) {
                    correcto = false;
                } else {
                    System.out.println("Error fuera de rango. Entre " + SINTOMA_MIN + " y " + SINTOMA_MAX);
                    correcto = true;
                }
            } else {
                System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + SINTOMA_MIN + " y " + SINTOMA_MAX);
                correcto = true;
                sc.next();
            }
        } while (correcto);

        // SEGÚN EL SÍNTOMA UNA EXPLORACIÓN INICIAL
        switch (sintoma) {
            case 0:
                do {
                    System.out.println("Síntoma del paciente = DOLOR");
                    System.out.println("¿Exploración?");
                    System.out.println("Dolor torácico (0)");
                    System.out.println("Dolor abdominal (1)");
                    System.out.println("Dolor de cabeza (2)");
                    System.out.println("Dolor Migraña (3)");

                    // Verificar si es entero // verificar rango
                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt();
                        // Validamos rango
                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = false;
                        } else {
                            correcto = true;
                            System.out.println("Error fuera de rango. Entre " + EXPLORACION_MIN + " y " + EXPLORACION_MAX);
                        }
                    } else {
                        System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + EXPLORACION_MIN + " y " + EXPLORACION_MAX);
                        correcto = true;
                        sc.next();
                    }
                } while (correcto);
                break;
            case 1:
            do {
                System.out.println("Síntoma del paciente = LESIÓN TRAUMÁTICA");
                System.out.println("¿Exploración?");
                System.out.println("Fractura ósea (0)");
                System.out.println("Herida de bala (1)");
                System.out.println("Quemadura (2)");
                System.out.println("Lesión cerebral traumática (3)");

                // Verificar si es entero // verificar rango
                if (sc.hasNextInt()) {
                    sintomaextInt();
                    // Validamos rango
                    if ((sintoma >= TRAUMATICA_MIN) && (sintoma <= TRAUMATICA_MAX)) {
                        correcto = false;
                    } else {
                        correcto = true;
                        System.out.println("Error fuera de rango. Entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                    }
                } else {
                    System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                    correcto = true;
                    sc.next();
                }
            } while (correcto);
            break;
            case 2:
            do {
                System.out.println("Síntoma del paciente = FIEBRE ALTA");
                System.out.println("¿Exploración?");
                System.out.println("Neumonia (0)");
                System.out.println("Meningitis (1)");
                System.out.println("Infeccion viral (2)");
                System.out.println("Reacción alérgica (3)");

                // Verificar si es entero // verificar rango
                if (sc.hasNextInt()) {
                    sintomaextInt();
                    // Validamos rango
                    if ((sintoma >= TRAUMATICA_MIN) && (sintoma <= TRAUMATICA_MAX)) {
                        correcto = false;
                    } else {
                        correcto = true;
                        System.out.println("Error fuera de rango. Entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                    }
                } else {
                    System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                    correcto = true;
                    sc.next();
                }
            } while (correcto);
            break;
            case 3:
                System.out.println("Síntoma del paciente = CONFUSIÓN O DESORIENTACIÓN");
                break;
        }
    }
}
