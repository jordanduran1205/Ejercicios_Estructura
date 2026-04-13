import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Torneo torneo = new Torneo();
        int opcion;

        do {
            System.out.println("\n--- MENÚ TORNEO ---");
            System.out.println("1. Agregar Equipo");
            System.out.println("2. Generar Fixture y Simular");
            System.out.println("3. Mostrar Tabla de Posiciones");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del equipo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();
                    torneo.agregarEquipo(nombre, ciudad);
                    break;

                case 2:
                    torneo.generarFixture();
                    break;

                case 3:
                    torneo.mostrarTabla();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}