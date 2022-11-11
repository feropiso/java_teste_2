package unidade2;

import javax.swing.JOptionPane;

public class SucessorAnterior {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
		
		int ant = numero -1;
		
		int suc = numero + 1;
		
		JOptionPane.showMessageDialog(null, "O anterior é: "+ant+"\nO sucessor é: "+suc);
	}

}
