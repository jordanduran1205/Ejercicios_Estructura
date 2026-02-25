//crear un vector double [] precios = new double [5];
//usa un ciclo for y sccaner para pedirle al usuario que ingrese los 5 precios 1 por 1
//tarea a: calcula la suma total de los precios ingresados 
//tarea b: encuentra cual fue el precio mas alto que se ingreso y muestralo
//tarea c: si el total supera los 20.000 muestra un mensaje "!tienes un descuento de 2.000¡"
//resta ese valor y muestra el total final a pagar
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        double[] precios = new double[5];
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        double precioMayor = 0;
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingrese el precio #" + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
            suma += precios[i];
            
            if (precios[i] > precioMayor) {
                precioMayor = precios[i];
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Precio más alto: " + precioMayor);
        
        if (suma > 20000) {
        System.out.println("¡Tienes un descuento de 2.000!");
        suma -= 2000;
        }
        
        System.out.println("Total final a pagar: " + suma);
        
        scanner.close();
        }
    }
