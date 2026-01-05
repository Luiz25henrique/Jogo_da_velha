import jogodavelha.midevs.model.Simbolo;
import jogodavelha.midevs.model.Tabuleiro;
import jogodavelha.midevs.service.Partida;
import jogodavelha.midevs.service.Skaynet;
import jogodavelha.midevs.util.Mensagens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro(3, 3);
        Partida partida = new Partida(tabuleiro);
        Skaynet skynet = new Skaynet(tabuleiro);

        boolean goGame = true;

        while (goGame) {
            tabuleiro.exibirTabuleiro();

            // VEZ DO HUMANO
            fazerJogadaHumana(scanner, partida);

            if (validarFimDeJogo(tabuleiro)) break;

            // VEZ DA SKYNET
            skynet.vezPc('O');

            if (validarFimDeJogo(tabuleiro)) break;
        }
        scanner.close();
    }

    private static void fazerJogadaHumana(Scanner scanner, Partida partida) {
        boolean jogadaTrue = false;
        while (!jogadaTrue) {
            try {
                System.out.print(Mensagens.LINHA);
                int l = scanner.nextInt();
                System.out.print(Mensagens.COLUNA);
                int c = scanner.nextInt();
                System.out.print(Mensagens.SIMBOLOS);
                String s = scanner.next();

                jogadaTrue = partida.jogar(l, c, Simbolo.valueOf(s.toUpperCase()));
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
                scanner.nextLine();
            }
        }
    }

    private static boolean validarFimDeJogo(Tabuleiro t) {
        if (t.verificarVencedor()) {
            t.exibirTabuleiro();
            System.out.println(Mensagens.GAMER_OVER); // Falta colocar nome do vencedor
            return true;
        }
        if (t.tabuleiroCheio()) {
            t.exibirTabuleiro();
            System.out.println(Mensagens.EMPATE);
            return true;
        }
        return false;
    }
}