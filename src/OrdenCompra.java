import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;
    private int cantProductos;

    public OrdenCompra(String descripcion){
        this.identificador = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        if(cantProductos < this.productos.length){
            this.productos[cantProductos++] = producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return total;
    }

}
