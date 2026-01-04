package jogodavelha.midevs.service;

import jogodavelha.midevs.model.Simbolo;
import jogodavelha.midevs.model.Tabuleiro;
import jogodavelha.midevs.util.Mensagens;
import jogodavelha.midevs.util.SimboloInvalidoException;

public class Partida {

    private final Tabuleiro tabuleiro;


    public Partida(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    //Metodo usado para colocar o valor na matriz
    public boolean jogar (int linha, int coluna, Simbolo simbolo) {


        if (simbolo != Simbolo.X && simbolo != Simbolo.O) {
            throw new SimboloInvalidoException("O caractere " + simbolo + " não é um símbolo de jogo valido.");

        }

        char caractere = simbolo.getSimbolo();
        return tabuleiro.realizarJogada(linha, coluna, caractere);

    }



}
