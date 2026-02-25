// Ejercicio 10 — Intercambio de valores
// Pide dos números enteros x e y.
// Intercambia sus valores usando una variable auxiliar temp.
// Muestra los valores antes y después del intercambio.
//
// Datos de entrada: int x, int y
//
// Salida esperada:
//
// Antes  → x=5, y=8
// Después→ x=8, y=5

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingresa el valor de x: ");
        int x = sc.nextInt();

        System.out.print("Ingresa el valor de y: ");
        int y = sc.nextInt();


        System.out.println("\nAntes  -> x=" + x + ", y=" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("Después -> x=" + x + ", y=" + y);

        sc.close();
    }
}