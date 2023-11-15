package br.inatel.cdg.impl;

import br.inatel.cdg.interfaces.IObservavel;

import java.util.ArrayList;
import java.util.List;

public class JObservavel implements IObservavel {

//    private String frase;
    private List<JObservador> observadores;

    public JObservavel() {
        observadores = new ArrayList<JObservador>();
    }

    @Override
    public void registraObservador(JObservador obs) {
        observadores.add(obs);

    }

    @Override
    public void removeObservador(JObservador obs) {
        if(observadores.contains(obs))
            observadores.remove(obs);

    }

    @Override
    public void notificaObservador() {
        for (JObservador observador : observadores)
            observador.update(this);

    }

    public int contaPalavras(String frase) {

        String palavras [] = frase.split("\\s+");
        System.out.println("Frase: " + frase);
        System.out.println("Número de palavras: " + palavras.length + "\n");

        return palavras.length;
    }

    public int contaUppercase(String frase) {
        int cont = 0;
        String palavras [] = frase.split("\\s+");

        System.out.println("Frase: " + frase);
        System.out.println("As palavras abaixo, contém letra maiúscula: ");
            for (String palavra : palavras)
                if (contemUppercase(palavra)) {
                    System.out.println(palavra);
                    cont++;
                }
        return cont;
    }

    public boolean contemUppercase(String palavra){
        for (char c : palavra.toCharArray())
            if (Character.isUpperCase(c))
                return true;
        return false;
    }



    public int contaPar(String frase) {

        int cont = 0;
        String palavras [] = frase.split("\\s+");

        System.out.println("Da frase '" + frase + "' apenas as palavras abaixo contem caracteres par");
        for (String palavra : palavras) {

            if((palavra.length() % 2) ==  0) {
                System.out.println(palavra + " - " + palavra.length() + " caracteres");
                cont++;
            }
        }

        System.out.println("Total de palavras: " + cont + " \n");

        return cont;
    }

    // GETTERS AND SETTERS
    public List<JObservador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<JObservador> observadores) {
        this.observadores = observadores;
    }
}
