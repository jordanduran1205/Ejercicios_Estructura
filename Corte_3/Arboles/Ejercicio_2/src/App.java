import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CatalogoBST catalogo = new CatalogoBST();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Catálogo Digital Biblioteca ---");
            System.out.println("1. Insertar libro");
            System.out.println("2. Verificar ISBN");
            System.out.println("3. Imprimir catálogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ISBN: ");
                    long isbn = sc.nextLong();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = sc.nextInt();

                    if (catalogo.existeISBN(isbn)) {
                        System.out.println("⚠️ El ISBN ya existe en el catálogo.");
                    } else {
                        catalogo.insertar(isbn, titulo, autor, anio);
                        System.out.println("✅ Libro insertado correctamente.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese ISBN a verificar: ");
                    long buscar = sc.nextLong();
                    if (catalogo.existeISBN(buscar)) {
                        System.out.println("✔ El ISBN existe en el catálogo.");
                    } else {
                        System.out.println("❌ El ISBN no está registrado.");
                    }
                    break;

                case 3:
                    System.out.println("\n📖 Catálogo completo:");
                    catalogo.imprimirCatalogo();
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