public class No {
    No esquerda;
    No direita;
    int valor;

    public No(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public int getValor(){
        return this.valor;
    }
    public No getEsquerda(){
        return this.esquerda;
    }
    public No getDireita(){
        return this.direita;
    }



    public void setValor(int valor){
        this.valor = valor;
    }
    public void setEsquerda(No esquerda){
        this.esquerda = esquerda;
    }   
    public void setDireita(No direita){
        this.direita = direita;
    }
}

