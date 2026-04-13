public class Anuncio {
    String titulo;
    int duracionSegundos;
    int vecesRepetido;
    String categoria;
    Anuncio siguiente;

    public Anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.vecesRepetido = 0;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Anuncio: " + titulo + " | Duración: " + duracionSegundos + "s | Repetido: " + vecesRepetido + " | Categoría: " + categoria;
    }
}