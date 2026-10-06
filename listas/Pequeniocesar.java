package mx.unam.aragon.ico.edd.listas;

public class Pequeniocesar {
    private String pedido;
    private double precio;

    public Pequeniocesar(String pedido, double precio) {
        this.pedido = pedido;
        this.precio = precio;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Little_Ceasers{" +
                "pedido='" + pedido + '\'' +
                ", precio=" + precio +
                '}';
    }
}
