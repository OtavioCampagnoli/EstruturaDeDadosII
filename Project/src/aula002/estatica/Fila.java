package aula002.estatica;

import javax.swing.JOptionPane;

public class Fila {

    private int comeco;
    private int fim;
    private int total;
    private Object memo[];
    private int MAX;

    public Fila() {
        MAX = 100;
        memo = new Object[MAX];
        total = 0;
        comeco = 0;
        fim = 0;
    }

    public boolean qIsEmpty() {
        return (total == 0);
    }

    public boolean qIsFull() {
        return (total == MAX);
    }

    public void enqueue(Object x) {
        if (!qIsFull()) {
            memo[fim++] = x;
            fim %= MAX;
            total++;
        } else {
            JOptionPane.showMessageDialog(null, "Fila Cheia");
        }
    }

    public Object dequeue() {
        if (!qIsEmpty()) {
            Object resp = memo[comeco++];
            comeco %= MAX;
            total--;
            return resp;
        } else {
            return null;
        }
    }

    public String print() {
        String resp = "";
        if (!qIsEmpty()) {
            int copia = comeco;
            for(int i=0; i<total; i++) {
                resp += memo[copia++] + ", ";
                copia %= MAX;
            }
        } else {
            resp = "Fila Vazia";
        }

        return resp;
    }
}
