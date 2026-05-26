/******************************************************************************

Leia uma matriz 4x4 e mostre a soma de cada linha.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int soma[]=new int[4];
		
		for(int i=0;i<4;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<4;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		        
		        soma[i]+=matriz[i][y];
		    }
		}
		// Impressão dos valores
	    System.out.println("\nSoma de cada linha:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + (i + 1) + ": " + soma[i]);
            }
		
	
	    
	}
}
