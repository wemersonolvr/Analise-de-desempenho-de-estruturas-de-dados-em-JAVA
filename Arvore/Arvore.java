public class Arvore {
    No raiz;

    public Arvore() {
        this.raiz = null;
      }
    
      public void setRaiz(No raiz) {
        this.raiz = raiz;
      }
    
      public No getRaiz() {
        return this.raiz;
      }

      
    public void inserir(int valor){
        if(raiz == null){
            this.raiz = new No(valor);
        }else{
            inserir(valor, raiz);
        }
    }

    public void inserir(int valor, No raiz){
        if(valor < raiz.getValor()){
            if(raiz.getEsquerda() == null){
                raiz.setEsquerda(new No(valor));
            }else{
                inserir(valor, raiz.getEsquerda());
            }
        }if(valor > raiz.getValor()){
            if(raiz.getDireita() == null){
                raiz.setDireita(new No(valor));
            }
        }else{
            inserir(valor, raiz.getDireita());
        }
    }

    public No buscar(int valor){
        if(raiz == null){
            return null;
      } else{
            return buscar(raiz, valor);
      }
    }
      
    private No buscar(No atual, int valor){
         if(atual == null){
        return null;
    }
         if(atual.getValor() == valor){
            return atual;
         }else if(valor < atual.getValor()){
            return buscar(atual.getEsquerda(), valor);
         }else{
            return buscar(atual.getDireita(), valor);
         }
    }
}
