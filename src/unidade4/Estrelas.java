package unidade4;

import javax.swing.JOptionPane;

public class Estrelas {

	public static void main(String[] args) {
		
		int numero = 0;
		String estrela = "*";
		
		numero = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe o número de estrelas:"));
		
		for (int i = 0; i < numero; i++) {			
			System.out.println(estrela);
			estrela = estrela + "*";
		}

	}

}
