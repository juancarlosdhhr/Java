

import java.util.Scanner;

public class Clase7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EJERCICIO 1: CALCULADORA AVANZADA
        // Enunciado:
        // Realizar un programa que solicite dos números enteros y un carácter correspondiente a una operación
        // (+, -, *, /, %) y realice la operación indicada.

        // Pseudocódigo:
        // INICIO
        //   LEER num1
        //   LEER num2
        //   LEER operacion
        //   SEGÚN operacion HACER
        //      '+' → resultado ← num1 + num2
        //      '-' → resultado ← num1 - num2
        //      '*' → resultado ← num1 * num2
        //      '/' → SI num2 ≠ 0 → resultado ← num1 / num2
        //      '%' → resultado ← num1 % num2
        //      OTRO → Mostrar "Operación no válida"
        //   FIN SEGÚN
        //   Mostrar resultado
        // FIN

        System.out.println("Ejercicio 1: Calculadora Avanzada");

        System.out.println("Introduzca el valor de num1: ");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el valor de num2: ");
        int num2 = sc.nextInt();

        System.out.println("Introduzca la operación (+, -, *, /, %): ");
        char operacion = sc.next().charAt(0);

        int resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por 0.");
                    
                }
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Error: Operación no válida.");
                
        }

        System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " = " + resultado);
        System.out.println("--------------------------------------------------");

        // EJERCICIO 2: CLASIFICACIÓN DE TRIÁNGULOS
        // Enunciado:
        // Realizar un programa que solicite tres valores y determine el tipo de triángulo.

        // Pseudocódigo:
        
