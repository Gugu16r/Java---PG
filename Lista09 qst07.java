/******************************************************************************

Leia uma matriz quadrada e calcule a soma da diagonal principal.
       
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[2][2];
		int soma[]=new int[2];
		
		for(int i=0;i<2;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<2;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		        
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                if(i==y){
                    soma[i]+=matriz[i][y];
                    System.out.println("Os valores da soma da diagonal principal :"+soma[i]+ "\t");
                }
            }
            System.out.println();
        }
	}
}