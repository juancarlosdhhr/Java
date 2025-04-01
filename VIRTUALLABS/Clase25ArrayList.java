public class Clase25ArrayList {
    
}



package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //ArrayList -> Lista de objetos (o strings), lista de longitud variable
        //Array -> Longitud fija. Array tambien es una CLASE.

        ArrayList<Integer> listaNumeros = new ArrayList<>(); // Se pone "integer" y no "int" porque son objetos asi que se tiene que poner el nombre de la clase
        listaNumeros.add(20); //indice 0
        listaNumeros.add(40); //indice 1
        listaNumeros.add(5); //indice 2
        listaNumeros.add(2); //indice 3
        listaNumeros.add(0, 50); //Así podemos hacer una sobrecarga de métodos y cambiar el valor de la posicion 0 a 50.


        listaNumeros.set(0,0) // Esto no se que es preguntar al chatGPT

        //Tambien tenemos el metodo .sort que ordena  (explicamelo mejor chatgpt)

        //Tambien esta el collections.reverse (explicamelo mejor)

        //Se suele preguntar mucho en los examenes temas de ordenes y demas





        for(int i = 0;i<listaNumeros.size();i++){
            System.out.println(listaNumeros.get(i));
        }

        Collections.sort(listaNumeros);

        for(int i: listaNumeros){
            System.out.println(i);
        }

        Collections.reverse(listaNumeros);

        for(int i: listaNumeros){
            System.out.println(i);
        }

        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Pedro");
        nombre.add("Gabriel");
        nombre.add("Rosa");
        nombre.add("Marta");

        Collections.sort(nombre);

        for(String i: nombre){
            System.out.println(i);
        }

        Collections.reverse(nombre);

        for(String i: nombre){
            System.out.println(i);
        }










    }
}

//Buscar en chatGPT que es la sobrecarga de metodos





//Otro ejercicio:


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *
         * 1. Crear un ArrayList para almacenar nombres de estudiantes
         * 2. Agregue al menos cinco nombres al ArrayList
         * 3. Muestre todos los nombres almacenados en la lista.
         * 4. Permita al usuario buscar un nombre en la lista si esta presente o no. .contains ->true/false
         * 5. Permita al usuario eliminar un nombre de la lista si lo desea.
         * 6. Ordene la lista alfabéticamente y muestrela ordenada. Collection.sort A-Z 0-N
         * Collections.reverse Z-A, N-0
         * */
        Scanner scn = new Scanner(System.in);
        String estudiante, eliminado;
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Carlos");
        listaNombres.add("Adela");
        listaNombres.add("Miguel");
        listaNombres.add("Sofia");
        listaNombres.add("Sandra");

        System.out.println("Lista de estudiantes");
        for(String i:listaNombres){
            System.out.println(i);
        }

        System.out.println("Introduzca un estudiantes, para comprobar si esta en la lista");
        estudiante = scn.next();

        if(listaNombres.contains(estudiante)){//true
            System.out.println(estudiante+" se encuentra en mi lista de estudiantes");
        }else{
            System.out.println(estudiante+" no se encuentra en mi lista de estudiantes");
        }

        System.out.println("Introduzca un estudiantes, que quieras eliminar de la lista");
        eliminado = scn.next();

        if (listaNombres.remove(eliminado)){
            System.out.println(eliminado +" ha sido eliminado de mi lista de estudiantes");
        }else{
            System.out.println(eliminado+" no se encontraba en mi lista de estudiantes");
        }

        Collections.sort(listaNombres);

        for(String i:listaNombres){
            System.out.println(i);
        }



    }
}