/* 1. Pedir lado 1
2.Pedir lado 2
3. OPedir lado 3
4.l Comprobar si los 3 lados hacen un triangulo  (lado1+lado2 > lado 3 && lado1 + lado3 > lado2 && lado2 + lado3 >lado1)
5. >Comprobar que triangulo es
6. Si lado = lado2 = Lado 3 ->equilatero
7. Si no lado1 = lado2 o lado1 = lado3 o lado 2 = lado3 -> isosceles
8.Si no se cumple ninguna mostrar por pantalla que se trata de un triangulo escaleno */


        System.out.println("Ejercicio 2: Clasificación de Triángulos");

        System.out.println("Introduzca los cm del lado1: ");
        float lado1 = sc.nextFloat();

        System.out.println("Introduzca los cm del lado2: ");
        float lado2 = sc.nextFloat();

        System.out.println("Introduzca los cm del lado3: ");
        float lado3 = sc.nextFloat();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo.");
        }
        System.out.println("--------------------------------------------------");

        // EJERCICIO 3: DETERMINAR ESTACIÓN DEL AÑO
        // Enunciado:
        // Solicitar una fecha (día y mes) y determinar en qué estación del año cae.

        // Pseudocódigo:
        // INICIO
        //   LEER dia, mes
        //   SEGÚN mes HACER
        //      1, 2 → "Invierno"
        //      3 → SI dia < 21 → "Invierno", SINO → "Primavera"
        //      4, 5 → "Primavera"
        //      6 → SI dia < 21 → "Primavera", SINO → "Verano"
        //      7, 8 → "Verano"
        //      9 → SI dia < 21 → "Verano", SINO → "Otoño"
        //      10, 11 → "Otoño"
        //      12 → SI dia < 21 → "Otoño", SINO → "Invierno"
        // FIN

        System.out.println("Ejercicio 3: Determinar Estación del Año");

        System.out.println("Introduzca el día:");
        int dia = sc.nextInt();

        System.out.println("Introduzca el mes (1-12):");
        int mes = sc.nextInt();

        String estacion;

        switch (mes) {
            case 1: case 2:
                estacion = "Invierno";
                break;
            case 3:
                estacion = (dia < 21) ? "Invierno" : "Primavera";
                break;
            case 4: case 5:
                estacion = "Primavera";
                break;
            case 6:
                estacion = (dia < 21) ? "Primavera" : "Verano";
                break;
            case 7: case 8:
                estacion = "Verano";
                break;
            case 9:
                estacion = (dia < 21) ? "Verano" : "Otoño";
                break;
            case 10: case 11:
                estacion = "Otoño";
                break;
            case 12:
                estacion = (dia < 21) ? "Otoño" : "Invierno";
                break;
            default:
                estacion = "Fecha no válida";
        }

        System.out.println("La estación es: " + estacion);
        System.out.println("--------------------------------------------------");

       /*  Ejercicio 4. Ejercicio con casteo: Identificar el rango de un número double y convertirlo a entero
        Escribe un programa que tome un número double como entrada, verifique en qué rango está 
        (menor que 0, entre 0 y 100, mayor que 100) y luego lo convierta a un int. Si el número tiene decimales, muestra el valor truncado y la diferencia entre el valor original y el truncado */.
        
        
         
                   /*  INICIO
                        1. Pedir un número
                        2. Almacenar el número en una variable de tipo double
                        3. Comprobar si el numero < 0 -> El numero es menor que 0
                        4. Comprobar si el numero esta entre 0 y 100 -> El numero está entre 0 y 100.
                        5. Comprobar si el numero es mayor a 100 -> El numero es mayor a 100
                        6. Converir el numero introducido por el usuario a entero y mostrarlo truncado.
                        7. Mostrar el resultado del numero truncado
                        8. Calculamos la diferencia (La resta) entre los dos numeros el numero introducido por el usuario y el truncado
                        9. Mostrar el resultado de la diferencia
                    FIN */
                
                
                Scanner scn = new Scanner(System.in);
                
                double num, diferencia;
                int entero;
              
                
                System.out.println("Introduzca un valor");
                num = scn.nextDouble(); //4.567
                
                if(num<0){
                    System.out.println("El numero es menor a 0");
                }else if(num>=0 && num<=100){
                    System.out.println("El numero está entre 0 y 100");
                }else{
                    System.out.println("El numero es mayor a 100");
                }
                
                //Convertir el numero a entero
                entero = (int) num; //4.567 -> 4
                System.out.println("El numero truncado es: "+entero);
                
                //Calcular la diferencia
                diferencia = num - entero;
                System.out.println("La diferencia entre el número original y el truncado es: "+diferencia);
                
            }
            
        }



       /*  Ejercicio 5:  Ejercicio con casteo: Simulación de conversión entre tipos
        Escribe un programa que tome un número decimal (por ejemplo, 123.456) y:
        
        Extraiga la parte entera y la parte decimal.
        Convierta el número a un carácter si la parte entera está entre 65 y 90 (rango ASCII para letras mayúsculas).
        Muestre los resultados de las conversiones. */
        
                
                  
        /*
        INICIO
            1. Introducir un numero decimal en una variable de tipo double
            2. Extraer la parte entero. Casteamos a entero. 4.13 -> 4
            3. Imprimos el valor de la parte entera
            4. En una variable de tipo double restamos el numero - parte entera = parte decimal
            5. Comprobar en que rango esta el numero.
            6. Si el numero esta entre 65 y 90 pasar el numero entero a char.
            7. Imprimimos la letra
            8. Si no esta en el rango -> La parte entera no esta en el rango ASCII para letras mayúsculas
        FIN
        */     
        Scanner scn = new Scanner(System.in);
        
        double decimal, parteDecimal;
        int parteEntera;
        char caracter;
        
        
        System.out.println("Introduzca el valor decimal");
        decimal = scn.nextDouble(); 
        
        //Extraemos el valor entero
        parteEntera = (int) decimal;
        System.out.println("La parte entera es: "+parteEntera);
        
        //Extraemos la parte decimal;
        parteDecimal = decimal - parteEntera;
        System.out.println("La parte decimal es: "+parteDecimal);
        
        //Comprobar si el numero esta entre 65-90
        if(parteEntera>=65 && parteEntera<=90){
            caracter = (char) parteEntera;
            System.out.println("La parte entera convertida a caracter es: "+caracter);
        }else{
            System.out.println("La parte entera no está en el rango ASCII para letras mayúsculas");
        }
        
        
        
        
    }
    
}

        


















