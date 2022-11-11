package desafios.desafio_02;

import javax.swing.JOptionPane;

public class SomaSequencia2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um numero: "));
				
		JOptionPane.showMessageDialog(null, "Total : "+soma(n));

	}
	
	public static int soma(int n) {
		
		if (n == 0)
			return 0;
		else
			return n + soma(n - 1);
	}

}
