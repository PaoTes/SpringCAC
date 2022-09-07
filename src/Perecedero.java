public class Perecedero extends  Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar)
    {
        super(nombre, precio);
        this.diasPorCaducar=diasPorCaducar;
    }

    public int getDiasPorCaducar() {

        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {

        this.diasPorCaducar = diasPorCaducar;
    }



    public double calcular(int cantidadDeProductos){
        double precioTotalProducto;
        switch (diasPorCaducar){
            case 1:
                precioTotalProducto= (this.getPrecio()*0.25) * cantidadDeProductos;
                break;
            case 2:
                precioTotalProducto= (this.getPrecio()*0.33) * cantidadDeProductos;
                break;
            case 3:
                precioTotalProducto= (this.getPrecio()*0.50) * cantidadDeProductos;
                break;
            default:
                precioTotalProducto= (this.getPrecio()*1) * cantidadDeProductos;
                break;

        }

        return precioTotalProducto;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                "} " + super.toString();
    }
}
