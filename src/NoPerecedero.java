public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo)
    {
        super(nombre, precio);
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public double calcular(int cantidadDeProductos){
        double precioTotalProducto = this.getPrecio() * cantidadDeProductos;

        return precioTotalProducto;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}
