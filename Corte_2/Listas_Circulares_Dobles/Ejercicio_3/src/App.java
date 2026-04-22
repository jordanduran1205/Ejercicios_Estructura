// Main.java (menú y teclado)
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EditorCapas editor = new EditorCapas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Editor de Capas ===");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Alternar visibilidad");
            System.out.println("5. Eliminar activa");
            System.out.println("6. Mostrar capas");
            System.out.println("7. Simulación del reto");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Visible (true/false): ");
                    boolean vis = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = sc.nextLine();
                    editor.agregarCapa(nombre, vis, tipo);
                    break;
                case 2:
                    editor.subirCapa();
                    break;
                case 3:
                    editor.bajarCapa();
                    break;
                case 4:
                    editor.toggleVisibilidad();
                    break;
                case 5:
                    editor.eliminarActiva();
                    break;
                case 6:
                    editor.mostrarCapas();
                    break;
                case 7:
                    editor.agregarCapa("Fondo", true, "fondo");
                    editor.agregarCapa("Imagen1", true, "objeto");
                    editor.agregarCapa("TextoPrincipal", true, "texto");
                    editor.agregarCapa("Logo", true, "objeto");
                    editor.capaActiva = editor.cabeza.siguiente.siguiente;
                    editor.subirCapa();
                    editor.toggleVisibilidad();
                    editor.eliminarActiva();
                    System.out.println("\n=== Estado Final de Capas ===");
                    editor.mostrarCapas();
                    break;
            }
        } while (opcion != 0);
    }
}