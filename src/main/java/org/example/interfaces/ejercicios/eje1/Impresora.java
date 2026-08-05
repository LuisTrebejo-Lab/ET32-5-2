package org.example.interfaces.ejercicios.eje1;

public class Impresora {

    public void imprimirDocumento(Imprimible documento) {

        documento.imprimir();

    }
    //¿Qué ocurriría sin interfaces?
    /*
    public void imprimir(Object objeto){
        if(objeto instanceof Factura){
        ...
        }else if(objeto instanceof Foto){
        ...
        }else if(objeto instanceof Documento){
        ...
        }
    }*/
    //Cada vez que aparezca una nueva clase (por ejemplo Plano, Recibo o Carnet)
    // habría que modificar la clase Impresora.
}
