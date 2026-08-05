package org.example.interfaces.ejercicios.eje1;

public class Foto implements Imprimible {

    private String nombre;

    public Foto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimir() {

        System.out.println("Imprimiendo fotografía: " + nombre);

    }

}
