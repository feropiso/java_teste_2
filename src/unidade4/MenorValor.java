package unidade4;

import javax.swing.JOptionPane;

public class MenorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe a quantidade da sequência: "));
		
		double valor = 0.0;
		double menor = 0.0;
				
		for (int i = 1; i <= quantidade; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Informe o "+i+"° valor:"));
			
			if(i == 1)				
				menor = valor;
						
			if(valor < menor)				
				menor = valor;				
		}
		
		JOptionPane.showMessageDialog(null, "O menor é: "+menor);

	}

}
