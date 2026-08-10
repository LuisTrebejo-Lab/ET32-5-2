package org.example.SOLID.ejercicios.eje1.bien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Producto: ");
        String producto = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        System.out.print("Precio unitario: ");
        double precioUnitario = Double.parseDouble(sc.nextLine());

        // Los datos entran directo por el constructor
        Pedido pedido = new Pedido(producto, cantidad, precioUnitario);

        System.out.print("Tipo de pago (EFECTIVO/TARJETA/TRANSFERENCIA): ");
        String tipoPago = sc.nextLine();

        // El main ya no decide "cómo" se crea la estrategia, solo la pide
        EstrategiaPago estrategiaPago = new PagoEfectivo();
        EstrategiaPago estrategiaPago1 = new PagoTarjeta();


        CalculadoraPedido calculadora = new CalculadoraPedido();
        double total = calculadora.calcularTotal(pedido, estrategiaPago);

        ImpresoraTicket impresora = new ImpresoraTicket();
        impresora.imprimir(pedido, total);

        RepositorioPedido repositorio = new RepositorioPedidoMySQL();
        repositorio.guardar(pedido);
    }
}
