public class Clase12Bucles {
    
}



//SERIE FIBONACCI                                        //EJERCICIO 3

//0,1,1,2,3,5,8,13,21

int cantidad, a = 0, b = 1, siguiente;
Scanner scn = new Scanner(System.in);


System.out.println("¿Cuantos números quieres mostrar de la serie fibonacci?");
cantidad = scn.nextInt();

for(int i = 1;i<=num;i++){
    System.out.print(a); //Imprimir el valor actual

    siguiente = a + b;
    a = b;
    b = siguiente;

}
}
}
