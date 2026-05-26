/******************************************************************************

Leia uma matriz 3x3 e gere sua matriz transposta


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declarando variavel 
		int matriz[][] = new int[3][3];
		int matriz2 [][] = new int[3][3];
		int soma[][]=new int[3][3];
		
		// Colhendo informações
		System.out.println("\n--- Primeira Matriz----");
		for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
		
		System.out.println("\n--- Segunda Matriz----");
	    for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz2[i][y]=scanner.nextInt();
		    }
		}
		// Realizando a soma 
		for(int i=0;i<3;i++){
		    for(int y=0;y<3;y++){
		        soma[i][y]=(matriz[i][y]+matriz2[i][y]);
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(soma[i][y] + "\t");
            }
            System.out.println();
        }
	}
}
