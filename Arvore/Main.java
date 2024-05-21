public class Main{
    public static void main (String[] args){

        Arvore arvore = new Arvore();

        arvore.inserir(4);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(8);
        arvore.inserir(10);
        

        System.out.println(arvore.buscar(4));
        
    }

}