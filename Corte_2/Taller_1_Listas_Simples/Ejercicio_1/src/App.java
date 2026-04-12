import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaInventario inventario = new ListaInventario();
        int opcion;

        do {
            System.out.println("\n=== MENÚ INVENTARIO DE ALIMENTOS ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario completo");
            System.out.println("3. Mostrar productos por vencer (<5 días)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    inventario.insertarProducto(nombre, cantidad, dias);
                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    inventario.mostrarInventario();
                    break;

                case 3:
                    inventario.mostrarProductosPorVencer();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
