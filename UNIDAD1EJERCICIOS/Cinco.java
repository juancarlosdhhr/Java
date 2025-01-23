/* Dentro de una clase joven tenemos las variables
enteras edad, nivelEstudios e ingresos.
Necesitamos almacenar en la variable booleana jasp el valor:
Verdadero. Si la edad es menor o igual a 28, el nivelEstudios es mayor que tres y los
ingresos superan los 28.000 euros.
Falso. En caso contrario.
Escribe el código necesario. (2 líneas).

 */

package UNIDAD1EJERCICIOS;

public class Cinco {
    
    public static void main (String [] args){
        int edad = 25;
        
        int nivelEstudios = 4;
        
        int ingresos= 29000;
    

       boolean jasp = ((edad <=28) && (nivelEstudios > 3) && (ingresos >28000));

System.out.println ("Jasp es " + jasp);

    }
    
    


    
}
