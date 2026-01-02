package jogodavelha.midevs.service;
import jogodavelha.midevs.util.Mensagens;

import java.util.Random;

public class Jogador {
    Random random = new Random();

    private final boolean primeiroJogador;

    public Jogador() {
        this.primeiroJogador = random.nextInt(1, 3) == 1;
    }


    @Override
    public String toString() {
        if (primeiroJogador) {
            return Mensagens.JOGADOR;
        } else  {
            return Mensagens.SKAYNET;
        }

    }

}
