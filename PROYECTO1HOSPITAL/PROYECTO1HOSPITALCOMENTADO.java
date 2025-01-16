

package PROYECTO1HOSPITAL;

import java.util.Scanner;
public class PROYECTO1HOSPITALCOMENTADO {
    // DEFINIMOS CONSTANTES PARA LOS RANGOS DE ENTRADA
    public static final int NUSS_MIN = 100000, NUSS_MAX = 999999; // Rango para el número de seguridad social.
    public static final int SINTOMA_MIN = 0, SINTOMA_MAX = 3; // Rango para los síntomas.
    public static final int EXPLORACION_MIN = 0, EXPLORACION_MAX = 3; // Rango para exploraciones relacionadas con el síntoma.
    public static final int TRAUMATICA_MIN = 0, TRAUMATICA_MAX = 3; // Rango para exploraciones traumáticas.
    public static final int FIEBRE_MIN = 0, FIEBRE_MAX = 3; // Rango para exploraciones por fiebre.
    public static final int CONFUSION_MIN = 0, CONFUSION_MAX = 3; // Rango para exploraciones por confusión.
    public static final int PRIORIDAD_MIN = 0, PRIORIDAD_MAX = 5; // Rango para niveles de prioridad.
    public static final int TEMPERATURA_MIN = 27, TEMPERATURA_MAX = 45; // Rango para temperatura corporal.

    public static void main(String[] args) {
        // DECLARAMOS VARIABLES NECESARIAS
        Scanner sc = new Scanner(System.in); // Objeto para leer datos del usuario.
        boolean correcto = true; // Variable para controlar la validez de las entradas.
        int nuss = 0, exploracion = 0, sintoma = 0, prioridad = 0, temperatura = 0; // Variables para almacenar los datos del paciente.

        // PEDIMOS EL NÚMERO DE LA SEGURIDAD SOCIAL
        System.out.println("Escribe el número de la seguridad social:");
        System.out.println("(Numero entre " + NUSS_MIN + " y " + NUSS_MAX + ")");

        // VALIDACIÓN DEL NUSS
        do {
            if (sc.hasNextInt()) { // Verificamos si el dato ingresado es un entero.
                nuss = sc.nextInt(); // Leemos el número.
                if ((nuss >= NUSS_MIN) && (nuss <= NUSS_MAX)) { // Validamos que esté dentro del rango.
                    correcto = false; // Dato válido, salimos del bucle.
                } else {
                    System.out.println("Error en el rango. Entre " + NUSS_MIN + " y " + NUSS_MAX);
                    correcto = true; // Dato inválido, repetimos.
                }
            } else {
                System.out.println("Error de tipo de datos. Entre " + NUSS_MIN + " y " + NUSS_MAX);
                correcto = true; // Entrada inválida, repetimos.
                sc.next(); // Limpiamos la entrada errónea.
            }
        } while (correcto);

        // PEDIMOS EL SÍNTOMA
        do {
            System.out.println("¿Síntoma del paciente?");
            System.out.println("Dolor (0)");
            System.out.println("Lesión traumática (1)");
            System.out.println("Fiebre alta (2)");
            System.out.println("Confusión o desorientación (3)");

            if (sc.hasNextInt()) { // Verificamos si el dato es un entero.
                sintoma = sc.nextInt(); // Leemos el síntoma.
                if ((sintoma >= SINTOMA_MIN) && (sintoma <= SINTOMA_MAX)) {
                    correcto = false; // Entrada válida, salimos del bucle.
                } else {
                    System.out.println("Error fuera de rango. Entre " + SINTOMA_MIN + " y " + SINTOMA_MAX);
                    correcto = true; // Entrada inválida, repetimos.
                }
            } else {
                System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + SINTOMA_MIN + " y " + SINTOMA_MAX);
                correcto = true; // Entrada inválida, repetimos.
                sc.next(); // Limpiamos la entrada errónea.
            }
        } while (correcto);

