public class Cueva {
    private Estacion cima; 

    public Cueva() {
        cima = null;
    }

    public void colocarEstacion(String nombre, int profundidad, double oxigeno) {
        Estacion nueva = new Estacion(nombre, profundidad, oxigeno);
        nueva.siguiente = cima;
        cima = nueva;
        System.out.println("Estación colocada en la cueva.");
    }

    public void mostrarCueva() {
        if (cima == null) {
            System.out.println("No hay estaciones en la cueva.");
            return;
        }
        Estacion aux = cima;
        System.out.println("=== Estaciones en la cueva ===");
        while (aux != null) {
            System.out.println(aux);
            aux = aux.siguiente;
        }
    }

    public void retrocederASuperficie() {
        if (cima == null) {
            System.out.println("No hay estaciones registradas.");
            return;
        }

        System.out.println("Retrocediendo hacia la superficie...");
        while (cima != null) {
            System.out.println("Pasando por estación: " + cima.nombrePunto);
            if (cima.nivelOxigeno < 18.0) {
                System.out.println("Uso de Tanque de Emergencia Requerido en " + cima.nombrePunto);
            }
            cima = cima.siguiente;
        }
        System.out.println("El equipo ha llegado a la superficie.");
    }
}