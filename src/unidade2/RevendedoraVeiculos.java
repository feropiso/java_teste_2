package unidade2;

import javax.swing.JOptionPane;

public class RevendedoraVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo = JOptionPane.showInputDialog (null, "Informe o modelo do veículo: ");
		
		double precoVeiculo = Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe o preço do veículo R$: "));
		
		double entrada = precoVeiculo*0.5;
		
		double valorParcela = entrada/12;
		
		JOptionPane.showMessageDialog(null, "Veículo: "+titulo+"\nEntrada R$:  "
				+ ""+entrada+"\nRestante em: 12 x de R$"+valorParcela);

	}

}
