import jogodavelha.midevs.model.Simbolo;
import jogodavelha.midevs.model.Tabuleiro;
import jogodavelha.midevs.service.Partida;
import jogodavelha.midevs.service.Skaynet;

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

            // VEZ DA SKYNET (Opcional, se quiser jogar contra o PC)
            skynet.vezPc('O');

            if (validarFimDeJogo(tabuleiro)) break;
        }
        scanner.close();
    }

    private static void fazerJogadaHumana(Scanner scanner, Partida partida) {
        boolean jogadaTrue = false;
        while (!jogadaTrue) {
            try {
                System.out.print("Linha: ");
                int l = scanner.nextInt();
                System.out.print("Coluna: ");
                int c = scanner.nextInt();
                System.out.print("Símbolo (X/O): ");
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
            System.out.println("Fim de jogo! Temos um vencedor.");
            return true;
        }
        if (t.tabuleiroCheio()) {
            t.exibirTabuleiro();
            System.out.println("Empate! Deu velha.");
            return true;
        }
        return false;
    }
}