package aula001;

/*Exercício Torre de Hanoi
 *  Objetivo: Transferir todos os discos de um pino ORIGEM, para um pino DESTINO;
 *  Utilizando um pino AUXILIAR;
 *  Um disco por vez (UM MOVIMENTO POR VEZ);
 * 
 *  OBS: Nunca colocar um disco menor embaixo de um disco maior;
 * 
 */
public class TorreDeHanoi {
    public static void main(String[] args) {
        int discos = 3;
        hanoi(discos, 'A', 'B', 'C');
    }
    // Função que para implementar a recursividade
    private static void hanoi(int discos, char pinoOrigem, char pinoAuxiliar, char pinoDestino) {
        
        if(discos > 0){
            hanoi(discos - 1, pinoOrigem, pinoDestino, pinoAuxiliar);// Levar da origem para o auxiliar (n - 1) discos;
            System.out.printf("Mover de %s para %s\n", pinoOrigem, pinoDestino);// movimento da origem para o destino;
            hanoi(discos - 1, pinoAuxiliar, pinoOrigem, pinoDestino);// chamada recursiva de n - 1 do auxiliar para o destino;           
        }
    }
}