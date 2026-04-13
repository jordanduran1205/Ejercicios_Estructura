public class Proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad; // 1 a 3
    Proceso siguiente;

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Proceso: " + nombre + " | PID: " + pid + " | Tiempo restante: " + tiempoRestante + " | Prioridad: " + prioridad;
    }
}