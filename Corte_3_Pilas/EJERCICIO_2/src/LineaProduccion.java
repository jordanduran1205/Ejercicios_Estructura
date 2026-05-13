public class LineaProduccion {
    private Pieza cima; 

    public LineaProduccion() {
        cima = null;
    }

    public void apilarPieza(String nombre, String serie, boolean defectuosa) {
        Pieza nueva = new Pieza(nombre, serie, defectuosa);
        nueva.siguiente = cima;
        cima = nueva;
        System.out.println("Pieza apilada correctamente.");
    }

    public void mostrarPila() {
        if (cima == null) {
            System.out.println("No hay piezas en la pila.");
            return;
        }
        Pieza aux = cima;
        System.out.println("=== Pila de Piezas ===");
        while (aux != null) {
            System.out.println(aux);
            aux = aux.siguiente;
        }
    }

    public void limpiarHastaDefecto() {
        if (cima == null) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Descartando piezas buenas hasta encontrar la defectuosa...");
        while (cima != null) {
            if (cima.esDefectuosa) {
                System.out.println("⚠️ Se encontró pieza defectuosa: " + cima.nombrePieza);
                break;
            } else {
                System.out.println("Pieza descartada: " + cima.nombrePieza);
                cima = cima.siguiente;
            }
        }

        if (cima == null) {
            System.out.println("No se encontró ninguna pieza defectuosa en la pila.");
        }
    }
}