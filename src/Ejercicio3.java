//Esribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número 

import java.util.*;

public class Ejercicio3 {

    public static void main(String[]args){
        //Declaración de Variables
        Scanner sc = new Scanner(System.in);
        int numero;

        //Leer el número entero y mostrar por consola
        System.out.println("Introduce el Número Entero: ");
        //Leer el número entero por teclado
        numero = sc.nextInt();

        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + "->" + 2*numero) ;
        System.out.println("Triple de " + numero + "->" + 3*numero);

    }

}
