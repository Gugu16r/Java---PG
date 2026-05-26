/******************************************************************************

Leia uma matriz 3x3 e gere sua matriz transposta


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declarando variavel 
		int matriz[][] = new int[2][2];
		int matriz2 [][] = new int[2][2];
		int multi[][]=new int[2][2];
		
		// Colhendo informações
		System.out.println("\n--- Primeira Matriz----");
		for(int i=0;i<2;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<2;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
		
		System.out.println("\n--- Segunda Matriz----");
	    for(int i=0;i<2;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<2;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz2[i][y]=scanner.nextInt();
		    }
		}
		// Realizando a soma 
		for(int i=0;i<2;i++){
		    for(int y=0;y<2;y++){
		        multi[i][y]=(matriz[i][y]*matriz2[i][y]);
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("Matriz 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(multi[i][y] + "\t");
            }
            System.out.println();
        }
	}
}
