package com.company;

public class Fila {
    static private Fila instance = null;

    private Fila(){
    }
    static Fila getFila(){
        if(instance==null){
            instance = new Fila();
        }
        return instance;
    }

    public void imprimeDocumento(){}
    public void removeDocumento(){}
    public void removeTodosDocumentos(){}
}
