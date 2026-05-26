/******************************************************************************

Leia uma matriz 4x4 e mostre a soma de todos os elementos.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int soma=0;
		
		for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		        soma+=matriz[i][y];
		    }
		}
		// Impressão dos valores
		System.out.println("A soma dos valores ficou igual: "+soma);
	
	    
	}
}
