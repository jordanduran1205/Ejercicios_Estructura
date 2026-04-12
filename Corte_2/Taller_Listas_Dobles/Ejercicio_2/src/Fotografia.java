public class Fotografia {
    private String nombreArchivo;
    private double tamanoMB;
    private String resolucion;

    public Fotografia(String nombreArchivo, double tamanoMB, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.tamanoMB = tamanoMB;
        this.resolucion = resolucion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return "Foto: " + nombreArchivo + " | Tamaño: " + tamanoMB + " MB | Resolución: " + resolucion;
    }
}