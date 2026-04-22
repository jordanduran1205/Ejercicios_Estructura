// Main.java (menú y teclado)
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Galeria galeria = new Galeria();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Galería de Fotos ===");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente foto");
            System.out.println("3. Anterior foto");
            System.out.println("4. Alternar favorita");
            System.out.println("5. Eliminar actual");
            System.out.println("6. Mostrar galería");
            System.out.println("7. Simulación del reto");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();
                    System.out.print("Favorita (true/false): ");
                    boolean fav = sc.nextBoolean();
                    sc.nextLine();
                    galeria.agregarFoto(titulo, fecha, fav);
                    break;
                case 2:
                    galeria.siguiente();
                    break;
                case 3:
                    galeria.anterior();
                    break;
                case 4:
                    galeria.toggleFavorita();
                    break;
                case 5:
                    galeria.eliminarActual();
                    break;
                case 6:
                    galeria.mostrarGaleria();
                    break;
                case 7:
                    galeria.agregarFoto("Playa", "2024-01-01", false);
                    galeria.agregarFoto("Montaña", "2024-02-01", false);
                    galeria.agregarFoto("Ciudad", "2024-03-01", false);
                    galeria.agregarFoto("Bosque", "2024-04-01", false);
                    galeria.agregarFoto("Desierto", "2024-05-01", false);
                    galeria.siguiente();
                    galeria.siguiente();
                    galeria.toggleFavorita();
                    galeria.anterior();
                    galeria.eliminarActual();
                    System.out.println("\n=== Estado Final de la Galería ===");
                    galeria.mostrarGaleria();
                    break;
            }
        } while (opcion != 0);
    }
}