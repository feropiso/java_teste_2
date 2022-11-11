package unidade3;

import javax.swing.JOptionPane;

public class CatedoriaNadador {

	public static void main(String[] args) {
		
		int idade = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
		
		while (idade < 0 || idade > 100) 			
			idade = Integer.parseInt(JOptionPane.showInputDialog
					(null, "Informe sua idade novamente:", "Valor inválido",
				             JOptionPane.INFORMATION_MESSAGE));	
		
		if (idade >= 18)
			JOptionPane.showMessageDialog(null, "Adulto", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (idade >= 14 && idade <= 17)
			JOptionPane.showMessageDialog(null, "Juvenil B", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (idade >= 12 && idade < 14)
			JOptionPane.showMessageDialog(null, "Juvenil A", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (idade >= 9 && idade < 12)
			JOptionPane.showMessageDialog(null, "Infantil C", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else if (idade >= 6 && idade < 9)
			JOptionPane.showMessageDialog(null, "Infantil B", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);
		
		else
			JOptionPane.showMessageDialog(null, "Infantil A", "Categoria",
		             JOptionPane.INFORMATION_MESSAGE);

	}

}
