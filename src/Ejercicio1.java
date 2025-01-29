//Programa Java que lea dos Números enteros por teclado y los muestre en pantalla

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args){
//Declaración de Variables
int n1, n2;

Scanner sc = new Scanner(System.in);
//Leer el Primer Número
System.out.println("Introduce un Número Entero: ");
n1 = sc.nextInt(); //Lee un Entero por Teclado
//Leer el segundo Número
System.out.println("Introduce otro Número Entero: ");
n2 = sc.nextInt(); //Lee un Entero por Teclado
//Mostrar Resultado
System.out.println("Ha Introducido los Números: "+ n1 +" y " + n2);

    }
        
}
