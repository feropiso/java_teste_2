package unidade4;

import javax.swing.JOptionPane;

public class MostraTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 0;
		
		Object[] possibleValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};		
		
		Object valor = JOptionPane.showInputDialog(null,
	             "Informe um valor:", "Tabuada",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
		
		for (int i = 0; i <= 10; i++) {
			resultado = (Integer.parseInt(valor.toString()))*i;
			System.out.println(i+" X "+valor.toString()+" = "+resultado+"\n");
		}
	}

}
