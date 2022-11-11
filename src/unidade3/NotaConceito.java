package unidade3;

import javax.swing.JOptionPane;

public class NotaConceito {

	public static void main(String[] args) {
				
		double nota = 0.0;
		
		nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua nota: "));
		
		while (nota < 0 || nota > 100) 			
			nota = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Informe a nota novamente:", "Valor inválido",
				             JOptionPane.INFORMATION_MESSAGE));	
		
		if (nota >= 90)
			JOptionPane.showMessageDialog(null, "Excelente", "Conceito",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (nota >= 70 && nota < 90)
			JOptionPane.showMessageDialog(null, "Bom", "Conceito",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (nota >= 50 && nota < 70)
			JOptionPane.showMessageDialog(null, "Regular", "Conceito",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else
			JOptionPane.showMessageDialog(null, "Insuficiente", "Conceito",
		             JOptionPane.INFORMATION_MESSAGE);


	}

}
