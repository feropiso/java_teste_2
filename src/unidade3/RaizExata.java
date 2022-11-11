package unidade3;

import javax.swing.JOptionPane;

public class RaizExata {

	public static void main(String[] args) {
		
		double valor = 0.0;
		double raiz = 0.0;
		double raiz_arredondada = 0;
				
		valor = Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe um valor para calculara a raiz: "));
		
		raiz = Math.sqrt(valor);		
		
		raiz_arredondada = Math.round(raiz);
		
		if (raiz == raiz_arredondada)
			JOptionPane.showMessageDialog(null, "Existe raiz exata para "+valor+"\nÉ igual a: "+raiz);			
		else
			JOptionPane.showMessageDialog(null, "Não existe raiz exata para "+valor);
		
		

	}

}
