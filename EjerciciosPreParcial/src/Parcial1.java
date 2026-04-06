
//Objetivo Gest6ionar Vehiculos con poo y busqueda 
//clase vehiculo con cahis int, marca string y precio double 
//entrada pide datos de 5 vehiculos y guardalos en vehiculo[]
//usa shell sort para ordenar ascendente 
//busqueda pide un chasis y buscalo en busqueda binaria muestra la marca y precio
//maximo indica el modelo de vehiculo mas costoso 
//ejemplo
//chasis: 4502 | marca: Toyota | $25000
//----INVENTARIO POR CHASIS----
//1002: Mazda | 4501: Toyota
import java.util.Scanner;

class Vehiculo {
    int chasis;
    String marca;
    double precio;

    public Vehiculo(int chasis, String marca, double precio) {
        this.chasis = chasis;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Chasis: " + chasis + " | Marca: " + marca + " | $" + precio;
    }
}

public class Parcial1 {
    public static void shellSort(Vehiculo[] v) {
        int n = v.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Vehiculo temp = v[i];
                int j;
                for (j = i; j >= gap && v[j - gap].chasis > temp.chasis; j -= gap) {
                    v[j] = v[j - gap];
                }
                v[j] = temp;
            }
        }
    }

    public static int busquedaBinaria(Vehiculo[] v, int chasis) {
        int inicio = 0, fin = v.length - 1;
        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            if (v[mid].chasis == chasis) return mid;
            if (v[mid].chasis < chasis) inicio = mid + 1;
            else fin = mid - 1;
        }
        return -1;
    }

    public static Vehiculo maximo(Vehiculo[] v) {
        Vehiculo max = v[0];
        for (Vehiculo ve : v) {
            if (ve.precio > max.precio) {
                max = ve;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] inventario = new Vehiculo[5];

        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Ingrese chasis, marca y precio del vehículo " + (i + 1) + ":");
            int chasis = sc.nextInt();
            String marca = sc.next();
            double precio = sc.nextDouble();
            inventario[i] = new Vehiculo(chasis, marca, precio);
        }

        shellSort(inventario);

        System.out.println("---- INVENTARIO POR CHASIS ----");
        for (Vehiculo v : inventario) {
            System.out.println(v.chasis + ": " + v.marca);
        }

        Vehiculo costoso = maximo(inventario);
        System.out.println("Vehiculo más costoso: " + costoso);

        System.out.print("Ingrese chasis a buscar: ");
        int buscar = sc.nextInt();
        int pos = busquedaBinaria(inventario, buscar);

        if (pos != -1) {
            System.out.println("Encontrado -> " + inventario[pos]);
        } else {
            System.out.println("Chasis no encontrado.");
        }
        sc.close();
    }
}