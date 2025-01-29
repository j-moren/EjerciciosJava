//Programa Java que lea un nombre y muestre por pantalla: "Buenos días nombre_Introducido"

import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        //Declaración Variables
        Scanner sc = new Scanner(System.in); 
        String cadena;
        //Leer Nombre Introducido
        System.out.println("Introduce un Nombre: ");
        cadena = sc.nextLine();
        //Mostrar Resultado
        System.out.println("Buenos Dias " + cadena);
    }
}
