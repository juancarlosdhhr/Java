/* P18. Pedir una nota de 0 a 10 y mostrarla con letra: 
   Insuficiente, Suficiente, Bien, Notable, Sobresaliente. */

   package UNIDAD2EJERCICIOS;

   import java.util.Scanner; // Importamos Scanner para leer datos del usuario
   
   public class Dieciocho { // Nombre de la clase
       public static void main(String[] args) {
           // Crear un objeto Scanner para leer la entrada del usuario
           Scanner scanner = new Scanner(System.in);
   
           // Pedir la nota al usuario
           System.out.print("Introduce una nota entre 0 y 10: ");
           int nota = scanner.nextInt();
   
           // Evaluar la nota y mostrar la calificación correspondiente
           if (nota < 0 || nota > 10) {
               System.out.println("Error: La nota debe estar entre 0 y 10.");
           } else if (nota >= 0 && nota < 5) {
               System.out.println("Insuficiente");
           } else if (nota == 5) {
               System.out.println("Suficiente");
           } else if (nota == 6) {
               System.out.println("Bien");
           } else if (nota >= 7 && nota <= 8) {
               System.out.println("Notable");
           } else {
               System.out.println("Sobresaliente");
           }
   
           // Cerrar el scanner
           scanner.close();
       }
   }
   