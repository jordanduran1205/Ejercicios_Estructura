import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistorialLecturas historial = new HistorialLecturas();

        System.out.print("¿Cuántas lecturas desea ingresar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese datos de la lectura " + (i+1) + ":");
            System.out.print("ID del sensor: ");
            int idSensor = sc.nextInt();

            System.out.print("Temperatura: ");
            double temperatura = sc.nextDouble();

            System.out.print("Presión: ");
            double presion = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Hora (ejemplo 14:00): ");
            String hora = sc.nextLine();

            historial.agregarLectura(idSensor, temperatura, presion, hora);
        }

        historial.mostrarLecturas();

        historial.mostrarLecturaMaximaTemperatura();

        sc.close();
    }
}