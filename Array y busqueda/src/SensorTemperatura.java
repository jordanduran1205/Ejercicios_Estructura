// 3. Sensor de Temperatura (Control de Calidad)
//
// Una máquina industrial registra la temperatura cada 10 minutos
// y guarda los datos en un arreglo.
//
// El Problema:
// Al final del día, el supervisor quiere saber cuál fue la
// temperatura más alta registrada para asegurarse de que
// la máquina no se recalentó.
//
// Algoritmo a usar:
// Búsqueda Lineal de Máximo.
// Debemos recorrer todo el arreglo comparando cada valor
// para encontrar el mayor de todos.

public class SensorTemperatura {

    public static void main(String[] args) {

        double[] temperaturas = {65.5, 70.2, 68.9, 72.4, 69.0, 75.1, 71.3};

        double temperaturaMaxima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }
        System.out.println("La temperatura más alta registrada fue: " + temperaturaMaxima + "°C");
    }
}