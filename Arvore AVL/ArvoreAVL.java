public class ArvoreAVL {
    private NoAVL raiz;

    public ArvoreAVL() {
        raiz = null;
    }

    public void inserir(int chave) {
        try {
            raiz = inserir(raiz, chave);
        } catch (Exception e) {
            System.out.println("Erro durante a inserção na Árvore AVL: " + e.getMessage());
        }
    }

    private NoAVL inserir(NoAVL no, int chave) {
        if (no == null) {
            return new NoAVL(chave);
        }

        try {
            if (chave < no.chave) {
                no.esquerda = inserir(no.esquerda, chave);
            } else if (chave > no.chave) {
                no.direita = inserir(no.direita, chave);
            } else {
                return no;
            }

            no.altura = 1 + Math.max(obterAltura(no.esquerda), obterAltura(no.direita));

            int balanceamento = obterBalanceamento(no);

            if (balanceamento > 1 && chave < no.esquerda.chave) {
                return rotacaoDireita(no);
            }

            if (balanceamento < -1 && chave > no.direita.chave) {
                return rotacaoEsquerda(no);
            }

            if (balanceamento > 1 && chave > no.esquerda.chave) {
                no.esquerda = rotacaoEsquerda(no.esquerda);
                return rotacaoDireita(no);
            }

            if (balanceamento < -1 && chave < no.direita.chave) {
                no.direita = rotacaoDireita(no.direita);
                return rotacaoEsquerda(no);
            }
        } catch (Exception e) {
            System.out.println("Erro durante a inserção na Árvore AVL: " + e.getMessage());
        }

        return no;
    }

    private NoAVL rotacaoDireita(NoAVL y) {
        NoAVL x = y.esquerda;
        NoAVL z = x.direita;
        x.direita = y;
        y.esquerda = z;
        y.altura = 1 + Math.max(obterAltura(y.esquerda), obterAltura(y.direita));
        x.altura = 1 + Math.max(obterAltura(x.esquerda), obterAltura(x.direita));
        return x;
    }

    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.direita;
        NoAVL z = y.esquerda;
        y.esquerda = x;
        x.direita = z;
        x.altura = 1 + Math.max(obterAltura(x.esquerda), obterAltura(x.direita));
        y.altura = 1 + Math.max(obterAltura(y.esquerda), obterAltura(y.direita));
        return y;
    }

    private int obterAltura(NoAVL no) {
        if (no == null) {
            return 0;
        }

        return no.altura;
    }

    private int obterBalanceamento(NoAVL no) {
        if (no == null) {
            return 0;
        }

        return obterAltura(no.esquerda) - obterAltura(no.direita);
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NoAVL no, int valor) {
        if (no == null) {
            return false; // Valor não encontrado
        }

        if (valor == no.chave) {
            return true; // Valor encontrado
        } else if (valor < no.chave) {
            return buscarRecursivo(no.esquerda, valor); // Busca na subárvore esquerda
        } else {
            return buscarRecursivo(no.direita, valor); // Busca na subárvore direita
        }
    }
}