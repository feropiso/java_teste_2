package unidade2;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15, 18, 22, 
		Object[] possibleValues = { 15, 18, 22 };
		
		float preco_jantar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do jantar:"));
		Object t = JOptionPane.showInputDialog(null,
	             "Escolha:", "Input",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		
		float preco_total = preco_jantar + preco_jantar*(Float.parseFloat(t.toString())/100);
		
		JOptionPane.showMessageDialog(null, "O preço final do jantar ficou em: R$ "+preco_total);
		  
	}

}
