
/* Ejercicio: Estudia el ejemplo para ver cómo se trabaja a nivel de bit */
 

package UNIDAD1EJERCICIOS;

public class Nueve {
    public static void main(String[] args) {

        byte operando1;
        byte operando2;
        byte resultado;
        // PONER UN BIT A 0
        operando1 = 43; // 0 0 1 0 1 0 1 1 ==>> 43 en binario
        operando2 = 119; // 0 1 1 1 0 1 1 1 ==>> 119 en binario
        // & ----------------------
        resultado = (byte) (operando1 & operando2); // 0 0 1 0 0 0 1 1 ==>> 35 en binario
        System.out.println("PONER UN BIT A 0");
        System.out.println("resultado: "+resultado);
       
        // PONER UN BIT A 1
        operando1 = 43; // 0 0 1 0 1 0 1 1 ==>> 43 en binario
        operando2 = 16; // 0 0 0 1 0 0 0 0 ==>> 16 en binario
        // | ----------------------
        resultado = (byte) (operando1 | operando2);//0 0 1 1 1 0 1 1 ==>>59 en binario
        System.out.println("PONER UN BIT A 1");
        System.out.println("resultado: "+resultado);
       
        // DESPLAZAMIENTO DE BITS HACIA LA DERECHA
        operando1 = 45; // 0 0 1 0 1 1 0 1 ==>> 45 en binario
        // al desplazar todos los bits
        // 2 posiciones hacia la derecha obtenemos
        resultado = (byte) (operando1 >> 2); // 0 0 0 0 1 0 1 1 ==>> 11 en binario
        System.out.println("DESPLAZAMIENTO DE BITS HACIA LA DERECHA");
        System.out.println("resultado: "+resultado);
       
       
        // VISUALIZAR LOS BITS DE UN BYTE
        byte datoAVisualizarBits = 45; // 0 0 1 0 1 1 0 1 ==>> 45 en binario
       
        for (byte i = 64; i >0 ; i = (byte)(i/2)){
        resultado = (byte)(datoAVisualizarBits & i);
        if (resultado > 0)
        System.out.print("1 ");
        else
        System.out.print("0 ");
        }
}
}