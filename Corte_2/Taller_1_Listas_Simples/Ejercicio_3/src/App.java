import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaAterrizaje cola = new ColaAterrizaje();

        System.out.print("¿Cuántos vuelos desea ingresar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese datos del vuelo " + (i+1) + ":");
            System.out.print("Número de vuelo: ");
            String numeroVuelo = sc.nextLine();

            System.out.print("Aerolínea: ");
            String aerolinea = sc.nextLine();

            System.out.print("Combustible restante: ");
            int combustible = sc.nextInt();

            System.out.print("Cantidad de pasajeros: ");
            int pasajeros = sc.nextInt();
            sc.nextLine(); 

            cola.insertarVuelo(numeroVuelo, aerolinea, combustible, pasajeros);
        }

        cola.mostrarCola();

        System.out.print("\nIngrese el número de vuelo en emergencia: ");
        String emergencia = sc.nextLine();
        cola.reportarEmergencia(emergencia);

        cola.mostrarCola();

        sc.close();
    }
}
