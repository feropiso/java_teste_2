package unidade4;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um numero:"));
		
		if (ehPrimo(numero)) 
			JOptionPane.showMessageDialog(null, "O valor "+numero+" é um número primo.");
		
		else
			JOptionPane.showMessageDialog(null, "O valor "+numero+" não é um número primo.");
			

	}
	
	public static boolean ehPrimo(int numero) {
        
		for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

}
