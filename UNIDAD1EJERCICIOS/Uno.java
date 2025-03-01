package UNIDAD1EJERCICIOS;

public class Uno {

}



/* 1. En Java generalmente un programa consta de varias clases las cuales se compilan en un único fichero.
Falso.

En Java, cada clase pública debe estar en un archivo independiente que lleve su mismo nombre (por ejemplo, Clase1 debe estar en Clase1.java).
Sin embargo, el programa final (el archivo compilado en bytecode) puede constar de varios archivos .class, uno por cada clase.
Por lo tanto, no se compilan todas las clases en un único fichero, sino en archivos .class separados.

2. El método main puede ser static o no. En caso de no ser static puede haber varios en un mismo programa.
Falso.

El método main debe ser estático (static) para que el programa pueda ejecutarse sin necesidad de instanciar un objeto. Su definición estándar es:
java
Copiar
Editar
public static void main(String[] args)
Si el método main no es estático, el programa no podrá ejecutarse directamente.
Además, puedes tener varios métodos main en diferentes clases, pero no varios métodos main en una misma clase con la misma firma.

3. Los métodos y funciones difieren en Java en que los primeros no devuelven ningún valor.
Falso.

En Java, no hay una diferenciación técnica entre "métodos" y "funciones". Ambos son sinónimos y representan bloques de código que pueden o no devolver valores.
La confusión puede surgir del término void, que indica que un método no devuelve valor. Por ejemplo:
java
Copiar
Editar
public void metodoSinValor() {
    System.out.println("No devuelve nada");
}
public int metodoConValor() {
    return 42;
}
Ambos son métodos en Java, y la diferencia está en si devuelven o no un valor, pero no en la nomenclatura.

4. Es posible hacer byte a = 200;. El único problema es que como una variable byte solamente almacena hasta el valor 127 la variable a valdrá solo 127.
Falso.

No es posible declarar un byte con un valor mayor a 127. Esto generará un error de compilación porque excede el rango permitido para byte (-128 a 127).
Si necesitas asignar el valor 200, debes usar un tipo de dato más grande, como short o int.
Si intentaras forzar la asignación con un cast, el valor sería reducido por desbordamiento, y el resultado no sería 127, sino que el valor quedaría truncado dentro del rango del byte. Por ejemplo:
java
Copiar
Editar
byte a = (byte) 200; // El resultado sería -56 debido al desbordamiento.
System.out.println(a); // Salida: -56
 */