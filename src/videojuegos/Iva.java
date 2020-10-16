package videojuegos;

public class Iva extends Pagos{
    private Boolean realizacion; 
    
    public Iva(String nombre, Boolean realizacion) {
        super(nombre);
        this.realizacion = realizacion;
    }

    public Boolean getRealizacion() {
        return realizacion;
    }

    public void setRealizacion(Boolean realizacion) {
        this.realizacion = realizacion;
    }
}
