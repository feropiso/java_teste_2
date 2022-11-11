package unidade3;

import javax.swing.JOptionPane;

//Recebe três números correspondentes a A, B e C;
//Calcula zeros da função de 2° grau.

public class ResolveEquacao {

	public static void main(String[] args) {
		
		double numero1 = 0.0;
		double numero2 = 0.0;
		double numero3 = 0.0;
		double raizum = 0.0;
		double raizdois = 0.0;		
		double delta = 0.0;

		numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de A: "));
		
		while (numero1 == 0) 			
			numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido."
					+ "\nDigite novamente o valor de A:"));			
		
		
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de B: "));
		
		numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de C: "));
		
		delta = (numero2*numero2) - (4*numero1*numero3);
		
		if (delta < 0)
			JOptionPane.showMessageDialog(null, "A função não possui raízes reais.");
					
		else {
			
			raizum = ((-numero2 - Math.sqrt(delta) )/(2*numero1));			
			raizdois = ((-numero2 + Math.sqrt(delta) )/(2*numero1));
			
			JOptionPane.showMessageDialog(null, "As raízes da função são:\nx1 = "+raizum+" e x2 = : "+raizdois);					
		}

	}


}
