package unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MatrizIdentidadeReafatorado {

	public static void main(String[] args) throws IOException {
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
		
		FileWriter 	arq = new FileWriter("matriz_identidade.txt");
		
		PrintWriter gravaarq = new PrintWriter(arq);
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				
				gravaarq.print(matrizIdentidade [i][j]+"\t");					
			}
			gravaarq.println();
		}
		
		arq.close();
		gravaarq.close();

	}

}
