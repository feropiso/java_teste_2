package unidade4;

import javax.swing.JOptionPane;

public class NumeroDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor = 0.0;
		double valorDecrescente = 0.0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe um valor: "));
		
		valorDecrescente = valor;
		
		for (int i = 0; i <= valor; i++) {			
			System.out.println(valorDecrescente);
			valorDecrescente--;
		}			

	}

}
