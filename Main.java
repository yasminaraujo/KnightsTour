import java.util.Random;

public class Main{
		public static void main(String[] args) {
		long tempoInicio = System.currentTimeMillis();
		Knight knight = new Knight();	
		knight.SolutionKT(8);
		System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio)+ "ms");
		System.out.println("Casas VIsitadas:" + knight.contaBT);						
	}
}