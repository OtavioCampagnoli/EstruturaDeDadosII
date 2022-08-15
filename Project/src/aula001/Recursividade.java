package aula001;
import javax.swing.JOptionPane;

public class Recursividade {
    public int fatorialRecursivo(int n){
        if(n == 0) // Caso for 0 irá retornar 1
            return 1;
        return n * fatorialRecursivo(n - 1);
        // Ele irá retornar por exemplo caso o numero que eu queira fatorar for:
        // 5 * (5-1) = 5 * 4; Até chegar no zero;
        
    }

    public static void main(String[] args) {
    
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número que deseja fatorar."));
    // Criar um objeto Recursividade;
    Recursividade b = new Recursividade();
    n = b.fatorialRecursivo(n);
    //Mostrar resultado
    JOptionPane.showMessageDialog(null, "O fatorial é: "+ n);

    }
}
