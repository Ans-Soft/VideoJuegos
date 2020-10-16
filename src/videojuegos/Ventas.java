package videojuegos;

class Ventas {
    private int numeroDeVenta;
    private String nombreDelCliente;

    public Ventas(int numeroDeVenta, String nombreDelCliente){
        this.numeroDeVenta = numeroDeVenta; 
        this.nombreDelCliente = nombreDelCliente;
    }

    Ventas(int i) {
    }

    public int getNumeroDeVenta() {
        return numeroDeVenta;
    }

    public void setNumeroDeVenta(int numeroDeVenta) {
        this.numeroDeVenta = numeroDeVenta;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }
}
