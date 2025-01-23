
/* Realiza un programa que calcule la longitud de una circunferencia de radio 3
metros y muestre el resultado por pantalla. */


package UNIDAD1EJERCICIOS;
    
public class Catorce {
    public static void main(String[] args) {
        // Declarar la constante PI y el radio
        final double PI = 3.14159; // También puedes usar Math.PI para más precisión
        double radio = 3; // Radio en metros

        // Calcular la longitud de la circunferencia
        double longitud = 2 * PI * radio;

        // Mostrar el resultado por pantalla
        System.out.println("La longitud de la circunferencia es: " + longitud + " metros");
    }
}
