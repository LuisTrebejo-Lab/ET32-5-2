package org.example.interfaces.ejercicios.eje1;

public class Documento implements Imprimible, Tinta {

    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {

        System.out.println("Imprimiendo documento: " + titulo);

    }

    @Override
    public void tipoTinta() {
        System.out.println("Tintando documento: " + titulo);
    }
}
