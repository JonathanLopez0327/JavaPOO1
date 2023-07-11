import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        for (int i = 0; i < this.productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }

    public String detalleOrden() {
        StringBuilder detalle = new StringBuilder("Descripcion: " + this.getDescripcion() +
                "\nFecha: " + this.getFecha().toString() +
                "\nCliente : " + this.getCliente().getNombre() + " " + this.getCliente().getApellido());

        if(getProductos() != null) {
            detalle.append("\nLista de productos: ");
            for(Producto r : this.getProductos()) {
                detalle.append("\nProducto: " + r.getNombre() + " | Marca: " + r.getMarca() + " | Precio: " + r.getPrecio());
            }
        }
        return detalle.toString();
    }

    public int calucularTotal() {
        int total = 0;
        if(getProductos() != null) {
            for (Producto r : this.getProductos()) {
                total += r.getPrecio();
            }
        }

        return total;
    }
}
