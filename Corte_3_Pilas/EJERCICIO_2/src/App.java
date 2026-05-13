import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LineaProduccion linea = new LineaProduccion();
        int opcion;

        do {
            System.out.println("\n=== MENU LINEA DE PRODUCCION ===");
            System.out.println("1. Apilar pieza");
            System.out.println("2. Mostrar pila de piezas");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre de la pieza: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese número de serie: ");
                    String serie = sc.nextLine();
                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defectuosa = sc.nextBoolean();
                    sc.nextLine();
                    linea.apilarPieza(nombre, serie, defectuosa);
                    break;

                case 2:
                    linea.mostrarPila();
                    break;

                case 3:
                    linea.limpiarHastaDefecto();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}