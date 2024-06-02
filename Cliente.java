public class Cliente {
    int ideCliente;
    String nombreCliente;
    
    public Cliente(int ideCliente, String nombreCliente, String metodoDePago) {
        this.ideCliente = ideCliente;
        this.nombreCliente = nombreCliente;
        this.metodoDePago = metodoDePago;
    }
    String metodoDePago;

    public int getIdeCliente() {
        return ideCliente;
    }
    public void setIdeCliente(int ideCliente) {
        this.ideCliente = ideCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getMetodoDePago() {
        return metodoDePago;
    }
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    static void realizarPedido(){
        
    }
}
