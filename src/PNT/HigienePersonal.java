package PNT;

import java.security.ProtectionDomain;

public class HigienePersonal extends Producto {

    private int contenidoMl;

    public int getContenidoMl() {
        return contenidoMl;
    }

    public void setContenidoMl(int contenidoMl) {
        this.contenidoMl = contenidoMl;
    }

    public HigienePersonal(String nombre, int contenidoMl, int precio) {
        super(nombre, precio);
        this.contenidoMl = contenidoMl;
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenidoMl() + "ml /// Precio: $" + getPrecio();
    }
}
