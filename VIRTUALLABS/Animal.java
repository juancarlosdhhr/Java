
    



                                        // POLIMORFISMO

/* Polimorfismo significa "muchas formas" y el concepto es coger u  método que ya existe
 * y sobreescribirlo (cambiarlo de forma). Un mismo método puede tomar diferentes formas
 *  dependiendo de la clase que lo implemente.
 * 
 * ¿Cómo lo cambiamos? -> Mediante la herencia
 */


package polimorfismo;


/* ✅ Se define la clase Animal.
   ✅ Tiene un método sonidoAnimal(), que imprime un mensaje genérico. */

public class Animal { //Se define la clase Animal

    public void sonidoAnimal(){ //Creamos el método sonidoAnimal
        System.out.println("El animal hace un sonido");
    }

}


/* ✅ class Perro extends Animal → Perro hereda de Animal.
   ✅ @Override → Indica que estamos sobrescribiendo el método sonidoAnimal(). */

class Perro extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("El perro hace guau guau");
    }
}

/* ✅ Gato también hereda de Animal y cambia sonidoAnimal() para decir "miau miau". */

class Gato extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("El gato hace miau miau");
    }
}


//Se trata del mismo método pero lo único es que lo cambiamos de forma en esa clase para adaptarlo 
//a las necesidades de la misma.

//Este codigo debe ir en un fichero a parte :

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sonidoAnimal();

        Perro perro1 = new Perro();
        perro1.sonidoAnimal();

        Gato gato1 = new Gato();
        gato1.sonidoAnimal();
    }
}

/* 📌 Explicación por partes
🔹 Perro → Es el tipo de dato (una clase).
🔹 miPerro → Es el nombre de la variable (el objeto que estamos creando).
🔹 new Perro(); → Es la creación de un nuevo objeto de la clase Perro.


//Es como cuando creamos un array:
int[] numeros = new int[5]; 


🛠 En ambos casos, new significa "reserva espacio en memoria y crea una nueva instancia".

Es decir, estamos creando un objeto de la clase Perro y almacenándolo en la variable miPerro.

 */


/* 
✅ public class Main → Declara la clase principal del programa.
✅ public static void main(String[] args) {...} → Método principal donde empieza la ejecución.
✅ Se crean 3 objetos:

animal1 (de tipo Animal) → Llama a sonidoAnimal() de Animal.

perro1 (de tipo Perro) → Llama a sonidoAnimal() de Perro.

gato1 (de tipo Gato) → Llama a sonidoAnimal() de Gato.

📌 Resumen de todo
Creamos una clase Animal con un método sonidoAnimal().

Creamos Perro y Gato, que heredan de Animal, y cambian sonidoAnimal().

En Main, creamos objetos (animal1, perro1, gato1) y llamamos a sus métodos.

El polimorfismo ocurre porque sonidoAnimal() se comporta diferente según la clase.

🔹 Salida en consola

El animal hace un sonido  
El perro hace guau guau  
El gato hace miau miau  
💡 ¡Ahora ya tienes clara la estructura! 🚀



 */ 


                                    //ABSTRACCIÓN

/* 📌 ¿Qué es la abstracción en Java?
La abstracción es un concepto de la Programación Orientada a Objetos (POO) que oculta los detalles
internos de una clase y solo muestra lo esencial.

🔹 ¿Cómo se logra la abstracción?
Se usa la palabra clave abstract para definir una clase abstracta o un método abstracto. */


package abstraccion;


//1️⃣ Clase Animal (Abstracta)

public abstract class Animal {

    public abstract void sonidoAnimal(String nombre); //Creamos un método abstracto (sin cuerpo) aunque sí con parámetros

//⛔ No se pueden crear objetos de una clase abstracta, porque es solo un "molde".

}


//2️⃣ Clases Perro y Gato (Hijas)

class Perro extends Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El perro hace guau guau");
    }
}

class Gato extends Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El Gato hace miau miau");
    }
}


/* 🔹 Ambas heredan de Animal usando extends.
🔹 Deben implementar el método sonidoAnimal(), porque Animal lo definió como abstracto.
🔹 Ahora, cada animal tiene su propia versión del método. 🐶🐱 



Cuando declaras un método como abstract, estás diciendo:

"Toda clase que herede de esta clase debe implementar este método a su manera".

En este caso, Animal es una plantilla y dice:
🗣️ "Todos los animales deben tener un sonido, pero cada uno lo define a su manera."



📌 Dicho de otra forma:

✅ Polimorfismo:

El método en la clase principal tiene cuerpo, pero puedes sobreescribirlo en las clases hijas.

Si no lo sobrescribes, usará el cuerpo de la clase padre.

✅ Abstracción:

El método en la clase principal no tiene cuerpo, lo que significa que las clases hijas están obligadas a implementarlo.

No puedes usarlo tal cual, siempre debes definir su cuerpo en las clases hijas.



💡 Resumen en una frase:
✔ Polimorfismo = "Puedo cambiar el comportamiento del método, pero no estoy obligado".
✔ Abstracción = "Tengo que definir el comportamiento porque no viene dado".



📌 ¿Para qué sirve la abstracción?

1️⃣ Obliga a las clases hijas a implementar ciertos métodos.

Si Perro y Gato no implementan sonidoAnimal(), el código no compilará.

2️⃣ Evita escribir código repetitivo.

La clase Animal actúa como una plantilla para todos los animales.

3️⃣ Facilita el mantenimiento y escalabilidad.

Si en el futuro agregas más animales (Pájaro, León, etc.), solo debes extender Animal y definir el método.







*/


                                        //INTERFACES

/* Una INTERFAZ me permite:


1️⃣ MÉTODOS ABSTRACTOS Y PÚBLICOS ÚNICAMENTE Y TAMBIEN SE PUEDE USAR PARA CONSTANTES


2️⃣HACER CONEXIONES CON BASES DE DATOS (ya que son constantes que las voy a ir llamando de una forma fácil)

*/

//✅ La interfaz actúa como un contrato: todas las clases que implementan Animal deben obligatoriamente
//definir el método sonidoAnimal().

package interfaces;

public interface Animal {
    void sonidoAnimal(String nombre);
}


public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.sonidoAnimal("Michi");

        Perro perro1 = new Perro();
        perro1.sonidoAnimal("Perrito");
    }
}

//Tenemos la obligaciíon de ponerle cuerpo a sonidoAnimal

public class Perro implements Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El Perro hace guau guau "+nombre);
    }
}





public class Gato implements Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El gato hace miau miau" + nombre);
    }
}



/* 🎯 ¿Cuándo usar cada uno?

✔ Polimorfismo: Cuando tienes una jerarquía de clases y quieres reutilizar métodos con comportamiento
 variable.

✔ Abstracción: Cuando quieres una clase base que solo sirva de modelo para otras sin permitir 
instancias directas.

✔ Interfaces: Cuando necesitas que varias clases distintas compartan métodos sin herencia
 (ejemplo: conectar con bases de datos).




Diferencia entre herencia (extends) e interfaces (implements) en Java.

📌 "Extender" (extends) significa que una clase hereda de otra.
📌 "Implementar" (implements) significa que una clase sigue el contrato de una interfaz.









 */




