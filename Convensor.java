//Una aplicación de cocina necesita convertir unidades:

//- Declara una variable `tazas` (`double`) con la cantidad de tazas de un ingrediente.
//- Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado en otra variable.
//- Convierte también a litros.
//- Muestra las tres medidas por consola.

import java.util.Scanner;
public class Convensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de tazas: ");
        double tazas = sc.nextDouble();

        double mililitros = tazas * 236.588;

        double litros = mililitros / 1000;

        System.out.println("\nCantidad en tazas: " + tazas + " tazas");
        System.out.println("Cantidad en mililitros: " + mililitros + " ml");
        System.out.println("Cantidad en litros: " + litros + " L");

        sc.close();
    }
}
