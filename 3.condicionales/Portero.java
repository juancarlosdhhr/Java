/* public class Portero {
    public static void main(String [] args){

        int edad = 18;
        System.out.println("Alto ahí, enseñeme el DNI");



if(edad > 0 && edad < 18) {
System.out.println("No puedes entrar hasta que cumplas 18 años");

} else if (edad >= 18 && edad <= 60){
System.out.println("Adelante, disfrute de la velada");

} else if (edad > 60 && edad <= 122){
System.out.println("Pase usted a la zona con asientos para que no se haga daño");

} else {
System.out.println("Tira por ahí");

}


    }
} */


//Otra forma de hacerlo:
import java.util.Scanner; //Esta línea importa la clase Scanner desde el paquete java.util. Scanner es una clase utilizada para leer la entrada del usuario desde el teclado o desde otros flujos de entrada.

public class Portero {
    public static void main(String [] args){
        
Scanner sc = new Scanner(System.in); //Aquí se crea un objeto Scanner llamado sc. El constructor new Scanner(System.in) indica que este Scanner leerá datos desde la entrada estándar (System.in), que en este caso es el teclado.
//CONTRASEÑA
System.out.println("¿Y la contraseña?"); // Muestra un mensaje en la consola solicitando la contraseña.
String secretPassword = sc.nextLine(); //sc.nextLine();: El método nextLine() lee una línea completa de texto ingresada por el usuario (en este caso, la contraseña) y la guarda en la variable secretPassword.

       
if(secretPassword.equals("1234")) { //Compara si la contraseña ingresada por el usuario (secretPassword) es igual a "1234". Si la contraseña es correcta, el programa continúa ejecutando el bloque de código dentro de este if.
//EDAD
System.out.println("Alto ahí, enseñeme el DNI");
int edad = sc.nextInt(); // El método nextInt() lee un número entero ingresado por el usuario (en este caso, la edad) y lo almacena en la variable edad.
if(edad < 18) {
System.out.println("No puedes entrar hasta que cumplas 18 años");

} else if (edad >= 18 && edad <= 60){
System.out.println("Adelante, disfrute de la velada");

} else if (edad > 60 && edad <= 122){
System.out.println("Pase usted a la zona con asientos para que no se haga daño");

} else {
System.out.println("Tira por ahí");

}
//Por buena práctica cerramos el scanner para que detenga su ejecución. Es importante hacerlo cuando ya no necesites leer más datos del usuario.
sc.close();

}
}
}

//Este es el flujo básico del programa: primero pide la contraseña y la compara, 
//luego solicita la edad si la contraseña es correcta, y con base en la edad, 
//muestra un mensaje adecuado.








import java.util.Scanner;  // Importa la clase Scanner para leer la entrada del usuario

public class Portero {
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner para leer la entrada del usuario desde el teclado
        Scanner sc = new Scanner(System.in);

        // Solicitamos la contraseña
        System.out.println("¿Y la contraseña?");  // Muestra un mensaje solicitando la contraseña
        String secretPassword = sc.nextLine();  // Lee la contraseña ingresada por el usuario
        
        // Verificamos si la contraseña es correcta
        if (secretPassword.equals("1234")) {  // Compara la contraseña ingresada con "1234"
            // Si la contraseña es correcta, solicitamos la edad
            System.out.println("Alto ahí, enseñeme el DNI");
            int edad = sc.nextInt();  // Lee la edad ingresada por el usuario

            // Condicional para verificar la edad y dar un mensaje adecuado
            if (edad < 18) {
                System.out.println("No puedes entrar hasta que cumplas 18 años");
            } else if (edad >= 18 && edad <= 60) {
                System.out.println("Adelante, disfrute de la velada");
            } else if (edad > 60 && edad <= 122) {
                System.out.println("Pase usted a la zona con asientos para que no se haga daño");
            } else {
                System.out.println("Tira por ahí");
            }

            // Cerramos el Scanner por buena práctica
            sc.close();
        }
    }
}
