package unidade2;

import javax.swing.JOptionPane;

public class ContaPizzaria {

	public static void main(String[] args) {
		
		float valorTotal = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o total da despesa em reais: "));
		int numeroPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o  numero de pessoas: "));
		
		float valorPraCada = valorTotal/numeroPessoas;
		
		JOptionPane.showMessageDialog(null, "O valor que cada um pagará é R$: "+valorPraCada);		
		

	}

}
