package org.example.interfaces.ejercicios.eje1;

public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        Factura factura = new Factura("001-254");
        Foto foto = new Foto("Vacaciones.jpg");
        Documento documento = new Documento("Trabajo Práctico");

        impresora.imprimirDocumento(factura);
        impresora.imprimirDocumento(foto);
        impresora.imprimirDocumento(documento);

    }

}
