//El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

//- Placa (`String`)
//- Año de fabricación (`int`)
//- Cilindraje en cc (`int`)
//- Precio de compra (`double`)
//- Inicial del color (`char`)
//- Si tiene SOAT vigente (`boolean`)
//Muestra todos los datos en consola.

import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la placa: ");
        String placa = sc.nextLine();

        System.out.print("Ingrese el año de fabricación: ");
        int anioFabricacion = sc.nextInt();

        System.out.print("Ingrese el cilindraje en cc: ");
        int cilindraje = sc.nextInt();

        System.out.print("Ingrese el precio de compra: ");
        double precioCompra = sc.nextDouble();

        System.out.print("Ingrese la inicial del color: ");
        char inicialColor = sc.next().charAt(0);

        System.out.print("¿Tiene SOAT vigente? (true/false): ");
        boolean tieneSOAT = sc.nextBoolean();

        System.out.println("\nDatos del Carro:");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: $" + precioCompra);
        System.out.println("Inicial del color: " + inicialColor);
        System.out.println("SOAT vigente: " + (tieneSOAT ? "Sí" : "No"));

        sc.close();
    }
}