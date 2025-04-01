public class Clase24 {
    
/* ===============================
 * EJERCICIO 1: HERENCIA Y POLIMORFISMO
 * ===============================
 * Crea una clase llamada Vehiculo, con un método tipoDeVehiculo(), luego crea dos clases
 * hijas Auto y Moto que sobrescribirán ese método para mostrar el tipo específico de vehículo.
 */

// Clase padre Vehiculo
abstract class Vehiculo {
    public abstract void tipoDeVehiculo();
}


/* Se define como abstract porque no se instanciarán objetos de esta clase directamente.
Contiene el método tipoDeVehiculo(), que es abstracto, lo que significa que las clases hijas
estarán obligadas a implementarlo. */


// Clase hija Auto que sobrescribe el método tipoDeVehiculo()
class Auto extends Vehiculo {
    @Override
    public void tipoDeVehiculo() {
        System.out.println("Esto es un coche");
    }
}

// Clase hija Moto que sobrescribe el método tipoDeVehiculo()
class Moto extends Vehiculo {
    @Override
    public void tipoDeVehiculo() {
        System.out.println("Esto es una moto");
    }
}


/* Ambas clases heredan de Vehiculo (por eso usan extends).
Implementan el método tipoDeVehiculo() a su manera (usando polimorfismo).
 */







/* ===============================
 * EJERCICIO 2: CLASES ABSTRACTAS
 * ===============================
 * Crea una clase abstracta Figura con el método abstracto calcularArea(). Luego
 * crea dos clases derivadas, Circulo y Rectángulo, que implementen el método abstracto
 * de forma específica.
 */

// Clase abstracta Figura
abstract class Figura {
    public abstract double calcularArea();
}



/* Como es abstracta, no se pueden crear objetos de Figura, solo de sus clases hijas.
Contiene el método calcularArea(), que cada subclase debe definir a su manera. */



// Clase Circulo que implementa calcularArea()
class Circulo extends Figura {
    private double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Rectangulo que implementa calcularArea()
class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor para inicializar base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}


/* Circulo y Rectangulo heredan de Figura y deben implementar calcularArea().
Se usa un constructor en cada clase para inicializar los atributos (radio, base, altura).
 */



/* ===============================
 * MAIN: EJECUCIÓN DE LOS EJEMPLOS
 * ===============================
 */

public class Main {
    public static void main(String[] args) { //Aquí es donde el programa empieza a ejecutarse.
        // POLIMORFISMO: Usamos el mismo tipo Vehiculo para distintos objetos
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Auto(); //vehiculo 0 es un auto
        vehiculos[1] = new Moto(); //vehiculo 1 es una moto
        vehiculos[2] = new Auto();
        vehiculos[3] = new Moto();


/* Se crea un array de tipo Vehiculo, pero se llenan con Auto y Moto.
Gracias al polimorfismo, podemos tratarlos a todos como Vehiculo.


Cuando tipoDeVehiculo() se llama en v, Java busca la implementación en la clase específica del objeto
 (no en la referencia).
🔹 Aunque vehiculos es un array de Vehiculo, cada elemento realmente es un Auto o Moto, 
así que ejecuta el método correspondiente.*/


        // Bucle for-each para recorrer el array y llamar a tipoDeVehiculo()
        for (Vehiculo v : vehiculos) {
            v.tipoDeVehiculo();
        }

/* Es una forma mas corta de escribir : 

🔹for (int i = 0; i < vehiculos.length; i++) {
    Vehiculo v = vehiculos[i];  // Guardamos el elemento actual en v
    v.tipoDeVehiculo();  // Llamamos a su método correspondiente
} 

"Para cada elemento del array vehiculos, guárdalo en v y ejecuta tipoDeVehiculo() en él".

¿Cómo funciona v?
🔹 v es una variable temporal que Java crea en cada iteración del for-each.
🔹 En cada vuelta, toma el valor de un elemento del array vehiculos.
🔹 Así, en cada iteración v es un objeto distinto de Vehiculo (ya sea un Auto o Moto).


En resumen:
🔹v no se define antes, sino que se crea en cada iteración dentro del bucle for-each.
🔹En cada vuelta, v apunta a un objeto dentro del array vehiculos.
🔹Java automáticamente selecciona el siguiente elemento del array en cada iteración.

 */

// Bucle for-each -> Llama a tipoDeVehiculo() en cada objeto, ejecutando la versión específica de Auto o Moto.


        // CLASES ABSTRACTAS: Crear objetos de Circulo y Rectangulo
        Figura circulo = new Circulo(10);
        Figura rectangulo = new Rectangulo(4, 5);

        // Mostrar áreas calculadas
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}}


// Llama a calcularArea(), ejecutando la versión de cada subclase. 



//EJERCICIO 3 * INTERFAZ *



/* Ejercicio 3: Sistema de vehiculos
Vamos a crear un sistema con vehiculos, donde se incluyen coches, motos y bicicletas.

* Polimorfismo: Diferentes tipos de vehiculos con un comportamiento común modificado
* Abstracción: Clase abstracta Vehiculo
* Intefaces: Una interfaz Conducible para los vehiculos que pueden ser conducidos
* Atributos protegidos: Atributos accesibles solo dentro de la clase y sus sublcases */

// Interfaz que define el comportamiento de los vehículos que pueden ser conducidos
public interface Conducible {
    void conducir(); // Método obligatorio que implementarán los vehículos
}

// Clase abstracta Vehiculo que será la base para Coche y Moto
public abstract class Vehiculo implements Conducible {
    
    protected String marca; // Marca del vehículo (accesible solo en subclases)
    protected String modelo; // Modelo del vehículo (accesible solo en subclases)

    // Constructor para inicializar marca y modelo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstracto que obliga a las subclases a definir el tipo de vehículo
    public abstract void tipoDeVehiculo();

    // Implementación por defecto de conducir(), puede ser sobrescrita en las subclases
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un vehículo");
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

// Clase Coche que extiende de Vehiculo
public class Coche extends Vehiculo {
    
    private int numeroPuertas; // Número de puertas del coche

    // Constructor que inicializa marca, modelo y número de puertas
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Implementación del método abstracto tipoDeVehiculo
    @Override
    public void tipoDeVehiculo() {
        System.out.println("Esto es un coche");
    }

    // Sobrescritura del método conducir
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche: " + marca + " " + modelo);
    }
}

// Clase Moto que extiende de Vehiculo
public class Moto extends Vehiculo {
    
    private boolean tieneSidecar; // Indica si la moto tiene sidecar

    // Constructor que inicializa marca, modelo y si tiene sidecar
    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    // Implementación del método abstracto tipoDeVehiculo
    @Override
    public void tipoDeVehiculo() {
        System.out.println("Esto es una moto");
    }

    // Sobrescritura del método conducir
    @Override
    public void conducir() {
        System.out.println("Conduciendo una moto: " + marca + " " + modelo);
    }

    // Método adicional para mostrar si la moto tiene sidecar
    public void mostrarSidecar() {
        if (tieneSidecar) {
            System.out.println("La moto tiene sidecar");
        } else {
            System.out.println("La moto no tiene sidecar");
        }
    }
}


/* 🛠 Conceptos clave en el Ejercicio 3:
Interfaz (Conducible)

Es un contrato que obliga a las clases que lo implementen a definir un comportamiento (conducir()).
Clase abstracta (Vehiculo)

Es una plantilla base que no se puede instanciar directamente.
Tiene atributos (marca, modelo) que las subclases heredan.
Define métodos (tipoDeVehiculo()) que deben implementarse en las subclases.
Puede tener métodos con implementación (conducir(), mostrarInfo()).
Subclases (Coche y Moto)

Heredan de Vehiculo → Reciben los atributos y métodos de Vehiculo.
Implementan Conducible → Deben definir el método conducir().
Sobrescriben métodos (@Override) → Modifican el comportamiento de tipoDeVehiculo().
Tienen atributos propios → Coche tiene numeroPuertas, Moto tiene tieneSidecar. */