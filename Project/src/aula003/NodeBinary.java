package aula003;

import java.util.ArrayList;

public class NodeBinary < T >  
{
    // declarando atributo do nó
    private T raiz;
    private NodeBinary<T> pai; 
    private final ArrayList<NodeBinary<T>> filho; //Ultimo folha da arvore

    public NodeBinary(T raiz)
    {
        this.raiz = raiz;
        filho = new ArrayList<>();
    }
    //Adicionado Filho
    public NodeBinary<T> addFilho(T filho)
    {
        NodeBinary<T> noFilho = new NodeBinary<T>(filho);
        noFilho.pai = this; // Todo noFilho vêm do no pai;
        this.filho.add(noFilho);
        return noFilho;

    } 
    //Método acessor
    public T getRaiz()
    {
        return this.raiz;
    }
    // Verificar se eh Raiz!
    public boolean ehRaiz()
    {   
        if(pai == null)
        
            return true; // Se ele não tem pai ele é a raiz com menor nivel(raiz primária)
        else
            return false;
    }

    // Verifica se filho é folha(filho estério); 
    public boolean ehFolha()
    {   
        if(filho.size() == 0)
            return true;
        else
            return false;
    }
    // Adiciona um nivel caso nao seja raiz; 
    public int getNivel()
    {
        if(this.ehRaiz())
            return 0;
        else
            return pai.getNivel() + 1;
    }

    @Override
    public String toString()
    {
        if(raiz != null)
        
            return raiz.toString();
        
        else
            return "null";
    }
   

   
}