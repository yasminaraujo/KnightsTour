import java.util.Random;

public class Board {
	public static int [][] tabuleiro;
	public static int [] start = new int[2];

	static int[][] tamanho (int N) {
		tabuleiro = new int [N][N];
		return tabuleiro;
	}

	static int [] randomstart (int N) {
		Random gerador = new Random();
		start[0]= gerador.nextInt(N);
		start[1] = gerador.nextInt(N);
		return start;
	} 

    static int[][] matrizresultado (int N){
		int resultado[][] = tamanho(N);
		for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++){ 
                resultado[x][y] = -1;
            }
        }
		 return resultado;

	}

	static void imprime (int matriz[][],int N) { 
	        for (int i = 0; i < N; i++) { 
	            for (int j = 0; j < N; j++) 
	                System.out.print((matriz[i][j]) + " "); 
	            System.out.println(); 
	        }
	   }
}
