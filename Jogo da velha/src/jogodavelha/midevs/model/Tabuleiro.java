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

        if (linha < 0 || linha >= this.linha  || coluna < 0 || coluna >= this.coluna ) {
            System.out.println(Mensagens.MENSAGEM_POSICAO);
            return false;
        }


            if (verificaJogada(linha, coluna)) {
                matriz[linha-1][coluna-1] = simbolo;
                return true;
            } else {
                System.out.println(Mensagens.OCUPADA);
                return false;
            }
    }


}
