
/* Realiza un programa que calcule el área de una circunferencia de radio 5,2 cm y
muestre el resultado por pantalla.
 */
package UNIDAD1EJERCICIOS;

public class Quince {
    public static void main(String[] args) {
        // Declarar la constante PI y el radio
        final double PI = 3.14159; // También puedes usar Math.PI para mayor precisión
        double radio = 5.2; // Radio en centímetros

        // Calcular el área de la circunferencia
        double area = PI * radio * radio;

        // Mostrar el resultado por pantalla
        System.out.println("El área de la circunferencia es: " + area + " cm²");
    }
}
