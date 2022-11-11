package unidade4;

import javax.swing.JOptionPane;

public class ParesSequencia {

	public static void main(String[] args) {
		
		int numeroA = 0;
		int numeroB = 0;
		
		numeroA = Integer.parseInt(JOptionPane.showInputDialog (null, "Informe um valor A:"));
		
		while (numeroA <= 0) 			
			numeroA = Integer.parseInt(JOptionPane.showInputDialog (null, "Informe novamente um valor A:", 
					"Valor inválido", JOptionPane.INFORMATION_MESSAGE));
		
		numeroB = Integer.parseInt(JOptionPane.showInputDialog (null, "Informe um valo B:"));
		
		while (numeroB <= 0) 			
			numeroB = Integer.parseInt(JOptionPane.showInputDialog (null, "Informe novamente um valor B:", 
					"Valor inválido", JOptionPane.INFORMATION_MESSAGE));
		
		System.out.println("Os valores pares entre "+numeroA+" E "+numeroB);
		
		for (int i = numeroA; i <= numeroB; i++) {
			
			if (i % 2 == 0)
				System.out.println(i+"\n");
		}

	}

}
