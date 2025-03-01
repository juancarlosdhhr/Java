/* Ejercicio: ¿Qué mostrará este programa por pantalla?
public class Test2 {
public static void main(String[] args) {
int i = 0x100;
i >>>= 1;
System.out.println(i);
}
} */


package UNIDAD1EJERCICIOS;

public class Seis {
    
  
        public static void main(String[] args) {
        int i = 0x100;
        i >>>= 1;
        System.out.println(i);
        }
        




}


// Solución = 128


/* El operador >>> es un desplazamiento a la derecha sin signo.

🔹 ¿Qué hace i >>>= 1?

Mueve los bits de i una posición a la derecha.
Como >>> es sin signo, rellena con ceros en la izquierda. */