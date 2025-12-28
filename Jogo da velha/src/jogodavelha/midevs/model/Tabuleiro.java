package jogodavelha.midevs.model;

public class Tabuleiro {
    static final int TAMANHO_TABULEIRO = 3;

    static final char [] [] tabuleiro = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

    public Tabuleiro() {
        inicializar();
    }

    private void inicializar() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }
    }
    public void imprimirTabuleiro() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                System.out.print(" " + tabuleiro[linha][coluna] + " ");

                if (coluna < tabuleiro[linha].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();

            if (linha < tabuleiro.length - 1) {
                System.out.println("---|---|---");
            }
        }
    }
}
