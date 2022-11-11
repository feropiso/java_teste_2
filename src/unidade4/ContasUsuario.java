package unidade4;

import javax.swing.JOptionPane;

public class ContasUsuario {

	public static void main(String[] args) {
		
		int cont = 0;
		double auxiliar = 0.0;
		double total = 0.0;
		
		while (true) {
			auxiliar = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Informe o valor em reais (R$) da conta:\nOu Digite -1 para sair." ));
			
			if (auxiliar == -1)
				break;
			
			total += auxiliar;
			
			cont++;			
		}
		
		JOptionPane.showMessageDialog(null, "O número de contas foi: "+cont+"\nSeu total deu: R$ "+total);
		
		

	}

}
