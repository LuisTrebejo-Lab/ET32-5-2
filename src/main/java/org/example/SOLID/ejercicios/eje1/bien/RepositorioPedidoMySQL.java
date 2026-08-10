package org.example.SOLID.ejercicios.eje1.bien;

public class RepositorioPedidoMySQL implements RepositorioPedido {
    public void guardar(Pedido pedido) {
        System.out.println("Guardando pedido en MySQL...");
    }
}
// Mañana podría existir RepositorioPedidoMongo, RepositorioPedidoArchivo, etc.
// sin tocar el resto del sistema.
