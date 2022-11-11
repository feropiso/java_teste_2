package desafios.desafio_02;

import javax.swing.JOptionPane;

public class SomaSequencia1 {

	public static void main(String[] args) {

		int total = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um numero: "));
		
		if (n <= 0)
			JOptionPane.showMessageDialog(null, "Valor inválido.");
		
		else {
			for (int i = 1; i <= n; i++ ) 
				total += i;
						
			JOptionPane.showMessageDialog(null, "Total : "+total);			
		}
		
	}

}
