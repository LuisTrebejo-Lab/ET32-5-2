package org.example.SOLID.ejercicios.eje1.bien;

public class ImpresoraTicket {
    void imprimir(Pedido pedido, double total) {
        System.out.println("Producto: " + pedido.producto);
        System.out.println("Cantidad: " + pedido.cantidad);
        System.out.println("Total: " + total);
    }
}
