package jogodavelha.midevs.service;

import jogodavelha.midevs.model.Tabuleiro;
import java.util.Random;

public class Skaynet {

    private final Random rand = new Random();
    private final Tabuleiro tabuleiro;

    public Skaynet(Tabuleiro tabuleiro ) {
        this.tabuleiro = tabuleiro;
    }

    public void vezPc(char simbolo) {
        boolean jogadaEfetuada = false;
        while (!jogadaEfetuada) {
            int l = rand.nextInt(3) + 1;
            int c = rand.nextInt(3) + 1;
            jogadaEfetuada = tabuleiro.realizarJogada(l, c, simbolo);
        }
        System.out.println("jogadaEfetuada");

    }


}
