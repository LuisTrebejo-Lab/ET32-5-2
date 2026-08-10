package org.example.SOLID.ejercicios.eje1.bien;

// Modelo: solo representa los datos del pedido (SRP)
public class Pedido {
    String producto;
    int cantidad;
    double precioUnitario;

    public Pedido(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
}
