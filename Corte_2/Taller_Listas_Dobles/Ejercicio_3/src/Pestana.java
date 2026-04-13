public class Pestana {
    String tituloPagina;
    String url;
    String horaApertura;
    Pestana anterior;
    Pestana siguiente;

    public Pestana(String tituloPagina, String url, String horaApertura) {
        this.tituloPagina = tituloPagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.anterior = null;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Pestaña: " + tituloPagina + " | URL: " + url + " | Hora: " + horaApertura;
    }
}