package unidade2;

import javax.swing.JOptionPane;

public class FormaDePagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog
				(null, "Informe o preço do produto em reais: "));
		
		float valorParcela = valorProduto/3;
		
		double valorDescontado = valorProduto - valorProduto*0.1;
		
		JOptionPane.showMessageDialog(null, "As duas opções "
				+ "de pagamento são :\n Á vista: R$"+valorDescontado+"\n Parcelado: 3x de R$ "+valorParcela);
	}

}
