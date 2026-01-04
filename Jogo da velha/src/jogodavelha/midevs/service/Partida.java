package jogodavelha.midevs.service;

public class Partida {

    CaracteresIdentificadoresAceitos usuario = CaracteresIdentificadoresAceitos.USUARIO;
    CaracteresIdentificadoresAceitos comupador = CaracteresIdentificadoresAceitos.COMPUTADOR;

    public void Jogando () {
        SortearJogador sortearJogador = new SortearJogador();


        if (sortearJogador.sorteiojogador()) {
            System.out.println("O primeiro a jogar vai ser " + usuario);

        }

    }

}
