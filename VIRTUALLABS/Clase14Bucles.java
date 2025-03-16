public class Clase14Bucles {
    
}


//                              *** EMPEZAMOS CON ARRAYS ***

//                   EN CONCRETO ARRAYS UNIDIMENSIONALES (DE 1 SOLO VECTOR)

// Los ARRAYS también se llaman VECTORES 


int [] dias = {20,30,40,10,4,5,6,4,-2}; //Indices, Longitud

//dias.length -> 9

for (int i=dias.length -1;i>0;i--){

    System.out.println(dias[i]);
}

/* 📌 Análisis:

int i = dias.length - 1 → Estamos inicializando i con el último índice válido del array.
Como dias.length es 9, entonces i empieza en 8 (última posición del array).
i >= 0 → Condición del bucle: seguirá ejecutándose mientras i sea mayor o igual a 0.
i-- → El decremento: en cada iteración, i baja en 1 (i--), recorriendo el array en orden inverso.

 */