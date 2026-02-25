// Ejercicio 13 — Buscar en lista (lineal)
// Pide al usuario 5 nombres de empleados para llenar un arreglo.
// Luego pide el nombre que desea buscar.
// Recorre el arreglo y muestra si el empleado fue encontrado y en qué posición.
//
// Datos de entrada: String × 5 nombres, String nombre a buscar
//
// Salida esperada:
//
// "María" encontrada en la posición 2.

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[5];


        System.out.println("Ingresa los nombres de 5 empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
        }


        System.out.print("\nIngresa el nombre a buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;


        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("\n\"" + nombreBuscar + 
                                   "\" encontrada/o en la posición " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n\"" + nombreBuscar + "\" no fue encontrado/a en la lista.");
        }

        sc.close();
    }
}