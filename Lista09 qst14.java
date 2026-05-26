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
	    boolean identidade = true;
		
		// Colhendo informações
		System.out.println("\n--- Matriz----");
		for(int i=0;i<3;i++){
		    System.out.println("Coluna "+(i+1));
		    for(int y=0;y<3;y++){
		        System.out.println("Digite o valor da linha "+(y+1));
		        matriz[i][y]=scanner.nextInt();
		    }
		}
		
		
		// Verificar a matriz  
		for(int i=0;i<3;i++){
		    for(int y=0;y<3;y++){
		        if (i == y){
		            if(matriz[i][y] != 1){
		                identidade=false;
		            }
		        }
		        else{
		            if(matriz[i][y] !=0){
		                identidade =false;
		            }
		        }
		    }
		}
		// Impressão dos Resulatados 
		if (identidade) {
            System.out.println("A matriz é identidade!!");
        } else {
            System.out.println("A matriz NÃO é identidade!!");
        }
	
	} 
}
