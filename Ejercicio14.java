// Ejercicio 14 — Ventas por sucursal (lineal)
// Pide las ventas mensuales de 5 sucursales de una cadena de tiendas.
// Muestra:
// - La sucursal con mayor venta
// - La sucursal con menor venta
// - El total de ventas de la cadena
// - El porcentaje que representa cada sucursal del total
//
// Datos de entrada: String nombre de sucursal + double venta × 5

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_SUCURSALES = 5;
        String[] sucursales = new String[NUM_SUCURSALES];
        double[] ventas = new double[NUM_SUCURSALES];

        // Ingreso de datos
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            System.out.print("Nombre de la sucursal " + (i + 1) + ": ");
            sucursales[i] = sc.nextLine();
            System.out.print("Venta mensual de " + sucursales[i] + ": ");
            ventas[i] = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
        }

        // Buscar mayor, menor y total
        int indiceMax = 0;
        int indiceMin = 0;
        double totalVentas = 0;

        for (int i = 0; i < NUM_SUCURSALES; i++) {
            totalVentas += ventas[i];
            if (ventas[i] > ventas[indiceMax]) {
                indiceMax = i;
            }
            if (ventas[i] < ventas[indiceMin]) {
                indiceMin = i;
            }
        }


        System.out.println("\nSucursal con mayor venta: " + sucursales[indiceMax] +  " → " + ventas[indiceMax]);
        System.out.println("Sucursal con menor venta: " + sucursales[indiceMin] + " → " + ventas[indiceMin]);
        System.out.println("Total de ventas de la cadena: " + totalVentas);

        System.out.println("\nPorcentaje que representa cada sucursal del total:");
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            double porcentaje = (ventas[i] / totalVentas) * 100;
            System.out.printf("%s → %.2f%%\n", sucursales[i], porcentaje);
        }

        sc.close();
    }
}