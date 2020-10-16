package videojuegos;

public class Cuotas extends VideoJuegos {
    private int cantidadDeCuotas;
    private Boolean cuotas;
    
    public Cuotas(String nombre, int precioDelJuego, int descuentoInicialDelJuego, date fechaDeLanzamiento, String nombreDelJugador, Boolean juegoLanzado) {
        super(nombre, precioDelJuego, descuentoInicialDelJuego, fechaDeLanzamiento, nombreDelJugador, juegoLanzado);
    }
    
}
