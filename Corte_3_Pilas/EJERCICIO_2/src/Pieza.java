public class Pieza {
    String nombrePieza;
    String numeroSerie;
    boolean esDefectuosa;
    Pieza siguiente; // enlace al siguiente nodo (pila)

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuosa) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuosa;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Pieza: " + nombrePieza + " | Serie: " + numeroSerie + " | Defectuosa: " + esDefectuosa;
    }
}