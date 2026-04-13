import java.util.*;

public class Torneo {
    private Equipo cabeza;
    private Equipo cola;
    private int numEquipos;

    public Torneo() {
        cabeza = null;
        cola = null;
        numEquipos = 0;
    }

    public void agregarEquipo(String nombre, String ciudad) {
        Equipo nuevo = new Equipo(nombre, ciudad);
        if (cabeza == null) {
            cabeza = cola = nuevo;
            cola.siguiente = cabeza; // circular
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
        numEquipos++;
        System.out.println("Equipo agregado: " + nuevo.nombre);
    }

    public void generarFixture() {
        if (numEquipos != 6) {
            System.out.println("El fixture requiere exactamente 6 equipos.");
            return;
        }

        // Convertimos la lista circular en un arreglo para rotar más fácil
        Equipo[] equipos = new Equipo[numEquipos];
        Equipo temp = cabeza;
        for (int i = 0; i < numEquipos; i++) {
            equipos[i] = temp;
            temp = temp.siguiente;
        }

        int jornadas = numEquipos - 1; // Round Robin clásico
        for (int j = 1; j <= jornadas; j++) {
            System.out.println("\n=== Jornada " + j + " ===");
            for (int i = 0; i < numEquipos / 2; i++) {
                Equipo local = equipos[i];
                Equipo visitante = equipos[numEquipos - 1 - i];
                System.out.println(local.nombre + " vs " + visitante.nombre);

                // Simulación de resultado (aleatorio)
                int golesLocal = (int)(Math.random() * 5);
                int golesVisitante = (int)(Math.random() * 5);
                local.golesFavor += golesLocal;
                visitante.golesFavor += golesVisitante;

                if (golesLocal > golesVisitante) {
                    local.puntos += 3;
                } else if (golesLocal < golesVisitante) {
                    visitante.puntos += 3;
                } else {
                    local.puntos += 1;
                    visitante.puntos += 1;
                }
            }

            // Rotación de equipos (excepto cabeza fija)
            Equipo fijo = equipos[0];
            Equipo ultimo = equipos[numEquipos - 1];
            for (int i = numEquipos - 1; i > 1; i--) {
                equipos[i] = equipos[i - 1];
            }
            equipos[1] = ultimo;
            equipos[0] = fijo;
        }

        mostrarTabla();
    }

    public void mostrarTabla() {
        System.out.println("\n=== TABLA DE POSICIONES ===");
        List<Equipo> lista = new ArrayList<>();
        Equipo temp = cabeza;
        for (int i = 0; i < numEquipos; i++) {
            lista.add(temp);
            temp = temp.siguiente;
        }

        lista.sort((a, b) -> b.puntos - a.puntos);
        for (Equipo e : lista) {
            System.out.println(e);
        }
    }
}