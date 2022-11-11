package unidade4;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Quantos números você deseja tirar a média:"));
		
		double valorTotal = 0.0;
		
		for (int i = 1; i <= valor; i++)
			valorTotal += Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o "+i+"° número"));
		
		double media = valorTotal/valor;
		
		JOptionPane.showMessageDialog(null, "A média dos valores é: "+media);

	}

}
