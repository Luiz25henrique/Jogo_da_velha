package jogodavelha.midevs.service;
import jogodavelha.midevs.model.Tabuleiro;

import java.util.Scanner;

public class Partida {

    private final Tabuleiro tabuleiro;

    public Partida(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    //Metodo usado para colocar o valor na matriz
    public void Jogar (int linha, int coluna, char simbolo) {
        boolean sucesso = tabuleiro.realizarJogada(linha, coluna, simbolo);
        tabuleiro.realizarJogada(linha, coluna,simbolo);


    }

}
