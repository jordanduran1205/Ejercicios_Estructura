//Organizar gastos mensuales
//entrada pedir 6 montos de gastos double y guardalos en un arreglo
//ordenamiento usa burbuja bubble sort pero puedo usar el mas facil
//busqueda pide un monto y buscalo con busqueda lineal
//calculo muestra el total acumulado de todos los gastos 
//ejemplo de consola 
// gasto 1: 45.59 | gastos 2: 142.84
//---Gastos ordenados---
//[12.34, 45.50, 1200.00...]
import java.util.Arrays;
import java.util.Scanner;

public class Parcial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[6];

        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese gasto " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
        }
//selection sort
        for (int i = 0; i < gastos.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < gastos.length; j++) {
                if (gastos[j] < gastos[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = gastos[i];
            gastos[i] = gastos[minIndex];
            gastos[minIndex] = temp;
            
        }
        System.out.println("\n--- Gastos ordenados ---");
        System.out.println(Arrays.toString(gastos));

        double total = 0;
        for (double g : gastos) {
            total += g;
        }
        System.out.println("Total acumulado: " + total);

// Búsqueda lineal
        System.out.print("\nIngrese un monto a buscar: ");
        double buscar = sc.nextDouble();
        boolean encontrado = false;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] == buscar) {
                System.out.println("Monto encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Monto no encontrado en los gastos.");
        }
        sc.close();
    }
}