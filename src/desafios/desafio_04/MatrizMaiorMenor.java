package desafios.desafio_04;

import javax.swing.JOptionPane;

public class MatrizMaiorMenor {

	public static void main(String[] args) {
		
		int menor = 0;
		int maior = 0;
		
		final int TAM = 3;
		int matriz [][] = new int [TAM][TAM];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Informe um valor: "));
				
				if (i == 0 && j == 0) {
					menor = matriz[i][j];
					maior = matriz[i][j];
				}
					
				if(matriz[i][j] < menor)
					menor = matriz[i][j];
		         
		         if(matriz[i][j] > maior)
		            maior = matriz[i][j];
		        					
			}			
		}
		
		JOptionPane.showMessageDialog(null, "O maior valor é: "+maior+"\nO menor é: "+menor);


	}

}
