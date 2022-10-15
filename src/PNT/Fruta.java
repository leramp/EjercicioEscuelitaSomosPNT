package PNT;

public class Fruta extends Producto{

    private String unidadVenta;

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    public Fruta(String nombre, int precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidadVenta();
    }
}
