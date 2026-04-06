public class ColaAterrizaje {
    private Vuelo cabeza;
    private Vuelo cola;

    // Insertar vuelo normalmente (al final o al inicio si combustible < 10)
    public void insertarVuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        Vuelo nuevo = new Vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);

        if (combustibleRestante < 10) {
            // Insertar al inicio
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            if (cola == null) {
                cola = nuevo;
            }
        } else {
            // Insertar al final
            if (cabeza == null) {
                cabeza = nuevo;
                cola = nuevo;
            } else {
                cola.siguiente = nuevo;
                cola = nuevo;
            }
        }
    }

    // Método para reportar emergencia y mover vuelo al inicio
    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null || cabeza.numeroVuelo.equals(numeroVuelo)) {
            return;
        }

        Vuelo anterior = null;
        Vuelo actual = cabeza;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null) {
            if (anterior != null) {
                anterior.siguiente = actual.siguiente;
            }
            if (actual == cola) {
                cola = anterior;
            }
            actual.siguiente = cabeza;
            cabeza = actual;
        }
    }

    public void mostrarCola() {
        Vuelo actual = cabeza;
        System.out.println("\nCola de aterrizajes:");
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                               " | Aerolínea: " + actual.aerolinea +
                               " | Combustible: " + actual.combustibleRestante +
                               " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }
}
