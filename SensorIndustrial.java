//Un sensor industrial registra temperaturas. El sistema recibe:

//- Temperatura actual en Celsius (`double`)
//- Nombre del sensor (`String`)
//- Número de lectura (`int`)
//- Si la temperatura supera el límite de 80°C, una variable `boolean` llamada `enAlarma` debe ser `true`.
//Imprime el estado del sensor con todos sus datos.

import java.util.Scanner;
public class SensorIndustrial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperaturaActual;
        String nombreSensor;
        int numeroLectura;
        boolean enAlarma;

        System.out.print("Ingrese el nombre del sensor: ");
        nombreSensor = sc.nextLine();

        System.out.print("Ingrese el número de lectura: ");
        numeroLectura = sc.nextInt();

        System.out.print("Ingrese la temperatura actual (°C): ");
        temperaturaActual = sc.nextDouble();

        enAlarma = temperaturaActual > 80;

        System.out.println("\n=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura actual: " + temperaturaActual + " °C");
        System.out.println("¿En alarma?: " + enAlarma);

        sc.close();
    }
}