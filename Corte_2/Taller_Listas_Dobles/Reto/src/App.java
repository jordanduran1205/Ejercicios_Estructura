import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar dato");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Contar nodos");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato: ");
                    int dato = sc.nextInt();
                    lista.insertar(dato);
                    System.out.println("Dato insertado.");
                    break;

                case 2:
                    System.out.println("Lista:");
                    lista.mostrar();
                    break;

                case 3:
                    int total = lista.contarNodos();
                    System.out.println("Cantidad de nodos: " + total);
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
