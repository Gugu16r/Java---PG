import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        // Inicializar tabuleiro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        char jogador = 'X';
        boolean vencedor = false;

        // Até 9 jogadas
        for (int jogada = 0; jogada < 9; jogada++) {

            mostrarTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogador);

            System.out.print("Linha (0 a 2): ");
            int linha = sc.nextInt();

            System.out.print("Coluna (0 a 2): ");
            int coluna = sc.nextInt();

            // Verificar posição ocupada
            if (tabuleiro[linha][coluna] != '-') {
                System.out.println("Posição ocupada!");
                jogada--;
                continue;
            }

            // Inserir jogada
            tabuleiro[linha][coluna] = jogador;

            // Verificar vencedor
            if (verificarVencedor(tabuleiro, jogador)) {

                mostrarTabuleiro(tabuleiro);

                System.out.println("Jogador " + jogador + " venceu!");
                vencedor = true;
                break;
            }

            // Trocar jogador
            if (jogador == 'X') {
                jogador = 'O';
            } else {
                jogador = 'X';
            }
        }

        if (!vencedor) {
            mostrarTabuleiro(tabuleiro);
            System.out.println("Empate!");
        }

        sc.close();
    }

    // Mostrar tabuleiro
    public static void mostrarTabuleiro(char[][] t) {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    // Verificar vencedor
    public static boolean verificarVencedor(char[][] t, char j) {

        // Linhas
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == j && t[i][1] == j && t[i][2] == j) {
                return true;
            }
        }

        // Colunas
        for (int i = 0; i < 3; i++) {
            if (t[0][i] == j && t[1][i] == j && t[2][i] == j) {
                return true;
            }
        }

        // Diagonal principal
        if (t[0][0] == j && t[1][1] == j && t[2][2] == j) {
            return true;
        }

        // Diagonal secundária
        if (t[0][2] == j && t[1][1] == j && t[2][0] == j) {
            return true;
        }

        return false;
    }
}