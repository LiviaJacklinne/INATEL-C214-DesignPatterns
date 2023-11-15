package br.inatel.cdg.impl;

import br.inatel.cdg.interfaces.IOservador;

public class JObservador implements IOservador {

    private int id = 0;

    public JObservador(int id) {
        this.id = id;
    }

    @Override
    public void update(JObservavel obs) {
        System.out.println("Observador " + id + " foi notificado");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
