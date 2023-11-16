import br.inatel.cdg.impl.JObservador;
import br.inatel.cdg.impl.JObservavel;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testaInscrito() {
        JObservavel obs = new JObservavel();
        JObservador leitor1 = new JObservador(1);
        obs.registraObservador(leitor1);

        // após adicionar um elemento na lista, ela não pode ser vazia
        assertTrue(!obs.getObservadores().isEmpty());

    }

    @Test
    public void testaPar() {
        JObservavel obs = new JObservavel();
        String frase = "Software é melhor que Computação";
        int par = obs.contaPar(frase);

        // deve retornar 3, ou seja, 3 palavras são par
        assertEquals(3, par);
    }

    @Test
    public void testaMaiuscula() {
        JObservavel obs = new JObservavel();
        String frase = "Software é melhor que Computação";
        int upper = obs.contaUppercase(frase);

        // deve retornar 2, no caso, duas letras maiusculas
        assertEquals(2, upper);
    }

    @Test
    public void testaPalavras() {
        JObservavel obs = new JObservavel();
        String frase = "Software é melhor que Computação";
        int palavra = obs.contaPalavras(frase);

        // deve retornar quantas palavras tem a frase, no caso, 5
        assertEquals(5, palavra);
    }


}
