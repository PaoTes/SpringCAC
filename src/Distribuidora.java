import java.util.ArrayList;
import java.util.Scanner;

public class Distribuidora {
    public static void main(String[] args) {

        double totalFactura=0;
        Scanner teclado = new Scanner(System.in);

        ArrayList<Producto>listaProductos= new ArrayList<>();
        listaProductos.add(new Perecedero("Leche Blanquita", 15.52,1));
        listaProductos.add(new Perecedero("Manteca Lulu", 23.50,3));
        listaProductos.add(new Perecedero("Yogurt Frutillitas", 35,1));
        listaProductos.add(new Perecedero("Queso Cremoso Yumi", 23.50,3));
        listaProductos.add(new Perecedero("Crema Delicias", 28,10));
        listaProductos.add(new NoPerecedero("Yeba Mate", 15.52,"Infusiones"));
        listaProductos.add(new NoPerecedero("Arroz", 23.50,"Fideos"));
        listaProductos.add(new NoPerecedero("Caja de Te", 35,"Infusiones"));
        listaProductos.add(new NoPerecedero("Fideoso Yumi", 23.50,"Pastas Secas"));
        listaProductos.add(new NoPerecedero("Cafe Cito", 28,"Infusiones"));

        //foreach
        for (Producto lista:listaProductos){
            System.out.print("Ingrese la cantidad de "+lista.getNombre()+" : ");
            int cantidadProductos = teclado.nextInt();
            System.out.println(cantidadProductos+"  "+lista.getNombre()+" -  $" +lista.calcular(cantidadProductos));
            totalFactura= totalFactura+lista.calcular(cantidadProductos);
        }
        System.out.println("*************************************************");
        System.out.println("El total de la factura es: $ "+ totalFactura);

    }



}