        // SEGÚN EL SÍNTOMA, PEDIMOS UNA EXPLORACIÓN INICIAL
        switch (sintoma) {
            case 0: // Dolor
                do {
                    System.out.println("Síntoma del paciente = DOLOR");
                    System.out.println("¿Exploración?");
                    System.out.println("Dolor torácico (0)");
                    System.out.println("Dolor abdominal (1)");
                    System.out.println("Dolor de cabeza (2)");
                    System.out.println("Dolor Migraña (3)");

                    if (sc.hasNextInt()) { // Verificamos si es un entero.
                        exploracion = sc.nextInt(); // Leemos el dato.
                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = false; // Entrada válida, salimos del bucle.
                        } else {
                            System.out.println("Error fuera de rango. Entre " + EXPLORACION_MIN + " y " + EXPLORACION_MAX);
                            correcto = true; // Entrada inválida, repetimos.
                        }
                    } else {
                        System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + EXPLORACION_MIN + " y " + EXPLORACION_MAX);
                        correcto = true; // Entrada inválida, repetimos.
                        sc.next(); // Limpiamos la entrada errónea.
                    }
                } while (correcto);
                break;
            case 1: // Lesión traumática
                do {
                    System.out.println("Síntoma del paciente = LESIÓN TRAUMÁTICA");
                    System.out.println("¿Exploración?");
                    System.out.println("Fractura ósea (0)");
                    System.out.println("Herida de bala (1)");
                    System.out.println("Quemadura (2)");
                    System.out.println("Lesión cerebral traumática (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt(); // Leemos el dato.
                        if ((exploracion >= TRAUMATICA_MIN) && (exploracion <= TRAUMATICA_MAX)) {
                            correcto = false; // Entrada válida, salimos del bucle.
                        } else {
                            System.out.println("Error fuera de rango. Entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                            correcto = true; // Entrada inválida, repetimos.
                        }
                    } else {
                        System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + TRAUMATICA_MIN + " y " + TRAUMATICA_MAX);
                        correcto = true; // Entrada inválida, repetimos.
                        sc.next(); // Limpiamos la entrada errónea.
                    }
                } while (correcto);
                break;
            case 2: // Fiebre alta
                do {
                    System.out.println("Síntoma del paciente = FIEBRE ALTA");
                    System.out.println("¿Exploración?");
                    System.out.println("Neumonia (0)");
                    System.out.println("Meningitis (1)");
                    System.out.println("Infección viral (2)");
                    System.out.println("Reacción alérgica (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt(); // Leemos el dato.
                        if ((exploracion >= FIEBRE_MIN) && (exploracion <= FIEBRE_MAX)) {
                            correcto = false; // Entrada válida, salimos del bucle.
                        } else {
                            System.out.println("Error fuera de rango. Entre " + FIEBRE_MIN + " y " + FIEBRE_MAX);
                            correcto = true; // Entrada inválida, repetimos.
                        }
                    } else {
                        System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + FIEBRE_MIN + " y " + FIEBRE_MAX);
                        correcto = true; // Entrada inválida, repetimos.
                        sc.next(); // Limpiamos la entrada errónea.
                    }
                } while (correcto);
                break;
            case 3: // Confusión o desorientación
                do {
                    System.out.println("Síntoma del paciente = CONFUSIÓN O DESORIENTACIÓN");
                    System.out.println("¿Exploración?");
                    System.out.println("Intoxicación por drogas o alcohol (0)");
                    System.out.println("Deshidratación severa (1)");
                    System.out.println("Accidente cerebrovascular (2)");
                    System.out.println("Hipoglucemia severa (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt(); // Leemos el dato.
                        if ((exploracion >= CONFUSION_MIN) && (exploracion <= CONFUSION_MAX)) {
                            correcto = false; // Entrada válida, salimos del bucle.
                        } else {
                            System.out.println("Error fuera de rango. Entre " + CONFUSION_MIN + " y " + CONFUSION_MAX);
                            correcto = true; // Entrada inválida, repetimos.
                        }
                    } else {
                        System.out.println("Error de tipo de datos. Tienes que introducir un entero entre " + CONFUSION_MIN + " y " + CONFUSION_MAX);
                        correcto = true; // Entrada inválida, repetimos.
                        sc.next(); // Limpiamos la entrada errónea.
                    }
                } while (correcto);
                break;
        }

        // PEDIR NIVEL DE PRIORIDAD
        System.out.println("Escribe el nivel de prioridad:");
        System.out.println("(Número entre " + PRIORIDAD_MIN + " y " + PRIORIDAD_MAX + ")");

        do {
            if (sc.hasNextInt()) {
                prioridad = sc.nextInt(); // Leemos el dato.
                if ((prioridad >= PRIORIDAD_MIN) && (prioridad <= PRIORIDAD_MAX)) {
                    correcto = false; // Entrada válida, salimos del bucle.
                } else {
                    System.out.println("Error fuera de rango. Entre " + PRIORIDAD_MIN + " y " + PRIORIDAD_MAX);
                    correcto = true; // Entrada inválida, repetimos.
                }
            } else {
                System.out.println("Error de tipo de datos. Entre " + PRIORIDAD_MIN + " y " + PRIORIDAD_MAX);
                correcto = true; // Entrada inválida, repetimos.
                sc.next(); // Limpiamos la entrada errónea.
            }
        } while (correcto);

        // PEDIR TEMPERATURA CORPORAL
        System.out.println("Escribe tu temperatura corporal:");
        System.out.println("(Número entre " + TEMPERATURA_MIN + " y " + TEMPERATURA_MAX + ")");

        do {
            if (sc.hasNextInt()) {
                temperatura = sc.nextInt(); // Leemos el dato.
                if ((temperatura >= TEMPERATURA_MIN) && (temperatura <= TEMPERATURA_MAX)) {
                    correcto = false; // Entrada válida, salimos del bucle.
                } else {
                    System.out.println("Error fuera de rango. Entre " + TEMPERATURA_MIN + " y " + TEMPERATURA_MAX);
                    correcto = true; // Entrada inválida, repetimos.
                }
            } else {
                System.out.println("Error de tipo de datos. Entre " + TEMPERATURA_MIN + " y " + TEMPERATURA_MAX);
                correcto = true; // Entrada inválida, repetimos.
                sc.next(); // Limpiamos la entrada errónea.
            }
        } while (correcto);

        // MOSTRAR LOS DATOS INGRESADOS
        System.out.println("NUSS \t SÍNTOMA \t EXPLORACIÓN \t NIVEL PRIORIDAD \t TEMPERATURA");
        System.out.println("===========================================================================");
        System.out.print(nuss);
        switch (sintoma) {
            case 0: System.out.print("\tDolor");
                    switch (exploracion) {
                        case 0: System.out.print("\tDolor torácico"); break;
                        case 1: System.out.print("\tDolor abdominal"); break;
                        case 2: System.out.print("\tDolor de cabeza"); break;
                        case 3: System.out.println("\tMigraña"); break;
                    }
                    break;
            case 1: System.out.print("\tLesión traumática");
                    switch (exploracion) {
                        case 0: System.out.print("\tFractura ósea"); break;
                        case 1: System.out.print("\tHerida de bala"); break;
                        case 2: System.out.print("\tQuemadura"); break;
                        case 3: System.out.println("\tLesión cerebral traumática"); break;
                    }
                    break;
            case 2: System.out.print("\tFiebre alta");
                    switch (exploracion) {
                        case 0: System.out.print("\tNeumonía"); break;
                        case 1: System.out.print("\tMeningitis"); break;
                        case 2: System.out.print("\tInfección viral"); break;
                        case 3: System.out.println("\tReacción alérgica"); break;
                    }
                    break;
            case 3: System.out.print("\tConfusión o desorientación");
                    switch (exploracion) {
                        case 0: System.out.print("\tIntoxicación por drogas o alcohol"); break;
                        case 1: System.out.print("\tDeshidratación severa"); break;
                        case 2: System.out.print("\tAccidente cerebrovascular"); break;
                        case 3: System.out.println("\tHipoglucemia severa"); break;
                    }
                    break;
        }
        System.out.println("\t" + prioridad + "\t" + temperatura);
    }
}


