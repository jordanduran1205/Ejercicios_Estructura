import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cueva cueva = new Cueva();
        int opcion;

        do {
            System.out.println("\n=== MENU RUTA DE RESCATE ===");
            System.out.println("1. Colocar estación");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre de la estación: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese profundidad (m): ");
                    int profundidad = sc.nextInt();
                    System.out.print("Ingrese nivel de oxígeno (%): ");
                    double oxigeno = sc.nextDouble();
                    sc.nextLine();
                    cueva.colocarEstacion(nombre, profundidad, oxigeno);
                    break;

                case 2:
                    cueva.mostrarCueva();
                    break;

                case 3:
                    cueva.retrocederASuperficie();
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