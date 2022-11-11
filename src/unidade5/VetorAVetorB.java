package unidade5;

import javax.swing.JOptionPane;

public class VetorAVetorB {

	public static void main(String[] args) {
		
		final int TAM = 10;
		
		double vetorA [] = new double [TAM];
		double vetorB [] = new double [TAM];
		
		for (int i = 1; i <= TAM; i++) {
			vetorA[i-1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o "+i+"° valor:"));
			
			if (i % 2 == 0)
				vetorB[i-1] = 2*vetorA[i-1];
			
			else
				vetorB[i-1] = vetorA[i-1]/2;
			
		}
		
		System.out.println("O vetor B é:");
		
		for (int i = 0; i < TAM; i++) 		
			System.out.println("["+i+"] = "+vetorB[i]);
			

	}

}
