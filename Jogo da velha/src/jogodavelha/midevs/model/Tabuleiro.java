package jogodavelha.midevs.model;
import java.util.ArrayList;

public class Tabuleiro {

   private final int linha;
   private final int coluna;

   private final Character [] [] matriz;

   public Tabuleiro(int linha, int coluna) {

       //Formando tabuleiro
       if (linha <0 || coluna <0) {
           throw new IllegalArgumentException("Dimensões não estão validas");
       }

       this.linha = linha;
       this.coluna = coluna;

       this.matriz = new Character[linha][coluna];

       limparTabuleiro();
   }

   private void limparTabuleiro() {
       for (int i = 0; i < linha; i++) {
           for (int j = 0; j < coluna; j++) {
               matriz[i][j] = ' ';
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
                System.out.print(" " + matriz[i][j] + " ");

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



    // Verificar se o tabuleiro está vazio e add valor nele.
    public boolean realizarJogada(int linha, int coluna) {

        if (linha < 0 || linha >= this.linha  || coluna < 0 || coluna >= this.coluna ) {
            System.out.println("Posisão não existente!!");
            return false;
        }

            if (matriz[this.linha][this.coluna] == '\u0000') {
                matriz[this.linha][this.coluna] = 'x';
                return true;
            } else {
                System.out.println("Casa ocupada");
                return false;
            }
    }

    public boolean jogar(int linha, int coluna) {
       return matriz[linha][coluna] == ' ';
    }
}
