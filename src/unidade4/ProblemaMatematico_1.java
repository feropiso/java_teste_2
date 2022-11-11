package unidade4;

import javax.swing.JOptionPane;

public class ProblemaMatematico_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double posicao100 = formula(100);
		double posicao10000 = formula(10000);
		
		JOptionPane.showMessageDialog(null, "A posição 100 é: "+posicao100+
				"\nE a posição 10000 é: "+posicao10000);

	}
	
	public static double formula(double i) {
		return 3*i-2;
	}
		
	

}
