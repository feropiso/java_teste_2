package unidade4;

import javax.swing.JOptionPane;

public class ExponencialSerieTaylor {

	public static void main(String[] args) {
		
		double resultado = 0.0;
		double expoente = 0.0;
		
		expoente = Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe o expoente da fução:"));
		
		for (int i = 1; i <= 50; i++) 
			resultado += Math.pow(expoente, i)/i;
		
		JOptionPane.showMessageDialog(null, "O resultado de e^"+expoente+": "+resultado);

	}

}
