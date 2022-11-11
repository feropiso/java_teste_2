package unidade3;

import javax.swing.JOptionPane;
import unidade2.MediaNota;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float frequencia = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a frequência em %: "));
		
		double media = MediaNota.calculaMedia();
		
		if (frequencia >= 75 && media >= 5.0)
			JOptionPane.showMessageDialog(null, "Aluno aprovado.");
		
		else
			JOptionPane.showMessageDialog(null, "Aluno reprovado.");	

	}

}
