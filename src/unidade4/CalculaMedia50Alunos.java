package unidade4;
import javax.swing.JOptionPane;

import unidade2.MediaNota;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ALUNOS = 50;
		
		double mediaGeral = 0.0;
		
		for (int i = 1; i <= ALUNOS; i++) {
			JOptionPane.showMessageDialog(null, "Informe as notas do "+i+"° aluno:");
			mediaGeral += MediaNota.calculaMedia();
		}
		
		mediaGeral = mediaGeral/ALUNOS;
		
		JOptionPane.showMessageDialog(null, "A média geral é: "+mediaGeral);
			
		
	}
}
