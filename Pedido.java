
public class Pedido {
    int idePedido;
    String nombreClientePedido;
    String tipoPedido;
    String fechaDeEntrega;
    String fechaDeRecoleccion;
    int cantidadDeArticulos;
    float costo;

    public Pedido(int idePedido, String nombreClientePedido, String tipoPedido, String fechaDeEntrega,
            String fechaDeRecoleccion, int cantidadDeArticulos, float costo) {
        this.idePedido = idePedido;
        this.nombreClientePedido = nombreClientePedido;
        this.tipoPedido = tipoPedido;
        this.fechaDeEntrega = fechaDeEntrega;
        this.fechaDeRecoleccion = fechaDeRecoleccion;
        this.cantidadDeArticulos = cantidadDeArticulos;
        this.costo = costo;
    }

    public Pedido(int idPedido, String nombreDeQuienEnvia, String tipoPedido2, String descripcion,
            String fechaDeEntrega2, String fechaDeRecoleccion2, int cantidadDeArticulos2, float costo2) {

    }

    public int getIdePedido() {
        return idePedido;
    }

    public void setIdePedido(int idePedido) {
        this.idePedido = idePedido;
    }

    public String getNombreClientePedido() {
        return nombreClientePedido;
    }

    public void setNombreClientePedido(String nombreClientePedido) {
        this.nombreClientePedido = nombreClientePedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public String getFechaDeRecoleccion() {
        return fechaDeRecoleccion;
    }

    public void setFechaDeRecoleccion(String fechaDeRecoleccion) {
        this.fechaDeRecoleccion = fechaDeRecoleccion;
    }

    public int getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    public void setCantidadDeArticulos(int cantidadDeArticulos) {
        this.cantidadDeArticulos = cantidadDeArticulos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Unimplemented method 'setDescripcion'");
    }

    public String getDescripcion() {
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }
    
}
