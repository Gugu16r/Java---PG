
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Matriz 4x4 (índices vão de 0 a 2)
        int matriz[][] = new int[3][3];
        
        //  para multiplicação 
        int mult[][] = new int[3][3];
        
        
        // Obtendo dados da matriz
        for(int i = 0; i < 3; i++) { 
            System.out.println("Digite o valor Da Coluna "+(i+1)+" : ");
            for(int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a linha [" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                mult[i][j] = matriz[i][j]*3;// Realiza a multiplicação
                
            }
        }
        
         // Impressão dos valores
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mult[i][j] + "\t");
            }
            System.out.println();
    }
}
}
