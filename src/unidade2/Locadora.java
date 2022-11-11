package unidade2;

import javax.swing.JOptionPane;

public class Locadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo = JOptionPane.showInputDialog (null, "Informe titulo do filme: ");
		
		float duracaoHoras = Float.parseFloat(JOptionPane.showInputDialog
				(null, "Informe a duração do filme em horas: "));
		
		float duracaoMinutos = Float.parseFloat(JOptionPane.showInputDialog
				(null, "Informe a duração do filme em minutos: "));
		
		duracaoMinutos = duracaoMinutos + duracaoHoras*60;
		
		JOptionPane.showMessageDialog(null, "O filme:  "+titulo+"\nDuração:  "+duracaoMinutos+" minutos");

	}

}