/* 1. Calculadora avanzada
Escribe un programa que tome dos números y una operación matemática (+, -, *, /, %) como entrada (char).
 Usa un switch para realizar la operación seleccionada. Si la operación no es válida, 
 muestra un mensaje de error.




scanner sc = new scanner system in 
char operacion: //+, -,*,/,%
int num1, num2

systemoutprintln Introduzca ekl valor de num1
num1 = scn.nextInt

systemoputprint Introduzca el valor de num2
num2 = scn. nextInt

systemoutporin Introduzca  +,-,*... dependiendo de la operacion que quieras hacer
operacion = scn.next (). charAt (0) // charAt es un meotdo que coge el caracter que yo quiera

swirttch (operacion){

case '+'; //ponemos comillas simples porque es un char

resultado  = num1+num2;
break;

case '-'
resultado = num1 - num2;

case '/':
resultado = (float) num1 / num2;
break;

case '%': 
resultado = num1 % num2
break;
default:
systemoutprintln "Error"

}

Systemmputprintn (La operacion entre +num1+ operacion + num2+  = +resultado)



}

oreo ejercicioo 2. Clasificación de triángulos
Escribe un programa que lea tres lados de un triángulo y determine si el triángulo es equilátero,
 isósceles o escaleno. Valida también si los lados no forman un triángulo.

1º comprobar que es un triangulo

2º comprobar que tipo de triangulo es

-equilattero todos los lados iguales
-isosceles dos lados iguales
-escaleno 

Inicio:
1. Pedir lado 1
2.Pedir lado 2
3. OPedir lado 3
4.l Comprobar si los 3 lados hacen un triangulo  (lado1+lado2 > lado 3 && lado1 + lado3 > lado2 && lado2 + lado3 >lado1)
5. >Comprobar que triangulo es
6. Si lado = lado2 = Lado 3 ->equilatero
7. Si no lado1 = lado2 o lado1 = lado3 o lado 2 = lado3 -> isosceles
8.Si no se cumple ninguna mostrar por pantalla que se trata de un triangulo escaleno

FIN
float lado1, lado 2, lado 3
Scanner scn = new Scanner syhstemin

systemoutprintl Introduzca los cm del lado1
lado1 = scn.nextFloat();

systemoutprintl Introduzca los cm del lado2
lado2 = scn.nextFloat();

systemoutprintl Introduzca los cm del lado3
lado3 = scn.nextFloat();

//Vamos a comprobar ahora si sojn triangulios: es decvir, que la suma de dos lados debe ser mayor al 3er lado

if (lado1 + lado2) > lado3 && (lado1+lado3)> lado2 && (lado2+lado3) > lado1{
if(lado = lado2 = Lado 3)
Systemputprintl El trtisnagulo es equilatero {


}else if (lado1 == lado 2)|| lado1 ==lado3 ||  lado2 == lado3)
syustemputprint El triangulo es isosceles

}else 
system out printl El triangulo es escaleno


}else 
systemoutprintl Los lados no forman un triangulo

ejercicio 3 Determinar estación del año
Escribe un programa que, dada una fecha (día y mes), determine en qué estación del año se encuentra
 (primavera, verano, otoño, invierno). Usa un switch para manejar los meses y un if para los días de 
 transición (21 de marzo, 21 de junio, 21 de septiembre, 21 de diciembre).

 PSEUDOCODIGO: 
 INICIO:
 1. Introducir un dia
 2. Introducir un mwa
3. Calcular la estacion. Comrpobamos en que mes estamios 1,2 -> Invierno 3,4,5 -> Primavera 
6,7 y 8 -> Verano 9,10 y 11-> otoño y 12-> invierno
4. Dentropm del mes 3 comprobar si dia <21 -> Ivierno, Primavera
5. Dentro del mes 6, comprobar si dia<21-> Primavera, vERANO
6. dENTRO DEL M,ES 9, com,probar si dia <21-> Vearno, otoño
7. Dentrop del mes 12, comprobar si dia <21 -> Otoño, Invierno
8. Si no se cumple ninguna -> Fecha no valida
9. Mostrar finalmente ebn que estacion estamos
FIN



int dia, mes,
String estacion
sacenner scn = new scanner system inm

system out pitnyn IIntroduzca el dia
dia = scn.nextInt();

System-out.printl Introduzca el mes
mes =scn.nextInt()

switch (mes) {

case1:
case2:
estacion ="invierno"
break,
case 3:
if (dia <21) {
estacion= "invierno",
}else {
    estacion = "verano"

}
break;
case4:
case5:
    estacion = "primavera",
    break
    case 6:
    if (dia <21) {  
    estacion = "Primavera",
    break;
case 6:
    if(dia<21) {
    estacion = "Primavera"
    }else{
    estacion ="Verano"
    
    }
break;
case 7:
case 8:
    estacion = "verano"
    break;
    case 9:
    if(dia<21) {
    estacion = verano;
    }else{
    esyacion = otoño}
break;
case 10:
case 11:
    estacion = "Otoño";
    case 12:
        if(dia <21) {
            estacion = otoño}
}else{
    ESTACION = iNVIERNO

}
Break
default:
    estacion = Fecha no valida

}

Suystem out printl Estacion: +estacion;



Ejercicio 4. Ejercicio con casteo: Identificar el rango de un número double y convertirlo a entero
Escribe un programa que tome un número double como entrada, verifique en qué rango está 
(menor que 0, entre 0 y 100, mayor que 100) y luego lo convierta a un int. Si el número tiene decimales, muestra el valor truncado y la diferencia entre el valor original y el truncado.


 /*
            INICIO
                1. Pedir un número
                2. Almacenar el número en una variable de tipo double
                3. Comprobar si el numero < 0 -> El numero es menor que 0
                4. Comprobar si el numero esta entre 0 y 100 -> El numero está entre 0 y 100.
                5. Comprobar si el numero es mayor a 100 -> El numero es mayor a 100
                6. Converir el numero introducido por el usuario a entero y mostrarlo truncado.
                7. Mostrar el resultado del numero truncado
                8. Calculamos la diferencia (La resta) entre los dos numeros el numero introducido por el usuario y el truncado
                9. Mostrar el resultado de la diferencia
            FIN
        
        
        Scanner scn = new Scanner(System.in);
        
        double num, diferencia;
        int entero;
      
        
        System.out.println("Introduzca un valor");
        num = scn.nextDouble(); //4.567
        
        if(num<0){
            System.out.println("El numero es menor a 0");
        }else if(num>=0 && num<=100){
            System.out.println("El numero está entre 0 y 100");
        }else{
            System.out.println("El numero es mayor a 100");
        }
        
        //Convertir el numero a entero
        entero = (int) num; //4.567 -> 4
        System.out.println("El numero truncado es: "+entero);
        
        //Calcular la diferencia
        diferencia = num - entero;
        System.out.println("La diferencia entre el número original y el truncado es: "+diferencia);
        
    }
    
}


Ejercicio 5:  Ejercicio con casteo: Simulación de conversión entre tipos
Escribe un programa que tome un número decimal (por ejemplo, 123.456) y:

Extraiga la parte entera y la parte decimal.
Convierta el número a un carácter si la parte entera está entre 65 y 90 (rango ASCII para letras mayúsculas).
Muestre los resultados de las conversiones.

        /*
        INICIO
            1. Introducir un numero decimal en una variable de tipo double
            2. Extraer la parte entero. Casteamos a entero. 4.13 -> 4
            3. Imprimos el valor de la parte entera
            4. En una variable de tipo double restamos el numero - parte entera = parte decimal
            5. Comprobar en que rango esta el numero.
            6. Si el numero esta entre 65 y 90 pasar el numero entero a char.
            7. Imprimimos la letra
            8. Si no esta en el rango -> La parte entera no esta en el rango ASCII para letras mayúsculas
        FIN
            
        Scanner scn = new Scanner(System.in);
        
        double decimal, parteDecimal;
        int parteEntera;
        char caracter;
        
        
        System.out.println("Introduzca el valor decimal");
        decimal = scn.nextDouble();
        
        //Extraemos el valor entero
        parteEntera = (int) decimal;
        System.out.println("La parte entera es: "+parteEntera);
        
        //Extraemos la parte decimal;
        parteDecimal = decimal - parteEntera;
        System.out.println("La parte decimal es: "+parteDecimal);
        
        //Comprobar si el numero esta entre 65-90
        if(parteEntera>=65 && parteEntera<=90){
            caracter = (char) parteEntera;
            System.out.println("La parte entera convertida a caracter es: "+caracter);
        }else{
            System.out.println("La parte entera no está en el rango ASCII para letras mayúsculas");
        }
        
        
        
        
    }
    
}





















*/


















 */