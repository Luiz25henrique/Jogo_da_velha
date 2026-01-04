package jogodavelha.midevs.model;

import jogodavelha.midevs.util.Mensagens;

public class Tabuleiro {

   private final int linha;
   private final int coluna;

   private final Character [] [] matriz;

   public Tabuleiro(int linha, int coluna) {

       //Formando tabuleiro
       if (linha <0 || coluna <0) {
           throw new IllegalArgumentException(Mensagens.ERRO_DIMENSOES);
       }

       this.linha = linha;
       this.coluna = coluna;

       this.matriz = new Character[linha][coluna];

       limparTabuleiro();
   }

   private void limparTabuleiro() {
       for (int i = 0; i < linha; i++) {
           for (int j = 0; j < coluna; j++) {
               matriz[i][j] = null;
           }
       }
   }

    public void exibirTabuleiro() {
        System.out.println();

        System.out.print("    ");
        for (int j = 0; j < coluna; j++) {
            System.out.print(j+1 + "   ");
        }
        System.out.println("\n");

        for (int i = 0; i < linha; i++) {

            System.out.print(i+1 + "  ");

            for (int j = 0; j < coluna; j++) {
                char limpezaDeSimbolo = (matriz[i][j] == null) ? ' ' : matriz[i][j];

                System.out.print(" " + limpezaDeSimbolo + " ");

                if (j < coluna - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < this.linha - 1) {
                System.out.print("   ");
                for (int k = 0; k < (this.coluna * 4) - 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean verificaJogada(int linha, int coluna) {
        return matriz[linha][coluna] == null;
    }

    // Verificar se o tabuleiro está vazio e add valor nele.
    public boolean realizarJogada(int linha, int coluna, char simbolo) {
        int l = linha - 1;
        int c = coluna -1;
        if (l < 0 || l >= this.linha  || c < 0 || c >= this.coluna ) {
            System.out.println(Mensagens.MENSAGEM_POSICAO);
            return false;
        }


            if (verificaJogada(l, c)) {
                matriz[l][c] = simbolo;
                return true;
            } else {
                System.out.println(Mensagens.OCUPADA);
                return false;
            }
    }

    public boolean verificarVencedor() {
        // Linhas e Colunas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] != null && matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2]) return true;
            if (matriz[0][i] != null && matriz[0][i] == matriz[1][i] && matriz[0][i] == matriz[2][i]) return true;
        }
        // Diagonais
        if (matriz[0][0] != null && matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2]) return true;
        if (matriz[0][2] != null && matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0]) return true;
        return false;
    }

    public boolean tabuleiroCheio() {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == null) return false;
            }
        }
        return true;
    }


}
