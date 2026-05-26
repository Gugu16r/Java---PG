/******************************************************************************

Leia uma matriz 5x5 e exiba os elementos da diagonal secundária.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		
		for(int i=0;i<5;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<5;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 5; y++) {
                if(i+y==matriz.length){
                    System.out.println("Os valores da diagonal secundaria :"+matriz[i][y] + "\t");
                }
            }
            System.out.println();
        }
	}
}
