package jogodavelha.midevs.model;

public class Tabuleiro {

   private int linha;
   private int coluna;
   private char [] [] matriz;

   public Tabuleiro(int linha, int coluna) {
       this.linha = linha;
       this.coluna = coluna;

       this.matriz = new char[linha][coluna];

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

    public char[][] getMatriz() {
        return matriz;
    }

    //Colocar valores na matriz
    public void setMatriz(char[][] matriz) {
       while ()
    }

    public boolean jogar(int linha, int coluna) {
       return matriz[linha][coluna] == ' ';
    }
}
