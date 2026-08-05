package org.example.interfaces.ejercicios.eje1;

public class Factura implements Imprimible {

    private String numero;

    public Factura(String numero) {
        this.numero = numero;
    }

    @Override
    public void imprimir() {

        System.out.println("Imprimiendo factura N° " + numero);

    }

}
