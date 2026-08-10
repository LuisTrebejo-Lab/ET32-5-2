package org.example.SOLID.ejercicios.eje1.bien;

public class PagoEfectivo implements EstrategiaPago {
    public double calcular(double montoBase) { return montoBase * 0.90; }
}
