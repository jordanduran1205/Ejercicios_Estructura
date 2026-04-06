import java.util.Scanner;

class Producto {
    int id;
    String nombre;
    double precio;
    int stock;

    Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Precio: " + precio + " | Stock: " + stock;
    }
}

public class Inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[5];

        System.out.println("--- REGISTRO DE PRODUCTOS ---");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.print("Ingrese ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese Precio: ");
            double precio = sc.nextDouble();
            System.out.print("Ingrese Stock: ");
            int stock = sc.nextInt();
            productos[i] = new Producto(id, nombre, precio, stock);
            for (int gap = (i + 1) / 2; gap > 0; gap /= 2) {
                for (int k = gap; k <= i; k++) {
                    Producto temp = productos[k];
                    int j = k;
                    while (j >= gap && productos[j - gap].id > temp.id) {
                        productos[j] = productos[j - gap];
                        j -= gap;
                    }
                    productos[j] = temp;
                }
            }

            System.out.println("\n--- INVENTARIO PARCIAL ORDENADO POR ID ---");
            for (int t = 0; t <= i; t++) {
                System.out.println(productos[t]);
            }
            System.out.println(); 
        }

        for (int gap = productos.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < productos.length; i++) {
                Producto temp = productos[i];
                int j = i;
                while (j >= gap && productos[j - gap].id > temp.id) {
                    productos[j] = productos[j - gap];
                    j -= gap;
                }
                productos[j] = temp;
            }
        }

        System.out.println("\n--- INVENTARIO ORDENADO POR ID (Shell Sort) ---");
        for (Producto p : productos) System.out.println(p);

        System.out.println("\n--- BÚSQUEDA DE PRODUCTO ---");
        System.out.print("Ingrese el ID a buscar: ");
        int idBuscado = sc.nextInt();
        int inicio = 0, fin = productos.length - 1, pos = -1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (productos[medio].id == idBuscado) { pos = medio; break; }
            if (productos[medio].id < idBuscado) inicio = medio + 1;
            else fin = medio - 1;
        }

        if (pos != -1) {
            Producto p = productos[pos];
            System.out.println(">> PRODUCTO ENCONTRADO: " + p.nombre + " - Precio: $" + p.precio + " - Stock: " + p.stock);
        } else {
            System.out.println(">> PRODUCTO NO ENCONTRADO");
        }

        sc.close();
    }
}

