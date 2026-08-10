package org.example.SOLID.ejercicios.eje1.bien;

public class PagoTarjeta implements EstrategiaPago {
    public double calcular(double montoBase) { return montoBase * 1.05; }
}
