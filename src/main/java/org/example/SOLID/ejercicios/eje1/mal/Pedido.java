package org.example.SOLID.ejercicios.eje1.mal;

public class Pedido {
    String producto;
    int cantidad;
    double precioUnitario;
    String tipoPago; // "EFECTIVO", "TARJETA", "TRANSFERENCIA"

    double calcularTotal() {
        double total = cantidad * precioUnitario;

        if (tipoPago.equals("EFECTIVO")) {
            total = total * 0.90; // 10% descuento
        } else if (tipoPago.equals("TARJETA")) {
            total = total * 1.05; // 5% recargo
        } else if (tipoPago.equals("TRANSFERENCIA")) {
            total = total; // sin cambios
        }
        return total;
    }

    void imprimirTicket() {
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + calcularTotal());
    }

    void guardarEnBaseDeDatos() {
        // Simulación de conexión directa a MySQL
        System.out.println("Conectando a la base de datos...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }
}
