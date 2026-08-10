package org.example.SOLID.ejercicios.eje1.bien;

// Responsabilidad única: calcular el total (SRP)
public class CalculadoraPedido {
    double calcularTotal(Pedido pedido, EstrategiaPago estrategiaPago) {
        double montoBase = pedido.cantidad * pedido.precioUnitario;
        return estrategiaPago.calcular(montoBase);
    }
}