import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra ordenCompra1 = new OrdenCompra("Orden de compra 1");
        ordenCompra1.setFecha(new Date(1230768000000L));
        ordenCompra1.setCliente(new Cliente("Pepe", "Cadena"));

        Producto producto1 = new Producto("Teclado Mecanico", "Magegee", 2500);
        Producto producto2 = new Producto("Mouse RGB", "Logitech", 1700);
        Producto producto3 = new Producto("Headphones Wireless", "Fantech", 3500);
        Producto producto4 = new Producto("Mousepad", "Xtrike", 300);

        ordenCompra1.addProducto(producto1);
        ordenCompra1.addProducto(producto2);
        ordenCompra1.addProducto(producto3);
        ordenCompra1.addProducto(producto4);

        System.out.println(ordenCompra1.detalleOrden());
        System.out.println("Total a pagar: " + ordenCompra1.calucularTotal());

        System.out.println("--------------------------------");

        OrdenCompra ordenCompra2 = new OrdenCompra("Orden de compra 2");
        ordenCompra2.setFecha(new Date(1230768000000L));
        ordenCompra2.setCliente(new Cliente("Juanito", "Alimana"));

        Producto productoo1 = new Producto("Punto 40", "gloc", 25000);
        Producto productoo2 = new Producto("Navaja", "China", 15000);
        Producto productoo3 = new Producto("Mascara", "Nike", 5000);
        Producto productoo4 = new Producto("Guantes", "Under", 2500);

        ordenCompra2.addProducto(productoo1);
        ordenCompra2.addProducto(productoo2);
        ordenCompra2.addProducto(productoo3);
        ordenCompra2.addProducto(productoo4);

        System.out.println(ordenCompra2.detalleOrden());
        System.out.println("Total a pagar: " + ordenCompra2.calucularTotal());
    }
}
