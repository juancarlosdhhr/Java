public class POO {
    


public class Cuenta {
    //Atributos: modificador de acceso(public/private) + tipo + nombre;
    //Encapsulación: Atributos privado y métodos publicos getters y setters
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Métodos constructores: public Nombre de la Clase(){}
    //Parámetros, por defecto, copia
    //donde lo quiero = lo que quiero guardar
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }


    //Métodos getters y setters

    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Resto de métodos

}

}




//ESTE CODIGO SE DEBE METER EN UNA CLASE DISTINTA EN UN FICHERO A PARTE

package cuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //POO -> Paradigma de la programación
        //Clase -> Lugar donde definamos las características y los comportamientos de mi objeto
        //Atributos -> Caracteristicas de mi objeto
        //Métodos -> Comportamientos de mi objeto

        //Objeto: Nombre de la clase + nombre del objeto = new nombre del constructor()
        Cuenta c1 = new Cuenta("Pepe","ES8476373",0.98,1000);
        Cuenta c2 = new Cuenta("Pepa","ES837363",0.1,1000);
        Scanner scn = new Scanner(System.in);

        System.out.println(c1.getNombreCliente());
        System.out.println(c2.getNombreCliente());
        System.out.println(c1);

        int n = 5;
        n = 10;

    }
}

// MEJOR EXPLICADO:


public class Cuenta {
    // Atributos: lo que tendrá la clase (son como las características de una cuenta bancaria)
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    // Constructor: inicializa el objeto (le da valor a los atributos)
    public Cuenta(String nombreCliente, String numeroCuenta, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos: son como las acciones o comportamientos que el objeto puede hacer
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters (si quiero cambiar el valor de algún atributo más tarde)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


Crea la clase: Definas los atributos de la clase, que son las características del objeto. Ejemplo: String nombreCliente;, String numeroCuenta;, etc.

Crea el constructor: El constructor es un método especial que se usa para crear objetos de esa clase. Dentro del constructor, le dices al programa qué hacer con los valores que le pasas como parámetros y los asocias a los atributos de la clase. Aquí es donde usas this para diferenciar el atributo de la clase y el parámetro que pasas.

El parámetro es el valor que el usuario o el programa le pasa al objeto cuando lo creas.
El atributo es la propiedad interna del objeto que vas a almacenar.
El this: Es el mecanismo que le indica al programa que el valor del parámetro debe asociarse con el atributo de la clase.

Por ejemplo, en este constructor:

java
Copiar código
public Cuenta(String cliente, String cuenta, double saldo) {
    this.nombreCliente = cliente; // Asocia el valor del parámetro 'cliente' con el atributo 'nombreCliente'
    this.numeroCuenta = cuenta;   // Asocia el valor del parámetro 'cuenta' con el atributo 'numeroCuenta'
    this.saldo = saldo;           // Asocia el valor del parámetro 'saldo' con el atributo 'saldo'
}
String cliente: Es el parámetro que se pasa cuando se crea un objeto de la clase Cuenta.
this.nombreCliente: Es el atributo de la clase, el cual almacena el valor del nombre del cliente.
Entonces, cuando creas un objeto de la clase Cuenta como:


Cuenta c1 = new Cuenta("Pepe", "ES8476373", 1000);
El constructor recibe esos valores y los asigna a los atributos del objeto c1, así:

this.nombreCliente = "Pepe";
this.numeroCuenta = "ES8476373";
this.saldo = 1000;

Resumen final:
Clase: Es el molde o plantilla.
Atributos: Son las características de un objeto (por ejemplo, nombreCliente, numeroCuenta).
Constructor: Es donde asocias los valores de los parámetros con los atributos de la clase usando this.