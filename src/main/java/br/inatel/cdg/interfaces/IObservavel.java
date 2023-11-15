package br.inatel.cdg.interfaces;

import br.inatel.cdg.impl.JObservador;

public interface IObservavel {

    void registraObservador(JObservador obs);
    void removeObservador(JObservador obs);
    void notificaObservador();

}
