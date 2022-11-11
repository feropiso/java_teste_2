package unidade4;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um número:"));
		
		long resultado = fatorial(valor);
		
		JOptionPane.showMessageDialog(null, "O resultado de "+valor+"! é: "+resultado);
	}
	
	public static long fatorial(int n) {
		
		int fatorial = 1;

	    for (int i = 1; i <= n ; i ++ ) 
	      fatorial *= i;
	    
	    return fatorial;

	}

}
