package videojuegos;

public class VideoJuegos {
    
    private String nombre;//Nombre del videojuego
    private int precioDelJuego;//Precio del juego
    private int descuentoInicialDelJuego;//Descuento en las primeras compras 
    //despues de ser lanzado
    private date fechaDeLanzamiento;//Fecha en la que dio el lanzamiento del juego
    private String nombreDelJugador;//El username del comprador 
    private Boolean juegoLanzado;//Si fue ya lanzado o no 
    private int descuentoPorTarjeta;//un descuento aparte por si la persona tiene
    //puntos en su tarjeta de compra 
    
    //Atributos de composición
    private Ventas cantidadDeVentas = null;
    private Pagos formasDePago;
    
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
        this.descuentoPorTarjeta = descuentoPorTarjeta;
        this.cantidadDeVentas = new Ventas(78, "Samuel");  
    }

    public int getDescuentoPorTarjeta() {
        return descuentoPorTarjeta;
    }

    public void setDescuentoPorTarjeta(int descuentoPorTarjeta) {
        this.descuentoPorTarjeta = descuentoPorTarjeta;
    }

    public Ventas getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(Ventas cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public Pagos getFormasDePago() {
        return formasDePago;
    }

    public void setFormasDePago(Pagos formasDePago) {
        this.formasDePago = formasDePago;
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
     
    //Aquí empieza el método get y set
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
        
        Iva pagado = new Iva(
                "Bancolombia", 
                true);
        
        videoJuego.setFormasDePago(pagado);
        
        System.out.println("Modo de pago:");
        System.out.println(videoJuego.getFormasDePago().getNombre());
        System.out.println("El nombre del comprador es:");
        System.out.println(videoJuego.getCantidadDeVentas().getNombreDelCliente());
        System.out.println("Su numero de venta es:");
        System.out.println(videoJuego.getCantidadDeVentas().getNumeroDeVenta());
        
    }
    
}
