package unidade4;

import javax.swing.JOptionPane;

//Fibonacci

public class ProblemaMatematico_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long posicao100 = fibonacci(100);
		long posicao10000 = fibonacci(10000);
		
		JOptionPane.showMessageDialog(null, "A posição 100 é: "+posicao100+
				"\nE a posição 10000 é: "+posicao10000);

	}
	
	static long fibonacci(int n) {
		
        int atual = 0;     
        int anterior = 0;   

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
            	atual = 1;
            	anterior = 0;
            } else {
            	atual += anterior;
            	anterior = atual - anterior;
            }
        }

        return atual;
    }


}
