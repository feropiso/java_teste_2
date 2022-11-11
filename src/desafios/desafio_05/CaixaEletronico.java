package desafios.desafio_05;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int nota50 = 0;
		int nota100 = 0;
		int nota200 = 0;		
		int resto = 0;
		int valor = 0;		
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Informe o valor que deseja sacar:\nNotas disponíveis: R$ 50, R$ 100, R$ 200 ", 
				"Caixa Eletrônico", JOptionPane.INFORMATION_MESSAGE));
		
		while (valor <= 0 || valor%50 != 0) 			
			valor = Integer.parseInt(JOptionPane.showInputDialog
					(null, "Informe o valor que deseja sacar novamente:"
							+ "\nNotas disponíveis: R$ 50, R$ 100, R$ 200 ", "Valor inválido", 
							JOptionPane.INFORMATION_MESSAGE));
		
		resto = valor%200;
		nota200 = valor/200;
		
		if (resto != 0) {
			nota100 = resto/100;
			resto = resto%100;
			
			if (resto != 0) 
				nota50 = resto/50;			
		}
		
		JOptionPane.showMessageDialog(null, "Seu saque:\n"+nota200+" de R$ 200\n"
				+nota100+" de R$ 100\n"+nota50+" de R$ 50" , "Caixa Eletrônico", 
				JOptionPane.INFORMATION_MESSAGE);	

	}

}
