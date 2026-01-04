package jogodavelha.midevs.model;

public enum Simbolo {
    X('X'),
    O('O');

    private final char simbolo;

    private Simbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }


}
