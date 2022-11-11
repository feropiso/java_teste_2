package unidade2;

import javax.swing.JOptionPane;

public class CalculaHorasDeViagem {

	public static void main(String[] args) {
		
		final int DIA_EM_HORAS = 24;
		
		int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dias: "));
		int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de horas: "));
		
		int total = horas + dias*DIA_EM_HORAS;
		
		JOptionPane.showMessageDialog(null, "A duração da viagem em horas é: "+total);

	}

}
