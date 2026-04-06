public class HistorialLecturas {
    private Lectura cabeza;

    public void agregarLectura(int idSensor, double temperatura, double presion, String hora) {
        Lectura nueva = new Lectura(idSensor, temperatura, presion, hora);
        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    public void mostrarLecturas() {
        Lectura actual = cabeza;
        System.out.println("\nHistorial de lecturas:");
        while (actual != null) {
            System.out.println("Sensor: " + actual.idSensor +
                               " | Temp: " + actual.temperatura +
                               " | Presión: " + actual.presion +
                               " | Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

    public void mostrarLecturaMaximaTemperatura() {
        if (cabeza == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura actual = cabeza;
        Lectura maxTemp = cabeza;

        while (actual != null) {
            if (actual.temperatura > maxTemp.temperatura) {
                maxTemp = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\nLectura con mayor temperatura registrada:");
        System.out.println("Sensor: " + maxTemp.idSensor +
                           " | Temp: " + maxTemp.temperatura +
                           " | Presión: " + maxTemp.presion +
                           " | Hora: " + maxTemp.hora);
    }
}