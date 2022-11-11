package unidade2;

import javax.swing.JOptionPane;

public class MediaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = calculaMedia();
		
		JOptionPane.showMessageDialog(null, "A media das notas é: "+media);		
	}
	
	public static double calculaMedia() {
		
		double valorTotal = 0.0;
		
		for (int i = 1; i <= 4; i++)
			valorTotal += Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a "+i+"° nota"));
		
		double media = valorTotal/4;
		
		return media;
	}

}
