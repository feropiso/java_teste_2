package unidade5;

public class MatrizIdentidade {

	public static void main(String[] args) {
		
		final int TAM = 3;
		int matrizIdentidade [][] = new int [TAM][TAM];
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				
				if(i == j)
					matrizIdentidade [i][j] = 1;
				
				else
					matrizIdentidade [i][j] = 0;
					
			}			
		}
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				
				System.out.print(matrizIdentidade [i][j]+"\t");					
			}
			System.out.println();
		}

	}

}
