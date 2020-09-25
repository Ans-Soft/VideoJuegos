package videojuegos;


public class VideoJuegos {
    
    private String nombre; 
    private int precioDelJuego;
    private int descuentoInicialDelJuego;
    private date fechaDeLanzamiento;
    private String nombreDelJugador;
    private Boolean juegoLanzado;

    public VideoJuegos(String nombre, 
            int precioDelJuego, 
            int descuentoInicialDelJuego, 
            date fechaDeLanzamiento, 
            String nombreDelJugador, 
            Boolean juegoLanzado) {
        
        this.nombre = nombre;
        this.precioDelJuego = precioDelJuego;
        this.descuentoInicialDelJuego = descuentoInicialDelJuego;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.nombreDelJugador = nombreDelJugador;
        this.juegoLanzado = juegoLanzado;
    }

    /** Este metodo nos permite saber cual es el descuento del juego por las 
     * primeras compras de lanzamiento.
     */
    
    public void lanzamientoDeJuego(){
        this.descuentoInicialDelJuego -= 50;
        this.juegoLanzado = true;
        this.precioDelJuego = 300000;
    }
    
    /** Este metodo nos permite ver el nuevo nombre del jugador despues de 
     * crear su perfil.
     */
    
    public void nuevoUsuario(String nuevoUsuario, 
            String nuevoNombre){
        
        this.nombreDelJugador = nuevoUsuario;
        this.nombre = nuevoNombre;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioDelJuego() {
        return precioDelJuego;
    }

    public void setPrecioDelJuego(int precioDelJuego) {
        this.precioDelJuego = precioDelJuego;
    }

    public int getDescuentoInicialDelJuego() {
        return descuentoInicialDelJuego;
    }

    public void setDescuentoInicialDelJuego(int descuentoInicialDelJuego) {
        this.descuentoInicialDelJuego = descuentoInicialDelJuego;
    }

    public date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombreDelJugador() {
        return nombreDelJugador;
    }

    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }

    public Boolean getJuegoLanzado() {
        return juegoLanzado;
    }

    public void setJuegoLanzado(Boolean juegoLanzado) {
        this.juegoLanzado = juegoLanzado;
    }
    
    

    public static void main(String[] args) {
        VideoJuegos videoJuego = new VideoJuegos("Royal Game", 
                300000, 
                130000, 
                new date(), 
                "AnsTalia", 
                true);
        
        System.out.println(videoJuego.getPrecioDelJuego());  
        System.out.println(videoJuego.getDescuentoInicialDelJuego());
        System.out.println(videoJuego.getJuegoLanzado());
        
        System.out.println(videoJuego.getNombre());
        System.out.println(videoJuego.getNombreDelJugador());
        
        videoJuego.lanzamientoDeJuego();
        
        System.out.println(videoJuego.getPrecioDelJuego());  
        System.out.println(videoJuego.getDescuentoInicialDelJuego());
        System.out.println(videoJuego.getJuegoLanzado());
        
        System.out.println(videoJuego.getNombre());
        System.out.println(videoJuego.getNombreDelJugador());
        
    }
    
}