package desafios.desafio_05;

import javax.swing.JOptionPane;

public class CaixaEletronico2 {
	
	public static void main(String[] args) {
									
			int valor = 0;					
			
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Notas disponíveis:\nR$ 200, R$ 100, R$ 50, R$ 10, R$ 2\nInforme o valor que deseja sacar:", 
					"App Caixa Eletrônico", JOptionPane.INFORMATION_MESSAGE));
			
			while (valor <= 0 || valor%2 != 0) 			
				valor = Integer.parseInt(JOptionPane.showInputDialog
						(null, "Valor inválido.\nInforme novamente o valor que deseja sacar:"
								+ "\nNotas disponíveis: \nR$ 200, R$ 100, R$ 50, R$ 10, R$ 2", 
								"App Caixa Eletrônico", JOptionPane.ERROR_MESSAGE));
			
			Object[] possibleValues;
			
			if (valor%10 == 2) {
				possibleValues = new Object[1];
				possibleValues[0] = "Notas de [R$ 50,00] [R$ 10,00] [R$ 2,00]";
			}
			else {
				if (valor < 100 ) {
					possibleValues = new Object[1];
					possibleValues[0] = "Notas de [R$ 50,00] [R$ 10,00] [R$ 2,00]";
				}
				
				else if (valor%50 != 0 || valor < 200) {
					possibleValues = new Object[2];
					possibleValues[0] = "Notas de [R$ 50,00] [R$ 10,00] [R$ 2,00]";
					possibleValues[1] = "Notas de [R$ 100,00] [R$ 50,00] [R$ 10,00]";				
				}
				
				else {
					possibleValues = new Object[3];
					possibleValues[0] = "Notas de [R$ 50,00] [R$ 10,00] [R$ 2,00]";
					possibleValues[1] = "Notas de [R$ 100,00] [R$ 50,00] [R$ 10,00]";
					possibleValues[2] = "Notas de [R$ 200,00] [R$ 100,00] [R$ 50,00]";			
				}
			}
										
			
			Object t = JOptionPane.showInputDialog(null,
		             "Todas as opções listadas abaixo estão disponíveis:", "App Caixa Eletrônico",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
			
			if (t.toString().equals(possibleValues[0])) 
				//Para a possibilidade de notas de [R$ 50,00] [R$ 10,00] [R$ 2,00]
				processaSaque(valor, 50, 10, 2);			
			else if (t.toString().equals(possibleValues[1])) 
				//Para a possibilidade de notas de [R$ 100,00] [R$ 50,00] [R$ 10,00]
				processaSaque(valor, 100, 50, 10);
			else
				//Para a possibilidade de notas de [R$ 200,00] [R$ 100,00] [R$ 50,00]
				processaSaque(valor, 200, 100, 50);
				
				
		}
	
	
	private static void processaSaque(int valorDesejado, int opcao1, int opcao2, int opcao3 ) {
		
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
				
		int resto = 0;
		
		resto = valorDesejado%opcao1;
		nota1 = valorDesejado/opcao1;
		
		if (resto != 0) {
			nota2 = resto/opcao2;
			resto = resto%opcao2;
					
			if (resto != 0) {
				nota3 = resto/opcao3;				
			}							
		}
	
		JOptionPane.showMessageDialog(null, "Seu saque:\n"+nota1+" de R$ "+opcao1+"\n"
				+nota2+" de R$ "+opcao2+"\n"+nota3+" de R$ "+opcao3 , "Caixa Eletrônico", 
				JOptionPane.INFORMATION_MESSAGE);			
	}

}
