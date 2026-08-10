package org.example.SOLID.ejercicios.eje1.bien;

public class PagoTransferencia implements EstrategiaPago {
    public double calcular(double montoBase) { return montoBase; }
}
// Si mañana aparece MercadoPago, se agrega una clase nueva
// implementando EstrategiaPago. No se toca ninguna de las anteriores.
