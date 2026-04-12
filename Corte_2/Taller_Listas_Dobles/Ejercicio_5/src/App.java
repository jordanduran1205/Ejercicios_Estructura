import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reproductor reproductor = new Reproductor();
        int opcion;

        do {
            System.out.println("\n--- MENÚ REPRODUCTOR ---");
            System.out.println("1. Agregar Canción");
            System.out.println("2. Mostrar Canción Actual");
            System.out.println("3. Saltar Adelante");
            System.out.println("4. Saltar Atrás");
            System.out.println("5. Listar Canciones");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    reproductor.agregarCancion(titulo, artista, duracion);
                    break;

                case 2:
                    reproductor.mostrarCancionActual();
                    break;

                case 3:
                    reproductor.saltarAdelante();
                    break;

                case 4:
                    reproductor.saltarAtras();
                    break;

                case 5:
                    reproductor.listarCanciones();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}