package unidade3;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		
		double X = 0.0;
		double Y = 0.0;
		double Z = 0.0;
		final int TAM = 3;
		
		double lados [] = new double [TAM];
		
		for (int i = 1; i <= 3; i++)
			lados[i-1] = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe o "+i+"° lado:", "Triângulo",
		             JOptionPane.INFORMATION_MESSAGE));
						
		X = lados[0] + lados[1];
		
		Y = lados[0] + lados[2];
		
		Z = lados[1] + lados[2];
		
		if (X > lados[2] && Y > lados[1] && Z > lados[0]) {
			
			if (lados[0] == lados[1] && lados[0] == lados[2])
				JOptionPane.showMessageDialog(null, "Podem ser lados de um triângulo."
						, "Triângulo Equilátero", JOptionPane.INFORMATION_MESSAGE);
			
			else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2])
				JOptionPane.showMessageDialog(null, "Podem ser lados de um triângulo.", "Triângulo Isósceles",
		             JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Podem ser lados de um triângulo.", "Triângulo Escaleno",
		             JOptionPane.INFORMATION_MESSAGE);		
		}
			
		else
			JOptionPane.showMessageDialog(null, "Não podem ser lados de um triângulo.");
			
	}

}
