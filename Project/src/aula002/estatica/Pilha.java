package aula002.estatica;

import javax.swing.JOptionPane;

public class Pilha {

    private final int MAX=30;
    private int topo;
    private Object memo[] = new Object[MAX];

    public Pilha() {
        topo = -1;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == MAX - 1);
    }

    public void push(Object x) {
        if (!isFull()) {
            topo++;
            memo[topo] = x;
        } else {
            JOptionPane.showMessageDialog(null, "Pilha Cheia");
        }
    }

    public void print() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += memo[i].toString() + ", ";
            }
            JOptionPane.showMessageDialog(null, "P:[" + msg + "]");

        } else {
            JOptionPane.showMessageDialog(null, "Pilha Vazia");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }
}
