# Projeto de Análise de Estruturas de Dados

Este projeto visa realizar uma análise comparativa de diferentes estruturas de dados, incluindo arrays e árvores, em termos de tempo de inserção e busca para conjuntos de dados de diferentes tamanhos.

## Estrutura do Projeto

O projeto está organizado em três pastas principais:

1. **Vetor:** Contém os arquivos relacionados à implementação e análise de estruturas baseadas em arrays.
   - Arquivos:
     - `Main.java`: Arquivo principal para execução do programa.
     - `MedidorDeTempo.java`: Classe para medição de tempo de execução.
     - `Menu.java`: Implementação do menu de interação com o usuário.
     - `Vetor.java`: Implementação da estrutura de dados baseada em array.

2. **Árvore Binária:** Contém os arquivos relacionados à implementação e análise de árvores binárias de busca.
   - Arquivos:
     - `Arvore.java`: Implementação da árvore binária de busca.
     - `GeradorNumerosAleatorios.java`: Classe para geração de números aleatórios.
     - `Main.java`: Arquivo principal para execução do programa.
     - `No.java`: Classe que define os nós da árvore binária.
     - `TesteInsercaoBusca.java`: Classe para teste de inserção e busca na árvore binária.

3. **Árvore AVL:** Contém os arquivos relacionados à implementação e análise de árvores AVL (Árvores Binárias de Busca Balanceadas).
   - Arquivos:
     - `ArvoreAVL.java`: Implementação da árvore AVL.
     - `BuscaArvoreAVL.java`: Classe para realizar busca na árvore AVL.
     - `GeradorNumerosAleatorios.java`: Classe para geração de números aleatórios.
     - `InsercaoArvoreAVL.java`: Classe para inserção de elementos na árvore AVL.
     - `Main.java`: Arquivo principal para execução do programa.
     - `NoAVL.java`: Classe que define os nós da árvore AVL.


## Instruções de Uso

Siga as instruções abaixo para utilizar e analisar as diferentes estruturas de dados implementadas neste projeto:

### 1. Clonar o Repositório

Clone este repositório para sua máquina local usando o seguinte comando git:

```bash
git clone https://github.com/wemersonolvr/Analise-de-desempenho-de-estruturas-de-dados-em-JAVA.git
```

### 2. Navegar até a Pasta Correspondente
Navegue até a pasta correspondente à estrutura de dados que deseja analisar usando o terminal ou prompt de comando:

Para análise de estruturas baseadas em arrays:

```
cd Vetor
```

Para análise de árvores binárias de busca:
```
cd ArvoreBinaria
```
Para análise de árvores AVL:

```
cd ArvoreAVL
```

### 3. Compilar os Arquivos Java
Compile os arquivos Java presentes na pasta utilizando o seguinte comando:

```
javac *.java
```
### 4. Executar o Programa Principal
Execute o programa principal para realizar medições de tempo e análises comparativas:

```
java Main
```

### 5. Analisar os Resultados
Após a execução do programa, analise os resultados gerados para comparar o desempenho das diferentes estruturas de dados. Os resultados serão exibidos no console.

