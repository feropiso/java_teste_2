package unidade3;

import javax.swing.JOptionPane;

public class PagamentoProduto {

	public static void main(String[] args) {
		
		String aux = "";
		double valor = 0.0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Informe o preço do produto em reais (R$):", 
				"Pagamento", JOptionPane.INFORMATION_MESSAGE));
		
		while (valor <= 0) 			
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe novamente o preço do produto em reais (R$):", 
					"Valor inválido", JOptionPane.INFORMATION_MESSAGE));
		
		
		Object[] possibleValues = {"À vista em dinheiro ou cheque - 10 % de desconto", 
				"À vista no cartão de crédito - 5 % de desconto", 
				"Em 2 vezes - sem juros", "Em 3 vezes - juros de 10 %"};		
		
		Object escolha = JOptionPane.showInputDialog(null,
	             "Escolha a forma de pagamento:", "Formas de pagamento",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		
		switch(escolha.toString()) {
			case "À vista em dinheiro ou cheque - 10 % de desconto":
				valor = valor - valor*0.1;				
				break;
			case "À vista no cartão de crédito - 5 % de desconto":
				valor = valor - valor*0.05;				
				break;
			case "Em 2 vezes - sem juros":
				aux = "2 x de ";
				valor = valor/2;				
				break;
			case "Em 3 vezes - juros de 10 %":
				aux = "3 x de ";
				valor = valor + valor*0.1;	
				valor = valor/3;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Não foi possível processar pagamento." , "Pagamento", 
						JOptionPane.INFORMATION_MESSAGE);	
		}
	
		JOptionPane.showMessageDialog(null, "O valor do produto:\n "+aux+"R$ "+valor, "Pagamento", 
			JOptionPane.INFORMATION_MESSAGE);

	}

}
