package unidade4;

import javax.swing.JOptionPane;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor = 0.0;
		double menor = 0.0;
		double maior = 0.0;
		
		for (int i = 1; i <= 10; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog
					(null, "Informe o "+i+"° valor:"));
			
			if(i == 1){				
				maior = valor;
				menor = valor;
			}
			
			if(valor > maior)				
				maior = valor;
			
			
			if(valor < menor)				
				menor = valor;				
		}
		
		JOptionPane.showMessageDialog(null, "O maior valor é: "+maior+"\nO menor é: "+menor);
	}

}
