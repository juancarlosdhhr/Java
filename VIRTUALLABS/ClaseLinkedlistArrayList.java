public class ClaseLinkedlistArrayList {
    
}


/* Diferencia entre ArrayList y LInkedList:
 
Tarda más el reajuste de posiciones(ArrayList) que es reajuste de punteros (LinkedList), ya que LinkedList no tiene 
en cuenta la posición.

LinkedList:  elementos entrelazados <-- 1 --> 2 <-- 3 -->...

Para acceder a un LinkedLIst voy a tardar MÁS que a un ArrayList

Cuando quiero que la lista sea mas modificable es mejor LInkedList

A nivel de memoria ocupa mas un LinkedList que un Arraylist

En el LinkedList no se cambia de posición, simplemente hace un ajuste de quien apunta a quien



ArrayList: Elementos organizados segun posicion

Cada vez que introduzco un valor se reestructuran los indices en mki Array


RESUMEN:

Si queremos modificar una lista - > LinkedList

Si queremos acceder y consultar una lista -> ArrayList

 */

 //Ejercicio para ver la diferencia entre  LinkedList y ArrayList:

 package linkedlist;

public class Persona {

    private int idPersona;
    private String nombre;
    private int altura;

    public Persona(int idPersona, String nombre, int altura){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Persona ->"+idPersona+" con Nombre: -> "+nombre+" y estatura: "+altura;
    }

}

package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //ArrayList -> Intefaz List

        List<Persona> listaArray = new ArrayList<>();
        //ArrayList<Persona> listaArray = new ArrayList<>();
        List<Persona> listalinked = new LinkedList<>();
        //LinkedList<Persona> listalinked = new LinkedList<>();
        long antes;
        for(int i = 0;i<10000;i++){
            listaArray.add(new Persona(i,"Pesrsona",i));
        }

        System.out.println("Tiempo invertido en insertar una persona en listaArray (nanosegundos)");
        antes = System.nanoTime();

        listaArray.add(0,new Persona(10001,"Pepe",10));

        System.out.println("Diferencia arraylist: "+(System.nanoTime() - antes));



        System.out.println(antes);

        for (int i = 0;i<10000;i++){
            listalinked.add(new Persona(i,"Persona",i));
        }

        System.out.println("Tiempo invertido en insertar una persona en linked (nanosegundos)");
        antes = System.nanoTime();

        listalinked.add(0,new Persona(10001,"Pepe",10));

        System.out.println("Diferencia linked: "+(System.nanoTime() - antes));



        System.out.println(antes);


    }
}

package gestorTareas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class GestionTareas {


    //Collections.sort A-Z
    //Collections.reverse Z-A

    public static void main(String[] args) {


        ArrayList<String> tareaArrayList = new ArrayList<>(); //es rapido de acceder a elementos
        LinkedList<String> tareasLinkedList = new LinkedList<>(); //Es mas eficinete para insertar y eliminar elementos
        Scanner scn = new Scanner(System.in);
        int opcion, indice;
        String tarea;


        do {
            System.out.println("Menú de gestión de tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas (ArrayList)");
            System.out.println("4. Mostrar tareas (LinkedList)");
            System.out.println("5. Ordenar tareas por nombre A-Z");
            System.out.println("6. Ordenar tareas por nombre Z-A");
            System.out.println("7. Salir");
            System.out.println("Introduzca una opción");
            opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea");
                    tarea = scn.next();
                    tareaArrayList.add(tarea);
                    tareasLinkedList.add(tarea);
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    System.out.println("Ingrese el número de tarea a eliminar (1 adelante");
                    indice = scn.nextInt();

                    if (indice > 0 && indice <= tareaArrayList.size()) {
                        tareaArrayList.remove(indice - 1);
                        tareasLinkedList.remove(indice - 1);
                        System.out.println("Tarea eliminada");
                    } else {
                        System.out.println("Número de tarea inválido");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tareas (ArrayList)" + tareaArrayList);
                    break;
                case 4:
                    System.out.println("Lista de tareas (LinkedList)" + tareasLinkedList);
                    break;

                case 5:
                    Collections.sort(tareaArrayList);
                    System.out.println(tareaArrayList);
                    break;
                case 6:
                    Collections.reverse(tareaArrayList);
                    System.out.println(tareaArrayList);
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ninguna de estas opciones existen");
            }
        } while (opcion != 7);


    }

}

