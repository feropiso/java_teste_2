package unidade3;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		double peso = 0.0;
		double altura = 0.0;
		double pesoIdeal = 0.0;
				
		Object[] possibleValues = {"M", "F"};		
		
		Object sexo = JOptionPane.showInputDialog(null,
	             "Informe seu sexo:", "Sexo",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso:"));
		
		while (peso <= 0)
			peso = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Informe seu peso novamente:", "Valor inválido",
		             JOptionPane.INFORMATION_MESSAGE));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura:"));
		
		while (altura <= 0 || altura > 2.75)
			altura = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Informe sua altura novamente:", "Valor inválido",
		             JOptionPane.INFORMATION_MESSAGE));
		
		if (sexo.toString() == possibleValues[0]) 
			pesoIdeal = (72.7*altura)-58;
						
		else 
			pesoIdeal = (62.1*altura)-44.7;
		
		JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+pesoIdeal);			

	}

}
