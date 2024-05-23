import java.util.Random;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }
    
    // Método para inserir valores na árvore
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerdo = inserirRecursivo(no.esquerdo, valor);
        } else if (valor > no.valor) {
            no.direito = inserirRecursivo(no.direito, valor);
        }

        return no;
    }

    public void inserirOrdenado(int valor) {
        try {
            this.raiz = inserirOrdenadoRecursivo(this.raiz, valor);
        } catch (Exception e) {
            System.out.println("Erro ao inserir valor ordenado: " + e.getMessage());
        }
    }

    private No inserirOrdenadoRecursivo(No no, int valor) {
        try {
            if (no == null) {
                return new No(valor);
            }

            if (valor < no.valor) {
                no.esquerdo = inserirOrdenadoRecursivo(no.esquerdo, valor);
            } else if (valor > no.valor) {
                no.direito = inserirOrdenadoRecursivo(no.direito, valor);
            }

            return no;
        } catch (Exception e) {
            System.out.println("Erro durante a inserção ordenada: " + e.getMessage());
            return null;
        }
    }

    public void inserirInverso(int valor) {
        try {
            this.raiz = inserirInversoRecursivo(this.raiz, valor);
        } catch (Exception e) {
            System.out.println("Erro ao inserir valor inverso: " + e.getMessage());
        }
    }

    private No inserirInversoRecursivo(No no, int valor) {
        try {
            if (no == null) {
                return new No(valor);
            }

            if (valor > no.valor) {
                no.esquerdo = inserirInversoRecursivo(no.esquerdo, valor);
            } else if (valor < no.valor) {
                no.direito = inserirInversoRecursivo(no.direito, valor);
            }

            return no;
        } catch (Exception e) {
            System.out.println("Erro durante a inserção inversa: " + e.getMessage());
            return null;
        }
    }

    public void inserirAleatoriamente(int valor) {
        try {
            if (raiz == null) {
                raiz = new No(valor);
            } else {
                Random rand = new Random();
                inserirAleatoriamenteRecursivo(raiz, valor, rand);
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir valor aleatório: " + e.getMessage());
        }
    }

    private void inserirAleatoriamenteRecursivo(No no, int valor, Random rand) {
        try {
            if (rand.nextBoolean()) {
                if (no.esquerdo == null) {
                    no.esquerdo = new No(valor);
                } else {
                    inserirAleatoriamenteRecursivo(no.esquerdo, valor, rand);
                }
            } else {
                if (no.direito == null) {
                    no.direito = new No(valor);
                } else {
                    inserirAleatoriamenteRecursivo(no.direito, valor, rand);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro durante a inserção aleatória: " + e.getMessage());
        }
    }

    // Métodos de busca

    public int buscarPrimeiro() {
        try {
            if (raiz == null) {
                System.out.println("Árvore vazia!");
                return -1; // ou lançar uma exceção, dependendo do comportamento desejado
            }

            No atual = raiz;
            while (atual.esquerdo != null) {
                atual = atual.esquerdo;
            }
            return atual.valor;
        } catch (Exception e) {
            System.out.println("Erro durante a busca do primeiro elemento: " + e.getMessage());
            return -1;
        }
    }

    public int buscarMeio() {
        try {
            if (raiz == null) {
                System.out.println("Árvore vazia!");
                return -1; // ou lançar uma exceção, dependendo do comportamento desejado
            }
    
            // Calcula o tamanho da árvore
            int tamanho = calcularTamanho(raiz);
    
            // Realiza o percurso in-order para encontrar o elemento do meio
            int[] contador = {0}; // Usando array para manter a referência
            No noMeio = buscarMeioRecursivo(raiz, tamanho / 2, contador);
            if (noMeio == null) {
                System.out.println("Erro ao buscar elemento do meio!");
                return -1; // ou lançar uma exceção, dependendo do comportamento desejado
            }
            return noMeio.valor;
        } catch (Exception e) {
            System.out.println("Erro durante a busca do elemento do meio: " + e.getMessage());
            return -1;
        }
    }
    
    public int tamanho() {
        try {
            return calcularTamanho(raiz);
        } catch (Exception e) {
            System.out.println("Erro durante o cálculo do tamanho da árvore: " + e.getMessage());
            return -1;
        }
    }
    
    private int calcularTamanho(No no) {
        try {
            if (no == null) {
                return 0;
            }
            return 1 + calcularTamanho(no.esquerdo) + calcularTamanho(no.direito);
        } catch (Exception e) {
            System.out.println("Erro durante o cálculo do tamanho: " + e.getMessage());
            return -1;
        }
    }
    
    // Método auxiliar para buscar o elemento do meio recursivamente
    private No buscarMeioRecursivo(No no, int meio, int[] contador) {
        try {
            if (no == null) {
                return null;
            }
    
            // Percorre a subárvore esquerda
            No esquerdo = buscarMeioRecursivo(no.esquerdo, meio, contador);
            if (esquerdo != null) {
                return esquerdo;
            }
    
            // Verifica o contador
            if (contador[0] == meio) {
                return no;
            }
            contador[0]++;
    
            // Percorre a subárvore direita
            return buscarMeioRecursivo(no.direito, meio, contador);
        } catch (Exception e) {
            System.out.println("Erro durante a busca do elemento do meio recursivamente: " + e.getMessage());
            return null;
        }
    }
    

    public int buscarUltimo() {
        try {
            if (raiz == null) {
                System.out.println("Árvore vazia!");
                return -1; // ou lançar uma exceção, dependendo do comportamento desejado
            }

            No atual = raiz;
            while (atual.direito != null) {
                atual = atual.direito;
            }
            return atual.valor;
        } catch (Exception e) {
            System.out.println("Erro durante a busca do último elemento: " + e.getMessage());
            return -1;
        }
    }

    public int buscarAleatorio(int posicao) {
        try {
            if (raiz == null) {
                System.out.println("Árvore vazia!");
                return -1; // ou lançar uma exceção, dependendo do comportamento desejado
            }

            return buscarAleatorioRecursivo(raiz, posicao).valor;
        } catch (Exception e) {
            System.out.println("Erro durante a busca de um elemento aleatório: " + e.getMessage());
            return -1;
        }
    }

    // Método auxiliar para buscar um valor aleatório na árvore recursivamente
    private No buscarAleatorioRecursivo(No no, int posicao) {
        try {
            if (no == null) {
                return null;
            }

            int tamanhoEsquerdo = calcularTamanho(no.esquerdo);

            if (posicao <= tamanhoEsquerdo) {
                return buscarAleatorioRecursivo(no.esquerdo, posicao);
            } else if (posicao == tamanhoEsquerdo + 1) {
                return no;
            } else {
                return buscarAleatorioRecursivo(no.direito, posicao - tamanhoEsquerdo - 1);
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca aleatória recursiva: " + e.getMessage());
            return null;
        }
    }

    public long buscar(int valor) {
        try {
            long inicio = System.nanoTime(); // Início da medição do tempo
            buscarRecursivo(raiz, valor); // Realiza a busca
            long fim = System.nanoTime(); // Fim da medição do tempo

            long tempoTotal = fim - inicio; // Calcula o tempo total de execução
            return tempoTotal; // Retorna o tempo de execução
        } catch (Exception e) {
            System.out.println("Erro durante a busca: " + e.getMessage());
            return -1;
        }
    }

    private int buscarRecursivo(No no, int valor) {
        try {
            if (no == null) {
                return -1; // Valor não encontrado
            }

            if (valor == no.valor) {
                return no.valor; // Valor encontrado
            } else if (valor < no.valor) {
                return buscarRecursivo(no.esquerdo, valor); // Busca na subárvore esquerda
            } else {
                return buscarRecursivo(no.direito, valor); // Busca na subárvore direita
            }
        } catch (Exception e) {
            System.out.println("Erro durante a busca recursiva: " + e.getMessage());
            return -1;
        }
    }
}
