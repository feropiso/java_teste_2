package unidade2;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int minuto15 = 2;
		
		int duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tempo total de acesso em minutos: "));
		
		int resto = duracao%15;
		
		int valor = duracao/15;
		
		valor = valor*minuto15;
		
		if (resto > 0)
			valor = valor + minuto15;
		
		JOptionPane.showMessageDialog(null, "O total a pagar é R$: "+valor);
		

	}

}
