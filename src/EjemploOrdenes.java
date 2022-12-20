import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra oc1 = new OrdenCompra("Golosinas");
        oc1.setCliente(new Cliente("Elmos", "Quito"));
        oc1.setFecha(new Date());
        oc1.addProducto(new Producto("Terrabusi", "Alfajores", 250));
        oc1.addProducto(new Producto("Sugus", "Caramelos Confitados",200));
        oc1.addProducto(new Producto("Coffler", "Chocolate Block", 300));
        oc1.addProducto(new Producto("Bazooka", "Chicles", 100));

        OrdenCompra oc2 = new OrdenCompra("Electrodomésticos");
        oc2.setCliente(new Cliente("Elba", "Nanita"));
        oc2.setFecha(new Date());
        oc2.addProducto(new Producto("Atma", "Tostadora", 6999));
        oc2.addProducto(new Producto("Elextrolux", "Cafetera", 9999));
        oc2.addProducto(new Producto("Samsung", "Aspiradora", 29999));
        oc2.addProducto(new Producto("Whirpool", "Lavarropas", 125999));

        OrdenCompra oc3 = new OrdenCompra("Articulos Libreria");
        oc3.setCliente(new Cliente("Cata", "Pulta"));
        oc3.setFecha(new Date());
        oc3.addProducto(new Producto("Ledesma", "Resma A4", 1400));
        oc3.addProducto((new Producto("Voligoma", "Adhesivo sintético pack x5", 1000)));
        oc3.addProducto(new Producto("BIC", "Biromes x25", 3000));
        oc3.addProducto(new Producto("Faber Castell", "Lapiz Negro HB x 10", 2000));

        OrdenCompra[] ordenes = {oc1, oc2, oc3};
        for(OrdenCompra oc: ordenes){
            System.out.println("Número de Venta: " + oc.getIdentificador());
            System.out.println("Descripción: " + oc.getDescripcion());
            System.out.println("Fecha de Venta: " + oc.getFecha());
            System.out.println("Cliente: " + oc.getCliente());

            int i = 1;
            for (Producto p: oc.getProductos()){
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + ", $" + p.getPrecio() + ".-");
                i++;
            }
            System.out.println("Monto Total de la Venta: $" + oc.getGranTotal() + ".-");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println();
        }
    }
}
