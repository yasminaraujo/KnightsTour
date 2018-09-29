public class Knight {
	static Board tour = new Board();
	static int contaBT =0;

	static int Contador (){
		return contaBT++;
	}

	//Verifica se o movimento está dentro do tabuleiro e se a casa não foi visitada
	static boolean validmove(int x, int y,int N, int resultado[][]) { 
        return (x >= 0 && x < N && y >= 0 && 
                y < N && resultado[x][y] == -1); 
    }

    //Chama a função de backtrack
	static void SolutionKT(int N) {
		   int sol [][]=  tour.matrizresultado(N);

		   int primeiro [] = tour.randomstart(N);

		   sol[primeiro[0]][primeiro[1]] = 0;
		   int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
	       int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
	       
	       boolean backtrack =  BacktrackKT(primeiro[0],primeiro[1], sol, 1, xMove,yMove,N);
	       
	        if (!backtrack) { 
	            System.out.println("Nao tem solucao"); 
	        } else
	            tour.imprime(sol,N); 	       	
	}

	//Função que realiza o backtrack
	static boolean BacktrackKT (int x, int y, int resultado[][], int movimento, int xMove[],int yMove[],int N) {
		   int xNext,yNext;
		   boolean nextvalid;
		   int cont;
		   if(movimento == N*N)
			   return true;
		  
		   for(int i=0; i<N; i++) {
			   xNext = x + xMove[i];
			   yNext = y + yMove[i];
			   
			   nextvalid = validmove(xNext,yNext,N,resultado);
			   if(nextvalid == true) {
				   resultado[xNext][yNext] = movimento;
				   Contador();
				   if(BacktrackKT(xNext,yNext,resultado,movimento + 1,xMove,yMove,N))
					   return true;
				   else{
				   		resultado[xNext][yNext] = -1;
				   	}
			   } 
		   }
		   return false;
	}
}