// 2. Buscador de Cédulas (Base de Datos Bancaria)
// Un banco tiene una lista de 1.000 clientes organizados de forma estricta
// y ascendente por su número de cédula o ID.
//
// El Problema:
// Un cliente llega a la ventanilla y da su número.
// El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//
// Algoritmo a usar: Búsqueda Binaria.
// Como los datos ya están ordenados, este algoritmo permitirá encontrar
// al cliente dividiendo la lista a la mitad en cada paso.
public class BuscadorCedulas {
    public static void main(String[] args) {
        int[] cedulas = {1010, 2030, 3050, 4070, 5090, 6010, 7030, 8050, 9070};

        int cedulaBuscada = 5090;

        int inicio = 0;
        int fin = cedulas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                System.out.println("Cédula encontrada en la posición: " + medio);
                encontrado = true;
                break;
            }

            if (cedulaBuscada < cedulas[medio]) {
                fin = medio - 1;      
            } else {
                inicio = medio + 1;   
            }
        }

        if (!encontrado) {
            System.out.println("Cédula no encontrada.");
        }
        

    }
    
}
