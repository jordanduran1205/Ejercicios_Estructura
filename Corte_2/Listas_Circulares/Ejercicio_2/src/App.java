import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pantalla pantalla = new Pantalla();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PANTALLA DIGITAL ---");
            System.out.println("1. Agregar Anuncio");
            System.out.println("2. Listar Anuncios");
            System.out.println("3. Reproducir Ciclos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();
                    pantalla.agregarAnuncio(titulo, duracion, categoria);
                    break;

                case 2:
                    pantalla.listarAnuncios();
                    break;

                case 3:
                    System.out.print("Número de ciclos: ");
                    int ciclos = sc.nextInt();
                    pantalla.reproducir(ciclos);
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