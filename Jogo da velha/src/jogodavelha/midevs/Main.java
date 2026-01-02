package jogodavelha.midevs;
import jogodavelha.midevs.model.Tabuleiro;
import jogodavelha.midevs.service.Jogador;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(3, 3);

        tabuleiro.exibirTabuleiro();

        tabuleiro.realizarJogada(1, 1, 'o' );

        Jogador jogador = new Jogador();
        System.out.println(jogador.toString());





    }
}