#### Exemplos de saída:
```
=============== Medindo Tempo de inserção e busca em Array Ordenado com 100 elementos ===============
primeiro valor:
Tempo para gerar array em ordem: 804699 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca sequencial no ordenado: 1599 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca binária no ordenado: 2101 nanossegundos

valor do meio:
Tempo para gerar array em ordem: 2500 nanossegundos
Valor 50 encontrado na posição 49. Tempo para busca sequencial no ordenado: 1099 nanossegundos
Valor 50 encontrado na posição 49. Tempo para busca binária no ordenado: 600 nanossegundos

ultimo valor:
Tempo para gerar array em ordem: 3300 nanossegundos
Valor 100 encontrado na posição 99. Tempo para busca sequencial no ordenado: 2100 nanossegundos
Valor 100 encontrado na posição 99. Tempo para busca binária no ordenado: 1200 nanossegundos

=============== Medindo Tempo de inserção e busca em Array Ordenado com 1000 elementos ===============

Tempo para gerar array em ordem: 21800 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca sequencial no ordenado: 700 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca binária no ordenado: 1400 nanossegundos

Tempo para gerar array em ordem: 22200 nanossegundos
Valor 500 encontrado na posição 499. Tempo para busca sequencial no ordenado: 7899 nanossegundos
Valor 500 encontrado na posição 499. Tempo para busca binária no ordenado: 901 nanossegundos

Tempo para gerar array em ordem: 18900 nanossegundos
Valor 1000 encontrado na posição 999. Tempo para busca sequencial no ordenado: 15600 nanossegundos
Valor 1000 encontrado na posição 999. Tempo para busca binária no ordenado: 1400 nanossegundos

=============== Medindo Tempo de inserção e busca em Array Ordenado com 10000 elementos ===============

Tempo para gerar array em ordem: 176800 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca sequencial no ordenado: 600 nanossegundos
Valor 1 encontrado na posição 0. Tempo para busca binária no ordenado: 999 nanossegundos

Tempo para gerar array em ordem: 1050799 nanossegundos
Valor 5000 encontrado na posição 4999. Tempo para busca sequencial no ordenado: 75000 nanossegundos
Valor 5000 encontrado na posição 4999. Tempo para busca binária no ordenado: 1999 nanossegundos

Tempo para gerar array em ordem: 193999 nanossegundos
Valor 10000 encontrado na posição 9999. Tempo para busca sequencial no ordenado: 147700 nanossegundos
Valor 10000 encontrado na posição 9999. Tempo para busca binária no ordenado: 1800 nanossegundos

=============== Medindo Tempo de inserção e busca em Array Inversamente Ordenado com 100 elementos ===============
Tempo para gerar array em ordem inversa: 9200 nanossegundos
Valor 1 encontrado na posição 99. Tempo para busca sequencial no inversamente ordenado: 2200 nanossegundos
Busca binária não aplicável em array inversamente ordenado.

Tempo para gerar array em ordem inversa: 3800 nanossegundos
Valor 50 encontrado na posição 50. Tempo para busca sequencial no inversamente ordenado: 1299 nanossegundos
Busca binária não aplicável em array inversamente ordenado.

Tempo para gerar array em ordem inversa: 3501 nanossegundos
Valor 100 encontrado na posição 0. Tempo para busca sequencial no inversamente ordenado: 600 nanossegundos
Busca binária não aplicável em array inversamente ordenado.


=============== Medindo Tempo de inserção e busca em Array Inversamente Ordenado com 1000 elementos ===============

Tempo para gerar array em ordem inversa: 20900 nanossegundos
Valor 1 encontrado na posição 999. Tempo para busca sequencial no inversamente ordenado: 15800 nanossegundos
Busca binária não aplicável em array inversamente ordenado.


Tempo para gerar array em ordem inversa: 18101 nanossegundos
Valor 500 encontrado na posição 500. Tempo para busca sequencial no inversamente ordenado: 5901 nanossegundos
Busca binária não aplicável em array inversamente ordenado.

Tempo para gerar array em ordem inversa: 20701 nanossegundos
Valor 1000 encontrado na posição 0. Tempo para busca sequencial no inversamente ordenado: 600 nanossegundos
Busca binária não aplicável em array inversamente ordenado.


=============== Medindo Tempo de inserção e busca em Array Inversamente Ordenado com 10000 elementos ===============


Tempo para gerar array em ordem inversa: 171000 nanossegundos
Valor 1 encontrado na posição 9999. Tempo para busca sequencial no inversamente ordenado: 110400 nanossegundos
Busca binária não aplicável em array inversamente ordenado.

Tempo para gerar array em ordem inversa: 166700 nanossegundos
Valor 5000 encontrado na posição 5000. Tempo para busca sequencial no inversamente ordenado: 163699 nanossegundos
Busca binária não aplicável em array inversamente ordenado.

Tempo para gerar array em ordem inversa: 181001 nanossegundos
Valor 10000 encontrado na posição 0. Tempo para busca sequencial no inversamente ordenado: 500 nanossegundos
Busca binária não aplicável em array inversamente ordenado.


=============== Medindo Tempo de inserção e busca em Array Aleatório com 100 ===============

Tempo para gerar array aleatório: 1223200 nanossegundos
Valor 1 encontrado na posição 70. Tempo para busca sequencial no aleatório: 3600 nanossegundos
Busca binária não aplicável em array aleatório.

Tempo para gerar array aleatório: 36300 nanossegundos
Valor 50 encontrado na posição 90. Tempo para busca sequencial no aleatório: 1900 nanossegundos
Busca binária não aplicável em array aleatório.

Tempo para gerar array aleatório: 34100 nanossegundos
Valor 100 encontrado na posição 47.
Tempo para busca sequencial no aleatório: 1200 nanossegundos
Busca binária não aplicável em array aleatório.


=============== Medindo Tempo de inserção e busca em Array Aleatório com 1000 ===============

Tempo para gerar array aleatório: 1745000 nanossegundos
Valor 1 encontrado na posição 766. 
Tempo para busca sequencial no aleatório: 10200 nanossegundos

Tempo para gerar array aleatório: 99400 nanossegundos
Valor 500 encontrado na posição 520. 
Tempo para busca sequencial no aleatório: 8300 nanossegundos
Busca binária não aplicável em array aleatório.

Tempo para gerar array aleatório: 70100 nanossegundos
Valor 1000 encontrado na posição 128.
Tempo para busca sequencial no aleatório: 2400 nanossegundos
Busca binária não aplicável em array aleatório.

=============== Medindo Tempo de inserção e busca em Array Aleatório com 10000 elementos ===============

Tempo para gerar array aleatório: 577000 nanossegundos
Valor 1 encontrado na posição 1196. 
Tempo para busca sequencial no aleatório: 19100 nanossegundos
Busca binária não aplicável em array aleatório.

Tempo para gerar array aleatório: 422600 nanossegundos
Valor 5000 encontrado na posição 1121. Tempo para busca sequencial no aleatório: 12300 nanossegundos
Busca binária não aplicável em array aleatório.

Tempo para gerar array aleatório: 578600 nanossegundos
Valor 10000 encontrado na posição 8758. 
Tempo para busca sequencial no aleatório: 129700 nanossegundos
Busca binária não aplicável em array aleatório.

=============== Medindo Tempo de ordenação em Array com bubbleSort com 100 elementos ===============
Vetor ordenado com Bubble Sort em 123600 nanossegundos.

=============== Medindo Tempo de ordenação em Array com bubbleSort com 1000 elementos ===============
Vetor ordenado com Bubble Sort em 1203200 nanossegundos.

=============== Medindo Tempo de ordenação em Array com bubbleSort com 10000 elementos ===============
Vetor ordenado com Bubble Sort em 122250700 nanossegundos.

============== Medindo Tempo de ordenação em Array com Merge Sort com 100 elementos===============
Vetor ordenado com Merge Sort em 72100 nanossegundos.

============== Medindo Tempo de ordenação em Array com Merge Sort com 1000 elementos ===============
Vetor ordenado com Merge Sort em 635900 nanossegundos.

============== Medindo Tempo de ordenação em Array com Merge Sort com 1000 elementos ===============
Vetor ordenado com Merge Sort em 2077200 nanossegundos.


ARVORE BINÁRIA 
Tempo de inserção ordenada (100 elementos): 507900 nanossegundos
Tempo de inserção ordenada (1000 elementos): 322100 nanossegundos
Tempo de inserção ordenada (10000 elementos): 2256999 nanossegundos
Tempo de inserção inversa (100 elementos): 85599 nanossegundos
Tempo de inserção inversa (1000 elementos): 346601 nanossegundos
Tempo de inserção inversa (10000 elementos): 3014599 nanossegundos
Tempo de inserção aleatória (100 elementos): 155700 nanossegundos
Tempo de inserção aleatória (1000 elementos): 884301 nanossegundos
Tempo de inserção aleatória (10000 elementos): 5499500 nanossegundos
Tempo de busca do primeiro elemento(100 elementos): 3000 nanossegundos
Tempo de busca do elemento do meio(100 elementos): 2872600 nanossegundos
Tempo de busca do último elemento(100 elementos): 7800 nanossegundos
Tempo de busca do primeiro elemento(1000 elementos): 1700 nanossegundos
Tempo de busca do elemento do meio(1000 elementos): 51120700 nanossegundos
Tempo de busca do último elemento(1000 elementos): 23900 nanossegundos
Tempo de busca do primeiro elemento(10000 elementos): 3300 nanossegundos
Tempo de busca do elemento do mei(10000 elementos)o: 794099 nanossegundos
Tempo de busca do último elemento(10000 elementos): 2000 nanossegundos
Valor aleatório buscado (11508) encontrado na árvore.
Tempo de busca aleatória: 415800 nanossegundos
Tempo de busca por valor inexistente na árvore: 5400 nanossegundos



ARVORE AVL
Insercao ordenada na Arvore AVL(100 elementos): 651800 nanossegundos
Insercao ordenada na Arvore AVL(1000 elementos): 746600 nanossegundos
Insercao ordenada na Arvore AVL (1000 elementos): 5185000 nanossegundos
Insercao inversamente ordenada Arvore AVL (100 elementos): 26900 nanossegundos
Insercao inversamente ordenada Arvore AVL (1000 elementos): 400800 nanossegundos
Insercao inversamente ordenada Arvore AVL (10000 elementos): 5212400 nanossegundos
Insercao aleatoria na Arvore AVL(100 elementos): 33900 nanossegundos
Insercao aleatoria na Arvore AVL(1000 elementos): 776300 nanossegundos
Insercao aleatoria na Arvore AVL(10000 elementos): 4344200 nanossegundos
Resultado da busca do primeiro elemento(100 elementos): 5400 nanossegundos
Resultado da busca do primeiro elemento(1000 elementos): 2000 nanossegundos
Resultado da busca do primeiro elemento(10000 elementos): 2300 nanossegundos
Resultado da busca do último elemento(100 elementos): 1200 nanossegundos
Resultado da busca do último elemento(1000 elementos): 2800 nanossegundos
Resultado da busca do último elemento(10000 elementos): 2300 nanossegundos
Resultado da busca do valor do meio(100 elementos): 4000 nanossegundos
Resultado da busca do valor do meio(1000 elementos): 1900 nanossegundos
Resultado da busca do valor do meio(10000 elementos): 1600 nanossegundos
Resultado da busca de um valor aleatório(100 elementos): 1000 nanossegundos
Resultado da busca de um valor aleatório(1000 elementos): 1400 nanossegundos
Resultado da busca de um valor aleatório(10000 elementos): 2800 nanossegundos
Resultado da busca de um valor inexistente: 1400 nanossegundos
```

### 6. Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, adicionar novas funcionalidades ou corrigir problemas encontrados. Para contribuir:

- Faça um fork do repositório.
- Crie uma branch para sua contribuição: git checkout -b minha-contribuicao
- Faça commit das suas alterações: git commit -m "Minha contribuição"
- Faça push para a branch: git push origin minha-contribuicao
- Abra um pull request no GitHub.


## Autor

Wemerson Oliveira


## Aviso Legal

Este projeto foi desenvolvido para fins educacionais e de demonstração. Não é garantido para uso em ambientes de produção.

Essas instruções fornecem um guia detalhado sobre como usar o projeto, desde a clonagem do repositório até a execução do programa principal e análise dos resultados.

