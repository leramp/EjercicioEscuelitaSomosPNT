package PNT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Bebida("Coca-Cola Zero", 20, 1.5);
        Producto producto2 = new Bebida("Coca-Cola", 18, 1.5);
        Producto producto3 = new HigienePersonal("Shampoo Sedal",500, 19 );
        Producto producto4 = new Fruta("Frutillas", 64, "kilo");

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        for(Producto p : productos){
            System.out.println(p.toString());
        }

        System.out.println("=============================");

        System.out.println("Producto más caro: "+Collections.max(productos).getNombre());
        System.out.println("Producto más barato: "+Collections.min(productos).getNombre());
    }

}

