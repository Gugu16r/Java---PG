/******************************************************************************

Leia uma matriz 3x3 de números inteiros e exiba-a no formato matricial.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		
		for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[i][y] + "\t");
            }
            System.out.println();
        }
	}
}
