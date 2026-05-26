/******************************************************************************
Busca em matriz
Leia uma matriz 6x6 e um número X.
Informe:
● se X existe na matriz



*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declarando variavel 
		int matriz[][] = new int[6][6];
		int x;
		boolean encontrou = false;
		
		// Colhendo informações
		System.out.println("\n---  Matriz 6x6----");
		for(int i=0;i<6;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<6;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
		// Busca informações
		System.out.println("Informe o valor de X :");
		x=scanner.nextInt();
		
		// Realizando a verificação 
		for(int i=0;i<6;i++){
		    for(int y=0;y<6;y++){
		        if(matriz[i][y]==x){
		           encontrou = true;
		        }
		    }
		}
	
	     // Resultado
        if (encontrou) {
            System.out.println("X existe na matriz");
        } else {
            System.out.println("X não existe na matriz");
        }
	}
}
