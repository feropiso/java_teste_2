package unidade3;

import javax.swing.JOptionPane;

public class CaixaEletrônico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota10 = 0;
		int nota50 = 0;
		int nota100 = 0;		
		int resto = 0;
		int valor = 0;		
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Informe o valor que deseja sacar:\nNotas disponíveis: R$ 10, R$ 50, R$ 100 ", 
				"Caixa Eletrônico", JOptionPane.INFORMATION_MESSAGE));
		
		while (valor <= 0 || valor > 3000 || valor%10 != 0) 			
			valor = Integer.parseInt(JOptionPane.showInputDialog
					(null, "Informe o valor que deseja sacar novamente:"
							+ "\nNotas disponíveis: R$ 10, R$ 50, R$ 100 ", "Valor inválido", 
							JOptionPane.INFORMATION_MESSAGE));
		
		resto = valor%100;
		nota100 = valor/100;
		
		if (resto != 0) {
			nota50 = resto/50;
			resto = resto%50;
			
			if (resto != 0) 
				nota10 = resto/10;		
			
		}
		
		JOptionPane.showMessageDialog(null, "Seu saque:\n"+nota100+" de R$ 100\n"
				+nota50+" de R$ 50\n"+nota10+" de R$ 10" , "Caixa Eletrônico", 
				JOptionPane.INFORMATION_MESSAGE);	

	}

}
