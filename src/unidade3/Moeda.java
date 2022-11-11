package unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor = 0.0;
		String simboloNota = "";
		
		Object[] possibleValues = {"Libras", "Dólar", "Euro"};		
		
		Object moeda = JOptionPane.showInputDialog(null,
	             "Informe a moeda que deseja converter:", "Câmbio",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o valor que deseja converter em reais (R$):", 
				"Câmbio", JOptionPane.INFORMATION_MESSAGE));
		
		while (valor <= 0) 			
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe novamente o valor que deseja converter em reais (R$):", 
					"Valor inválido", JOptionPane.INFORMATION_MESSAGE));
		
		switch(moeda.toString()) {
			case "Libras":
				valor = valor/5;
				simboloNota = "GBP $";
				break;
			case "Dólar":
				valor = valor/4;
				simboloNota = "US$";
				break;
			case "Euro":
				valor = valor/4.4;
				simboloNota = "E$";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Não foi possível converter" , "Câmbio", 
						JOptionPane.INFORMATION_MESSAGE);	
		}
		
		JOptionPane.showMessageDialog(null, "O valor da conversão é:\n"+simboloNota+" "+valor, "Câmbio", 
				JOptionPane.INFORMATION_MESSAGE);

	}

}
