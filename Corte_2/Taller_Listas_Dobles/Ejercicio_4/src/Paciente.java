public class Paciente {
    String nombre;
    int edad;
    int nivelUrgencia;
    Paciente siguiente;

    public Paciente(String nombre, int edad, int nivelUrgencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelUrgencia = nivelUrgencia;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Edad: " + edad + " | Urgencia: " + nivelUrgencia;
    }
}