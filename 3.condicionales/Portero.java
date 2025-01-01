public class Portero {
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
}


//Otra forma de hacerlo:


public class Portero {
    public static void main(String [] args){
        //EDAD
        Scanner sc = new Scanner(System.in);
        System.out.println("Alto ahí, enseñeme el DNI");
        int edad = sc.nextInt();
        //CONTRASEÑA
        System.out.println("¿Y la contraseña?");
        String secretPassword = sc.nextLine();

if(edad > 0 && edad < 18) {
System.out.println("No puedes entrar hasta que cumplas 18 años");

} else if (edad >= 18 && edad <= 60){
System.out.println("Adelante, disfrute de la velada");

} else if (edad > 60 && edad <= 122){
System.out.println("Pase usted a la zona con asientos para que no se haga daño");

} else {
System.out.println("Tira por ahí");

}
//Por buena práctica cerramos el scanner para que detenga su ejecición
sc.close();

    }
}
