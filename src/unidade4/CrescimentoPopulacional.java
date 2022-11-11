package unidade4;

import javax.swing.JOptionPane;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		
		int anos = 0;
		double POPULACAO_A = 5000000;
		double POPULACAO_B = 7000000;
		
		while (POPULACAO_A < POPULACAO_B) {
			
			POPULACAO_A = POPULACAO_A + POPULACAO_A*0.03;
			POPULACAO_B = POPULACAO_B + POPULACAO_B*0.02;
			
			anos++;			
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de tempo em anos é: "+anos);

		

	}

}
