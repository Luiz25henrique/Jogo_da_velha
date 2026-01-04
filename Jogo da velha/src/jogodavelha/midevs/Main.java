package jogodavelha.midevs;
import jogodavelha.midevs.model.Tabuleiro;
import jogodavelha.midevs.service.Partida;
import jogodavelha.midevs.service.SortearJogador;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(3, 3);

        Partida partida = new Partida(tabuleiro);

        partida.Jogar(2,1, '1');

        tabuleiro.exibirTabuleiro();




    }
}
