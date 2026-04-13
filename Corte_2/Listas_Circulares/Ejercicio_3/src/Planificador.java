import java.util.ArrayList;

public class Planificador {
    private Proceso cabeza;
    private Proceso cola;

    public Planificador() {
        cabeza = null;
        cola = null;
    }

    public void agregarProceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        Proceso nuevo = new Proceso(nombre, pid, tiempoRestante, prioridad);
        if (cabeza == null) {
            cabeza = cola = nuevo;
            cola.siguiente = cabeza; // circular
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
        System.out.println("Proceso agregado: " + nuevo);
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos en la lista.");
            return;
        }

        ArrayList<String> ordenFinalizados = new ArrayList<>();
        Proceso actual = cabeza;

        while (cabeza != null) {
            System.out.println("\n▶ Ejecutando: " + actual.nombre + " (PID " + actual.pid + ")");
            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante > 0) {
                System.out.println("Tiempo restante: " + actual.tiempoRestante);
                actual = actual.siguiente;
            } else {
                System.out.println("Proceso " + actual.nombre + " terminado.");
                ordenFinalizados.add(actual.nombre);

                // Eliminar nodo de la lista circular
                if (actual == cabeza && actual == cola) {
                    cabeza = cola = null;
                    break;
                } else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                } else {
                    Proceso temp = cabeza;
                    while (temp.siguiente != actual) {
                        temp = temp.siguiente;
                    }
                    temp.siguiente = actual.siguiente;
                    if (actual == cola) {
                        cola = temp;
                    }
                    actual = actual.siguiente;
                }
            }
        }

        System.out.println("\n=== ORDEN DE FINALIZACIÓN ===");
        for (int i = 0; i < ordenFinalizados.size(); i++) {
            System.out.println((i + 1) + ". " + ordenFinalizados.get(i));
        }
    }

    public void listarProcesos() {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }
        Proceso temp = cabeza;
        System.out.println("\n--- Lista de Procesos ---");
        do {
            System.out.println(temp);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}