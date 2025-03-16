

/* ACTIVIDAD PARA NAVIDADES – MÓDULO DE PROGRAMACIÓN

Juego del Laberinto
Desarrolla un programa en Java que simule un juego de texto interactivo en el
que un jugador debe navegar por un laberinto compuesto por 4 salas conectadas
entre sí. El objetivo del juego es llegar a la Sala 3 con la mayor cantidad de energía
posible antes de quedarse sin energía.

    ** Reglas del Juego **

1. Estado Inicial del Jugador:
o El jugador comienza con 100 puntos de energía.
o La posición inicial es la Sala 1.
2. Conexiones entre Salas:
o Las salas están conectadas de la siguiente manera:
▪ Sala 1 → Sala 2, Sala 3
▪ Sala 2 → Sala 1, Sala 4
▪ Sala 4 → Sala 1, Sala 2

3. Opciones del Jugador: En cada turno, el jugador tiene las siguientes
opciones:
o Moverse a otra sala: Elige la sala a la que desea ir, siempre y
cuando exista una conexión válida desde su posición actual.
o Inspeccionar la sala actual: En esta acción, puede ocurrir un
evento aleatorio:

▪ Encontrar monedas (+10 puntos de energía).
▪ Caer en una trampa (-15 puntos de energía).
▪ No encontrar nada.

o Salir del juego: El jugador puede decidir abandonar el juego en
cualquier momento.

Requisitos del Programa

1. Estructura del Código:

o Usa un bucle while para mantener el juego activo hasta que el
jugador gane, pierda o decida salir.
o Usa switch para manejar las opciones del menú y los eventos
aleatorios.
o Usa hasNextInt para validar que las entradas del usuario sean
correctas.

2. Flujo del Juego:

o Muestra al jugador su posición actual y la cantidad de energía
restante al inicio de cada turno.

o Presenta un menú interactivo con las tres opciones (moverse,
inspeccionar o salir).

o Verifica que el movimiento entre salas sea válido según las
conexiones.

3. Mensajes en la Consola:

o Muestra mensajes claros que indiquen:
▪ Los eventos que ocurren, por ejemplo,"¡Has encontrado
monedas! Ganas 10 puntos de energía.".
▪ Cambios en la energía del jugador.
▪ Si el jugador ha ganado, perdido o salido del juego.

4. Eventos Aleatorios: Cada vez que el jugador inspecciona una sala, se
genera un evento aleatorio. Los eventos posibles son:

o Evento 1: El jugador encuentra monedas. Esto incrementa la energía
en 10 puntos.

o Evento 2: El jugador cae en una trampa. Esto reduce la energía en 15
puntos.

o Evento 3: La sala está vacía y no sucede nada.


5. Condiciones para Ganar o Perder:

o El jugador gana al llegar a la Sala 3.

o El jugador pierde si su energía llega a 0 puntos antes de llegar a la
Sala 3.


*/





import java.util.Random;
import java.util.Scanner;

public class VideojuegoLaberinto  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int energia = 100;
        int posicion = 1;
        boolean juegoActivo = true;
        int opcion;
        int salaDestino = 0;
        int evento; // 0, 1, 2

        while (juegoActivo) {
            //Mostrar el estado actual
            System.out.println("Estas en la sala: " + posicion + " con " + energia + " puntos de energia");

            //Mostrar opciones
            System.out.println("Elige una opción");
            System.out.println("1. Moverse a otra sala");
            System.out.println("2. Inspeccionar la sala");
            System.out.println("3. Salir del juego");

            //Leer y validar la entrada del usuario (hasNextInt())
            if (scn.hasNextInt()) {
                opcion = scn.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número valido");
                scn.next(); //Limpiar la entrada no válida
                opcion = 0;
            }
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        //Mover a otra sala
                        System.out.println("Elige a que sala moverte: ");
                        if (posicion == 1) {
                            System.out.println("Sala 2");
                            System.out.println("Sala 3");
                        } else if (posicion == 2) {
                            System.out.println("Sala 1");
                            System.out.println("Sala 4");
                        } else if (posicion == 4) {
                            System.out.println("Sala 1");
                            System.out.println("Sala 2");
                        }
                        if (scn.hasNextInt()) {
                            salaDestino = scn.nextInt();
                            if ((posicion == 1 && (salaDestino == 2 || salaDestino == 3)) ||
                                    (posicion == 2 && (salaDestino == 1 || salaDestino == 4)) ||
                                    (posicion == 4) && (salaDestino == 1 || salaDestino == 2)) {
                                posicion = salaDestino;
                            } else {
                                System.out.println("Movimiento invalido");
                            }
                        } else {
                            System.out.println("Por favor, ingrese un número valido");
                            scn.next(); //Limpiar la entrada
                        }
                        break;

                    case 2:
                        //Inspeccionar la sala
                        evento = random.nextInt(3); // 0 , 1 , 2
                        if (evento == 0) {
                            System.out.println("¡Has encontrado monedas! Ganas 10 puntos de energía");
                            energia += 10;
                        } else if (evento == 1) {
                            System.out.println("¡Has caido en la trampa! Pierdes 15 puntos de energía");
                            energia -= 15;
                        } else {
                            System.out.println("No encuentras nada");
                        }
                        break;
                    case 3:
                        //Salir del juego
                        System.out.println("Has decidido salir del juego");
                        juegoActivo = false;
                        break;
                }

                if (posicion == 3) {
                    System.out.println("¡Felicidades! has llegado a la sala 3 y has ganado el juego");
                    juegoActivo = false;
                } else if (energia <= 0) {
                    System.out.println("Te has quedado sin energía. Has perdido el juego");
                    juegoActivo = false;
                }

            } else {
                System.out.println("Por favor selecciona una opción valida");
            }
        }

    }

}

