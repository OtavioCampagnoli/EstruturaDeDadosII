package aula002.dinamica;

public class Fila {

    private Node comeco;	//Comeco da Fila
    private Node fim;		//Fim da Fila
    private int total;		//Contador de elementos

    public Fila() {
        comeco = null;
        fim = null;
        total = 0;
    }

    public boolean isEmpty() {
        return (total == 0);
    }

    public void enqueue(Object x) {
        Node novo = new Node();     //Cria um novo nó
        novo.setDado(x);            //Coloca o dado dentro do nó
        novo.setProx(null);         //Como esse será o último,não tem próximo
        if (isEmpty()) {
            comeco = novo;      //Como estava vazia, esse nó será começo e fim
            fim = comeco;
        } else {
            fim.setProx(novo);      //Depois do fim da fila atual, o novo nó
            fim = novo;		    //O novo fim é o novo nó
        }
        total++;		    //Incrementa o número de elementos
    }

    public Object dequeue() {
        Object resp = null;
        if (!isEmpty()) {
            resp = comeco.getDado();	//Captura o dado do começo da Fila
            comeco = comeco.getProx();  //O começo anda para o próximo
            total--;			//Decrementa número de elementos
            return resp;
        }
        return resp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            Node aux;
            String saida = "";
            aux = comeco;
            while (aux != null) {
                saida += aux.getDado().toString() + ", ";
                aux = aux.getProx();
            }
            System.out.println("F:[ " + saida + "]");
        }
    }
}
