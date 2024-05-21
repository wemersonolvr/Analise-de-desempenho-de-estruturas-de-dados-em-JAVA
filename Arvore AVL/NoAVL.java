class NoAVL {
    int chave;
    NoAVL esquerda;
    NoAVL direita;
    int altura;

    public NoAVL(int key) {
        this.chave = key;
        altura = 1;
    }
}