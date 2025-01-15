import java.util.Scanner; // Importar la clase Scanner


//Los arrays son una colección o grupo de elementos que obligatoriamente tienen que ser del mismo tipo  
public class Arrays {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
//Tenemos 2 formas de crearlos:
int [] numerosEnteros = new int[10]; //En Java, los arrays son objetos, y esta línea crea un array de enteros (int[]) con un tamaño de 10. Esto significa que el array puede almacenar 10 números enteros.
int [] numerosEnteros2 = {1,2,3,4}; // Esta línea crea otro array llamado numerosEnteros2 y lo inicializa con los valores 1, 2, 3 y 4. El tamaño del array se determina automáticamente a partir del número de elementos proporcionados.

for (int i=0; i<numerosEnteros.length; i++) {
    System.out.println("Introduce un número");
    numerosEnteros[i] = entrada.nextInt(); //Esto es lo que estaría introduciendo el usuario.En Java, se utiliza Scanner para obtener datos desde la consola, mientras que en JavaScript se utiliza prompt() en el navegador.
}

for (int i=0; i<numerosEnteros.length; i++) {
    System.out.println("En la posición: ");
    System.out.print(i);
    System.out.println("está el valor: " + numerosEnteros[i]);
    
}
    }
}



