/******************************************************************************

Leia uma matriz 5x5 e informe:
● o maior valor
● a linha e coluna onde ele aparece


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		int maior=0;
		int posl=0;
		int posc=0;
		
		for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		        
		        
		        if(matriz[i][y]>maior){
		            maior=matriz[i][y];
		            posl=y;
		            posc=i;
		        }
		    }
		}
	
	    // Impressão dos valores
	    System.out.println("O maior valor digitado foi: "+maior+" Na linha: "+posl+" Na Coluna: "+posc);
	    System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz[i][y] + "\t");
            }
            System.out.println();
        }
	}
}
