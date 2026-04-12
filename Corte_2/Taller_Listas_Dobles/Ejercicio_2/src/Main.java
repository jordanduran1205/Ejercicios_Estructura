import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcion;

        do {
            System.out.println("\n--- MENÚ GALERÍA ---");
            System.out.println("1. Agregar Foto");
            System.out.println("2. Mostrar Foto Actual");
            System.out.println("3. Siguiente Foto");
            System.out.println("4. Foto Anterior");
            System.out.println("5. Reproducir Galería");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tamaño en MB: ");
                    double tamano = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Resolución: ");
                    String resolucion = sc.nextLine();
                    galeria.agregarFoto(new Fotografia(nombre, tamano, resolucion));
                    break;

                case 2:
                    galeria.mostrarFotoActual();
                    break;

                case 3:
                    galeria.siguienteFoto();
                    break;

                case 4:
                    galeria.anteriorFoto();
                    break;

                case 5:
                    galeria.reproducirGaleria();
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