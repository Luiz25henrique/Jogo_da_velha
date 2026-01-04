package jogodavelha.midevs.model;

public enum Caracteres {
    USUARIO('U'),
    COMPUTADOR('C'),
    X('x'),
    O('o'),
    VAZIO('-');


    private final char simbolo;
    Caracteres(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

}
