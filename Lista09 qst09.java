
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Matriz 4x4 (índices vão de 0 a 3)
        int matriz[][] = new int[4][4];
        
        // Vetor para guardar os pares (pode ter até 16 elementos se todos forem pares)
        int par[] = new int[16]; 
        int contadorPares = 0; // Controlador para saber a posição livre no vetor 'par'
        
        // Obtendo dados da matriz
        for(int i = 0; i < 4; i++) { 
            System.out.println("Digite o valor Da Coluna "+(i+1)+" : ");
            for(int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a linha [" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                // Verifica se o número inserido é par
                if(matriz[i][j] % 2 == 0) {
                    par[contadorPares] = matriz[i][j]; // Guarda o valor correto
                    contadorPares++; // Avança para a próxima posição do vetor de pares
                }
            }
        }
        
        System.out.println("\n--- Números Pares Digitados ---");
        // Imprimindo apenas a quantidade de números pares que foram encontrados
        for(int i = 0; i < contadorPares; i++) {
            System.out.println("Par: " + par[i]);
        }
        
        if (contadorPares == 0) {
            System.out.println("Nenhum número par foi digitado.");
        }
    }
}
