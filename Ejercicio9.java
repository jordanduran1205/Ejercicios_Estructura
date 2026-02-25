// Ejercicio 9 — String inmutable
// Pide al usuario su nombre.
// Asigna alias = nombre.
// Pide un nuevo alias.
// Muestra que nombre no cambió y explica la inmutabilidad de String con un mensaje en consola.
//
// Datos de entrada: String nombre, String nuevo alias

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();


        String alias = nombre;


        System.out.print("Ingresa un nuevo alias: ");
        alias = sc.nextLine();


        System.out.println("\nnombre = " + nombre + "  ← no cambió");
        System.out.println("alias  = " + alias + "  ← sí cambió");

        System.out.println("\nExplicación:");
        System.out.println("En Java, los String son inmutables.");
        System.out.println("Cuando hicimos alias = nombre, ambos apuntaban al mismo texto.");
        System.out.println("Al asignar un nuevo valor a alias, se creó un nuevo objeto String.");
        System.out.println("El objeto original al que apuntaba nombre no se modificó.");

        sc.close();
    }
}