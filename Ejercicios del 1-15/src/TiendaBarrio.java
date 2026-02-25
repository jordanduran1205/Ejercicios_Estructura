//Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

//- Precio unitario de un producto (`double`)
//- Cantidad comprada (`int`)
//- Descuento aplicado en porcentaje (`double`)
//- Total a pagar después del descuento

//Declara las variables, realiza el cálculo y muestra el resultado por consola.

import java.util.Scanner;

public class TiendaBarrio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precioUnitario;
        int cantidadComprada;
        double descuentoPorcentaje;
        double totalBruto;
        double montoDescuento;
        double totalPagar;

        System.out.print("Ingrese el precio unitario: ");
        precioUnitario = sc.nextDouble();

        System.out.print("Ingrese la cantidad comprada: ");
        cantidadComprada = sc.nextInt();

        System.out.print("Ingrese el descuento (%): ");
        descuentoPorcentaje = sc.nextDouble();

        totalBruto = precioUnitario * cantidadComprada;
        montoDescuento = totalBruto * (descuentoPorcentaje / 100);
        totalPagar = totalBruto - montoDescuento;

        System.out.println("\n=== FACTURA ===");
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidadComprada);
        System.out.println("Descuento: " + descuentoPorcentaje + "%");
        System.out.println("Total a pagar: $" + totalPagar);

        sc.close();
    }
}

